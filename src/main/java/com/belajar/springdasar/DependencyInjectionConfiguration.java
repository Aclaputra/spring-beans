package com.belajar.springdasar;

import com.belajar.springdasar.data.Bar;
import com.belajar.springdasar.data.Foo;
import com.belajar.springdasar.data.FooBar;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

public class DependencyInjectionConfiguration {
    @Primary
    @Bean
    public Foo foo() {
        return new Foo();
    }

    @Bean
    public Foo fooSecond() {
        return new Foo();
    }

    @Bean
    public Bar bar() {
        return new Bar();
    }

    /**
     * if not using qualifier it will get the primary bean.
     * use @qualifier to get specific bean.
     * @param foo
     * @param bar
     * @return
     */
    @Bean
    public FooBar fooBar(@Qualifier("fooSecond") Foo foo, Bar bar) {
        return new FooBar(foo, bar);
    }

}

