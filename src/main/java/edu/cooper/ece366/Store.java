package edu.cooper.ece366;

public interface Store {
  String get(String key);

  void put(String key, String value);

  default String putAndGet(String key, String value) {
    put(key,value);
    return get(key);
  }
}
