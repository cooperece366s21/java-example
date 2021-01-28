package edu.cooper.ece366;

import info.debatty.java.stringsimilarity.Levenshtein;

public class Main {
  public static void main(String[] args) {
    // wire up the dependencies
    // application lifecycle (start, stop, etc)

    // 'inversion of control'
    // 'dependency injection'
    Store store = new StoreImpl();
    StringDiffer stringDiffer = new StringDifferLev(new Levenshtein());
    App app = new App(store, stringDiffer);

    String s1 = "yeet";
    String s2 = "deet";
    app.putStringIntoStore(s1, s2);

    System.out.println("Diff: " + app.diffAndStoreStrings(s1, s2));
  }
}
