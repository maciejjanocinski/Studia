package com.wsei.demo.testowanie_aplikacji;

public class KonwerterJednostek {

  private static final double KILOGRAMY_NA_FUNTY = 2.20462;
  private static final double MILE_NA_KILOMETRY = 1.60934;
  private static final double LITRY_NA_GALONY = 0.264172;
  private static final double METRY_NA_STOPY = 3.28084;

  public static double kilogramyNaFunty(double kilogramy) {
    return kilogramy * KILOGRAMY_NA_FUNTY;
  }

  public static double mileNaKilometry(double mile) {
    return mile * MILE_NA_KILOMETRY;
  }

  public static double litryNaGalony(double litry) {
    return litry * LITRY_NA_GALONY;
  }

  public static double celsjuszNaFahrenheit(double celsjusz) {
    return (celsjusz * 9/5) + 32;
  }

  public static double metryNaStopy(double metry) {
    return metry * METRY_NA_STOPY;
  }
}
