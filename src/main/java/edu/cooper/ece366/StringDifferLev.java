package edu.cooper.ece366;

import info.debatty.java.stringsimilarity.Levenshtein;

public class StringDifferLev implements StringDiffer {

  private final Levenshtein levenshtein;

  public StringDifferLev(Levenshtein levenshtein) {
    this.levenshtein = levenshtein;
  }

  @Override
  public Double diff(final String s1, final String s2) {
    return levenshtein.distance(s1, s2);
  }
}
