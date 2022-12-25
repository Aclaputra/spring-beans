package com.belajar.springdasar;

import com.belajar.springdasar.data.Foo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class BeanConfiguration {

  /** bean stored in singleton
   * membuat 1 bean di dalam 1 configuration
   */
  @Bean
  public Foo foo() {
    Foo foo = new Foo();
    log.info("Create new foo");
    return foo;
  }
}
