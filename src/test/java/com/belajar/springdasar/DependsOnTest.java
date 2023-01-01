package com.belajar.springdasar;

import com.belajar.springdasar.data.Foo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependsOnTest {
    private ApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(DependsOnConfiguration.class);
    }
    @Test
    void testDependsOn() {
        // it will not create bean at startup because its @lazy (only if called)
        Foo foo = applicationContext.getBean(Foo.class);

    }
}
