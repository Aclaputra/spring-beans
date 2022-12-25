package com.belajar.springdasar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DatabaseTest {

  @Test
  void testSingleton() {
    // cannot use new because we used private
    // var database1 = new Database();
    var database1 = Database.getInstance();
    var database2 = Database.getInstance();

    // proving if annotations on spring are singleton
    Assertions.assertSame(database1, database2);
  }
}
