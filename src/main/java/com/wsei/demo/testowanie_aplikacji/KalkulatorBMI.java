package com.wsei.demo.testowanie_aplikacji;

public class KalkulatorBMI {

  public static double obliczBMI(double wagaKg, double wzrostM) {
    if (wagaKg <= 0 || wzrostM <= 0) {
      throw new IllegalArgumentException("Waga i wzrost muszą być większe od zera.");
    }
    return wagaKg / (wzrostM * wzrostM);
  }
}