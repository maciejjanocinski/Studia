package com.wsei.demo.testowanie_aplikacji;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KalkulatorTest {


  @Test
  void dodaj() {
    //given
    float a = 5;
    float b = 6;
    float oczekiwanyWynik = 11;

    //when
    float wynik = Kalkulator.dodaj(a, b);

    //then
    assertEquals(oczekiwanyWynik, wynik);
  }

  @Test
  void odejmij() {
    //given
    float a = 5;
    float b = 6;
    float oczekiwanyWynik = -1;

    //when
    float wynik = Kalkulator.odejmij(a, b);

    //then
    assertEquals(oczekiwanyWynik, wynik);
  }

  @Test
  void pomnoz() {
    //given
    float a = 5;
    float b = 6;
    float oczekiwanyWynik = 30;

    //when
    float wynik = Kalkulator.pomnoz(a, b);

    //then
    assertEquals(oczekiwanyWynik, wynik);
  }

  @Test
  void podziel() {
    //given
    float a = 5;
    float b = 6;
    float oczekiwanyWynik = (float) 5 / 6;

    //when
    float wynik = Kalkulator.podziel(a, b);

    //then
    assertEquals(oczekiwanyWynik, wynik);
  }

  @Test
  void doPotegi2() {
    //given
    float a = 5;
    float oczekiwanyWynik = 25;

    //when
    float wynik = Kalkulator.doPotegi2(a);

    //then
    assertEquals(oczekiwanyWynik, wynik);
  }

  @Test
  void pierwiastek() {
    //given
    float a = 25;
    float oczekiwanyWynik = 5;

    //when
    float wynik = Kalkulator.pierwiastek(a);

    //then
    assertEquals(oczekiwanyWynik, wynik);
  }
}