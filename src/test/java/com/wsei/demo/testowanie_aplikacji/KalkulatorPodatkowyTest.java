package com.wsei.demo.testowanie_aplikacji;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class KalkulatorPodatkowyTest {

  /**
   * Method under test:
   * {@link KalkulatorPodatkowy#obliczPodatek(double, double, KalkulatorPodatkowy.FormaOpodatkowania)}
   */
  @Test
  void testObliczPodatek() {
    // Arrange, Act and Assert
    assertEquals(4512.0d,
                 KalkulatorPodatkowy.obliczPodatek(10.0d, 10.0d, KalkulatorPodatkowy.FormaOpodatkowania.RYCZALT));
    assertEquals(16798.1d,
                 KalkulatorPodatkowy.obliczPodatek(60000.0d, 10.0d, KalkulatorPodatkowy.FormaOpodatkowania.LINIOWY));
    assertEquals(8998.8d,
                 KalkulatorPodatkowy.obliczPodatek(60000.0d, 10.0d, KalkulatorPodatkowy.FormaOpodatkowania.SKALA));
    assertEquals(14710.8d,
                 KalkulatorPodatkowy.obliczPodatek(60000.00000000001d, 10.0d,
                                                   KalkulatorPodatkowy.FormaOpodatkowania.RYCZALT));
    assertEquals(95396.8d,
                 KalkulatorPodatkowy.obliczPodatek(300000.0d, 10.0d, KalkulatorPodatkowy.FormaOpodatkowania.SKALA));
    assertEquals(49534.8d,
                 KalkulatorPodatkowy.obliczPodatek(300000.00000000006d, 10.0d,
                                                   KalkulatorPodatkowy.FormaOpodatkowania.RYCZALT));
    assertEquals(0.8999999999999999d,
                 KalkulatorPodatkowy.obliczPodatek(10.0d, 10.0d, KalkulatorPodatkowy.FormaOpodatkowania.SKALA));
  }
}
