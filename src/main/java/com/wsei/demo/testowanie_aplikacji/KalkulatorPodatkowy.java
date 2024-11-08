package com.wsei.demo.testowanie_aplikacji;

public class KalkulatorPodatkowy {

  public enum FormaOpodatkowania {
    RYCZALT, LINIOWY, SKALA
  }

  public static double obliczPodatek(double dochod, double koszty, FormaOpodatkowania formaOpodatkowania) {
    double podstawaOpodatkowania = dochod - koszty;
    double podatekDochody = 0;
    double skladkaZdrowotna = obliczSkladkeZdrowotna(dochod, formaOpodatkowania);

    switch (formaOpodatkowania) {
      case RYCZALT:
        podatekDochody = podstawaOpodatkowania * 0.12;
        break;
      case LINIOWY:
        podatekDochody = podstawaOpodatkowania * 0.19;
        break;
      case SKALA:
        if (podstawaOpodatkowania <= 30000) {
          podatekDochody = 0;
        } else if (podstawaOpodatkowania <= 120000) {
          podatekDochody = (podstawaOpodatkowania - 30000) * 0.12;
        } else {
          podatekDochody = (120000 - 30000) * 0.12 + (podstawaOpodatkowania - 120000) * 0.32;
        }
        break;
    }
    return Math.max(0, podatekDochody + skladkaZdrowotna);
  }

  private static double obliczSkladkeZdrowotna(double dochod, FormaOpodatkowania formaOpodatkowania) {
    switch (formaOpodatkowania) {
      case RYCZALT:
        if (dochod <= 60000) return 376 * 12;
        else if (dochod <= 300000) return 626 * 12;
        else return 1128 * 12;
      case LINIOWY:
      case SKALA:
        return dochod * 0.09;
      default:
        throw new IllegalArgumentException("Nieprawidłowa forma opodatkowania");
    }
  }
}