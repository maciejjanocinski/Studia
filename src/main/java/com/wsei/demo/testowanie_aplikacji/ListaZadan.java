package com.wsei.demo.testowanie_aplikacji;

import java.util.ArrayList;
import java.util.List;

public class ListaZadan {

  private List<Zadanie> zadania;

  public ListaZadan() {
    this.zadania = new ArrayList<>();
  }

  public void dodajZadanie(String opis) {
    zadania.add(new Zadanie(opis));
  }

  public boolean usunZadanie(String opis) {
    return zadania.removeIf(zadanie -> zadanie.getOpis().equals(opis));
  }

  public boolean oznaczZadanieJakoWykonane(String opis) {
    for (Zadanie zadanie : zadania) {
      if (zadanie.getOpis().equals(opis)) {
        zadanie.setWykonane(true);
        return true;
      }
    }
    return false;
  }

  public List<Zadanie> getZadania() {
    return zadania;
  }

  public static class Zadanie {
    private String opis;
    private boolean wykonane;

    public Zadanie(String opis) {
      this.opis = opis;
      this.wykonane = false;
    }

    public String getOpis() {
      return opis;
    }

    public boolean isWykonane() {
      return wykonane;
    }

    public void setWykonane(boolean wykonane) {
      this.wykonane = wykonane;
    }
  }
}
