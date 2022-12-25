package com.belajar.springdasar;

public class Database {

  private static Database database;

  public static Database getInstance() {
    if (database == null) {
      database = new Database();
    }
    return database;
  }

  private Database() {
    // cannot run
  }
}
