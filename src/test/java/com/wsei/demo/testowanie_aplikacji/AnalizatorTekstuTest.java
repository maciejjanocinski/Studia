package com.wsei.demo.testowanie_aplikacji;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class AnalizatorTekstuTest {

  @Test
  public void testLiczbaSlow() {
    AnalizatorTekstu analizator = new AnalizatorTekstu("To jest przykładowy tekst.");
    assertEquals(4, analizator.liczbaSlow());
  }

  @Test
  public void testLiczbaZdan() {
    AnalizatorTekstu analizator = new AnalizatorTekstu("To jest pierwsze zdanie. To jest drugie zdanie! I trzecie?");
    assertEquals(3, analizator.liczbaZdan());
  }

  @Test
  public void testSredniaDlugoscSlowa() {
    AnalizatorTekstu analizator = new AnalizatorTekstu("To jest prosty test.");
    assertEquals(4, analizator.sredniaDlugoscSlowa());
  }

  @Test
  public void testLiczbaUnikalnychSlow() {
    AnalizatorTekstu analizator = new AnalizatorTekstu("To jest test i to jest tylko test.");
    assertEquals(6, analizator.liczbaUnikalnychSlow());
  }

  @Test
  public void testLiczbaZnakowBezSpacji() {
    AnalizatorTekstu analizator = new AnalizatorTekstu("To jest przykładowy tekst.");
    assertEquals(23, analizator.liczbaZnakowBezSpacji());
  }
}