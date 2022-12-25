package com.belajar.springdasar;

import com.belajar.springdasar.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DuplicateTest {
    static ApplicationContext context = new AnnotationConfigApplicationContext(DuplicateConfiguration.class);
    @Test
    void testDuplicate() {
        // #1
        // will show error : expected single matching bean but found 2: foo1,foo2
        // Foo foo = context.getBean(Foo.class);

        // #2
        // test passed if the bean have NoUniqueBeanDefinitionException or have more than one bean.
        Assertions.assertThrows(NoUniqueBeanDefinitionException.class, () -> {
            Foo foo = context.getBean(Foo.class);
        });
    }

    @Test
    void getBean() {
        Foo foo1 = context.getBean("foo1", Foo.class);
        Foo foo2 = context.getBean("foo2", Foo.class);

        // test passed if
        Assertions.assertNotSame(foo1, foo2);
    }
}
