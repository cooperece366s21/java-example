package edu.cooper.ece366;

public class StringDifferImpl implements StringDiffer {

  public StringDifferImpl() {
  }

  @Override
  public Double diff(final String s1, final String s2) {
    return Integer.valueOf(s1.compareTo(s2)).doubleValue();
  }
}
