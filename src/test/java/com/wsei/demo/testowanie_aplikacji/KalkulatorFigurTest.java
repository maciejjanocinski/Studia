package com.wsei.demo.testowanie_aplikacji;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class KalkulatorFigurTest {

  @Test
  public void testPoleProstokata() {
    assertEquals(20, KalkulatorFigur.poleProstokata(4, 5), 0.01);
    assertEquals(50, KalkulatorFigur.poleProstokata(10, 5), 0.01);
  }

  @Test
  public void testObwodProstokata() {
    assertEquals(18, KalkulatorFigur.obwodProstokata(4, 5), 0.01);
    assertEquals(30, KalkulatorFigur.obwodProstokata(10, 5), 0.01);
  }

  @Test
  public void testPoleTrojkata() {
    assertEquals(10, KalkulatorFigur.poleTrojkata(4, 5), 0.01);
    assertEquals(25, KalkulatorFigur.poleTrojkata(10, 5), 0.01);
  }

  @Test
  public void testObwodTrojkata() {
    assertEquals(12, KalkulatorFigur.obwodTrojkata(3, 4, 5), 0.01);
    assertEquals(15, KalkulatorFigur.obwodTrojkata(5, 5, 5), 0.01);
  }

  @Test
  public void testPoleKola() {
    assertEquals(28.27, KalkulatorFigur.poleKola(3), 0.01);
    assertEquals(78.54, KalkulatorFigur.poleKola(5), 0.01);
  }

  @Test
  public void testObwodKola() {
    assertEquals(18.85, KalkulatorFigur.obwodKola(3), 0.01);
    assertEquals(31.42, KalkulatorFigur.obwodKola(5), 0.01);
  }

  @Test
  public void testPoleTrapezu() {
    assertEquals(24, KalkulatorFigur.poleTrapezu(6, 6, 4), 0.01);
    assertEquals(35, KalkulatorFigur.poleTrapezu(7, 7, 5), 0.01);
  }

  @Test
  public void testObwodTrapezu() {
    assertEquals(20, KalkulatorFigur.obwodTrapezu(5, 5, 5, 5), 0.01);
    assertEquals(26, KalkulatorFigur.obwodTrapezu(7, 6, 7, 6), 0.01);
  }
}