package com.wsei.demo.testowanie_aplikacji;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class KalkulatorKredytowyTest {

  @Test
  void testObliczRate() {
    assertEquals(3.3890425686585273d, KalkulatorKredytowy.obliczRate(10.0d, 10.0d, 3));
    assertEquals(4.066851082390233d, KalkulatorKredytowy.obliczRate(12.0d, 10.0d, 3));
    assertEquals(33.890425686585274d, KalkulatorKredytowy.obliczRate(100.0d, 10.0d, 3));
    assertEquals(0.0028242021405487728d, KalkulatorKredytowy.obliczRate(0.008333333333333333d, 10.0d, 3));
    assertEquals(3.3333333333333335d, KalkulatorKredytowy.obliczRate(10.0d, 0.0d, 3));
  }
}
