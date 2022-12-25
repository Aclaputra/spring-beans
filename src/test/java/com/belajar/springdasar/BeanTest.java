package com.belajar.springdasar;

import com.belajar.springdasar.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanTest {
    static ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);

    /**
     * test if bean is created or not.
     */
    @Test
    void testCreateBean() {
        Assertions.assertNotNull(context);
    }

    /**
     * test if beans are singleton.
     */
    @Test
    void testGetBean() {
        Foo fooBean1 = context.getBean(Foo.class);
        Foo fooBean2 = context.getBean(Foo.class);

        Assertions.assertSame(fooBean1, fooBean2);
    }

}
