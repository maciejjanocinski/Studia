package com.wsei.demo.testowanie_aplikacji;

public class KalkulatorKredytowy {

  public static double obliczRate(double kwotaKredytu, double oprocentowanieRoczne, int okresKredytowania) {
    double oprocentowanieMiesieczne = oprocentowanieRoczne / 12 / 100;
    int liczbaMiesiecy = okresKredytowania;

    if (oprocentowanieMiesieczne == 0) {
      return kwotaKredytu / liczbaMiesiecy;
    }

    double wspolczynnik = Math.pow(1 + oprocentowanieMiesieczne, liczbaMiesiecy);
    return kwotaKredytu * (oprocentowanieMiesieczne * wspolczynnik) / (wspolczynnik - 1);
  }
}