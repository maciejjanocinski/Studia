package com.wsei.demo.testowanie_aplikacji;

public class StringUtilities {

  public static String odwroc(String tekst) {
    if (tekst == null) return null;
    return new StringBuilder(tekst).reverse().toString();
  }

  public static String usunBialeZnaki(String tekst) {
    if (tekst == null) return null;
    return tekst.replaceAll("\\s+", "");
  }

  public static boolean czyPalindrom(String tekst) {
    if (tekst == null) return false;
    String czystyTekst = usunBialeZnaki(tekst).toLowerCase();
    return czystyTekst.equals(odwroc(czystyTekst));
  }

  public static String doCamelCase(String tekst) {
    if (tekst == null) return null;
    String[] slowa = tekst.toLowerCase().split("\\s+");
    StringBuilder camelCase = new StringBuilder(slowa[0]);
    for (int i = 1; i < slowa.length; i++) {
      camelCase.append(Character.toUpperCase(slowa[i].charAt(0)))
          .append(slowa[i].substring(1));
    }
    return camelCase.toString();
  }

  public static String zamienNaWielkieLitery(String tekst) {
    if (tekst == null) return null;
    return tekst.toUpperCase();
  }

  public static String doTitleCase(String tekst) {
    if (tekst == null) return null;
    String[] slowa = tekst.toLowerCase().split("\\s+");
    StringBuilder titleCase = new StringBuilder();
    for (String slowo : slowa) {
      titleCase.append(Character.toUpperCase(slowo.charAt(0)))
          .append(slowo.substring(1)).append(" ");
    }
    return titleCase.toString().trim();
  }
}