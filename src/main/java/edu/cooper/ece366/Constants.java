package edu.cooper.ece366;

import java.util.ArrayList;
import java.util.List;

public class Constants {
  public static final String YEET = "yeet";

  public static String getYeet() {
    return YEET;
  }

  public static String add(int a, int b) {
    return Integer.valueOf(a + b).toString();
  }

  // int vs Integer
  public static void main(String[] args) {
    int x = 5;
    Integer y = 6;
    List<Integer> objects = new ArrayList<>();
  }
}
