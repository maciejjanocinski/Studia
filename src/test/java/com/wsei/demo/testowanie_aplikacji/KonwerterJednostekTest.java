package com.wsei.demo.testowanie_aplikacji;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class KonwerterJednostekTest {

  @Test
  void testKilogramyNaFunty() {
    assertEquals(22.0462d, KonwerterJednostek.kilogramyNaFunty(10.0d));
  }


  @Test
  void testMileNaKilometry() {
    assertEquals(16.0934d, KonwerterJednostek.mileNaKilometry(10.0d));
  }

  @Test
  void testLitryNaGalony() {
    assertEquals(2.6417200000000003d, KonwerterJednostek.litryNaGalony(10.0d));
  }

  @Test
  void testCelsjuszNaFahrenheit() {
    assertEquals(50.0d, KonwerterJednostek.celsjuszNaFahrenheit(10.0d));
  }

  @Test
  void testMetryNaStopy() {
    assertEquals(32.8084d, KonwerterJednostek.metryNaStopy(10.0d));
  }
}
