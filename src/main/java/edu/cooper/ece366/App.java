package edu.cooper.ece366;

public class App {

  private final Store store;
  private final StringDiffer stringDiffer;

  public App(Store store, StringDiffer stringDiffer) {
    this.store = store;
    this.stringDiffer = stringDiffer;
  }

  public Double diffAndStoreStrings(String s1, String s2) {
    store.put(s1, s2);
    return stringDiffer.diff(s1, store.get(s1));
  }

  public String putStringIntoStore(String s1, String s2) {
    store.put(s1, s2);
    return s1;
  }
}
