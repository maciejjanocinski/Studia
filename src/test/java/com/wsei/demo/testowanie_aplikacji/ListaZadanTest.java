package com.wsei.demo.testowanie_aplikacji;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class ListaZadanTest {

  private ListaZadan listaZadan;

  @BeforeEach
  public void ustawienia() {
    listaZadan = new ListaZadan();
  }

  @Test
  public void testDodajZadanie() {
    listaZadan.dodajZadanie("Zadanie 1");
    assertEquals(1, listaZadan.getZadania().size());
    assertEquals("Zadanie 1", listaZadan.getZadania().get(0).getOpis());
    assertFalse(listaZadan.getZadania().get(0).isWykonane());
  }

  @Test
  public void testUsunZadanie() {
    listaZadan.dodajZadanie("Zadanie 1");
    listaZadan.dodajZadanie("Zadanie 2");
    assertTrue(listaZadan.usunZadanie("Zadanie 1"));
    assertEquals(1, listaZadan.getZadania().size());
    assertEquals("Zadanie 2", listaZadan.getZadania().get(0).getOpis());
  }

  @Test
  public void testUsunZadanieNieIstnieje() {
    listaZadan.dodajZadanie("Zadanie 1");
    assertFalse(listaZadan.usunZadanie("Nieistniejące zadanie"));
    assertEquals(1, listaZadan.getZadania().size());
  }

  @Test
  public void testOznaczZadanieJakoWykonane() {
    listaZadan.dodajZadanie("Zadanie 1");
    listaZadan.oznaczZadanieJakoWykonane("Zadanie 1");
    assertTrue(listaZadan.getZadania().get(0).isWykonane());
  }

  @Test
  public void testOznaczZadanieJakoWykonaneNieIstnieje() {
    listaZadan.dodajZadanie("Zadanie 1");
    assertFalse(listaZadan.oznaczZadanieJakoWykonane("Nieistniejące zadanie"));
    assertFalse(listaZadan.getZadania().get(0).isWykonane());
  }

  @Test
  public void testDodajWieleZadan() {
    listaZadan.dodajZadanie("Zadanie 1");
    listaZadan.dodajZadanie("Zadanie 2");
    listaZadan.dodajZadanie("Zadanie 3");

    assertEquals(3, listaZadan.getZadania().size());
    assertEquals("Zadanie 1", listaZadan.getZadania().get(0).getOpis());
    assertEquals("Zadanie 2", listaZadan.getZadania().get(1).getOpis());
    assertEquals("Zadanie 3", listaZadan.getZadania().get(2).getOpis());
  }
}