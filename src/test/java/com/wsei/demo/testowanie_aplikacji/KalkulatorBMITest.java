package com.wsei.demo.testowanie_aplikacji;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class KalkulatorBMITest {

  @Test
  public void testObliczBMI_PrawidloweWartosci() {
    assertEquals(22.22, KalkulatorBMI.obliczBMI(70, 1.78), 0.01);
    assertEquals(24.69, KalkulatorBMI.obliczBMI(80, 1.8), 0.01);
    assertEquals(18.52, KalkulatorBMI.obliczBMI(50, 1.65), 0.01);
  }

  @Test
  public void testObliczBMI_ZerowaWagaLubWzrost() {
    assertThrows(IllegalArgumentException.class, () -> KalkulatorBMI.obliczBMI(0, 1.75));
    assertThrows(IllegalArgumentException.class, () -> KalkulatorBMI.obliczBMI(70, 0));
  }

  @Test
  public void testObliczBMI_NegatywnaWagaLubWzrost() {
    assertThrows(IllegalArgumentException.class, () -> KalkulatorBMI.obliczBMI(-70, 1.75));
    assertThrows(IllegalArgumentException.class, () -> KalkulatorBMI.obliczBMI(70, -1.75));
  }
}
