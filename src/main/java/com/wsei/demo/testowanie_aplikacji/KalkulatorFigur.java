package com.wsei.demo.testowanie_aplikacji;

public class KalkulatorFigur {

  public static double poleProstokata(double dlugosc, double szerokosc) {
    return dlugosc * szerokosc;
  }

  public static double obwodProstokata(double dlugosc, double szerokosc) {
    return 2 * (dlugosc + szerokosc);
  }

  public static double poleTrojkata(double podstawa, double wysokosc) {
    return (podstawa * wysokosc) / 2;
  }

  public static double obwodTrojkata(double bok1, double bok2, double bok3) {
    return bok1 + bok2 + bok3;
  }

  public static double poleKola(double promien) {
    return Math.PI * promien * promien;
  }

  public static double obwodKola(double promien) {
    return 2 * Math.PI * promien;
  }

  public static double poleTrapezu(double podstawa1, double podstawa2, double wysokosc) {
    return ((podstawa1 + podstawa2) * wysokosc) / 2;
  }

  public static double obwodTrapezu(double bok1, double bok2, double bok3, double bok4) {
    return bok1 + bok2 + bok3 + bok4;
  }
}