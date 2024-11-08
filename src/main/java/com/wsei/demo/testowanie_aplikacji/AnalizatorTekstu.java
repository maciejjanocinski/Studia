package com.wsei.demo.testowanie_aplikacji;

import java.util.HashSet;
import java.util.Set;

public class AnalizatorTekstu {

  private final String tekst;

  public AnalizatorTekstu(String tekst) {
    this.tekst = tekst;
  }

  public int liczbaSlow() {
    String[] slowa = tekst.trim().split(" ");
    return slowa.length;
  }

  public int liczbaZdan() {
    String[] zdania = tekst.split("[.!?]+");
    return zdania.length;
  }

  public int sredniaDlugoscSlowa() {
    String[] slowa = tekst.trim().split(" ");
    int dlugosc = 0;
    for (String slowo : slowa) {
      dlugosc += slowo.length();
    }
    return dlugosc / slowa.length;
  }

  public int liczbaUnikalnychSlow() {
    String[] slowa = tekst.trim().toLowerCase().split(" ");
    Set<String> unikalneSlowa = new HashSet<>();
    for (String slowo : slowa) {
      unikalneSlowa.add(slowo);
    }
    return unikalneSlowa.size();
  }

  public int liczbaZnakowBezSpacji() {
    String bezSpacji = tekst.replaceAll(" ", "");
    return bezSpacji.length();
  }
}