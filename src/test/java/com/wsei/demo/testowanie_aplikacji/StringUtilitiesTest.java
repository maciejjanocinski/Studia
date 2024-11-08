package com.wsei.demo.testowanie_aplikacji;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilitiesTest {


  @Test
  public void testOdwroc() {
    assertEquals("dcba", StringUtilities.odwroc("abcd"));
    assertEquals("987654321", StringUtilities.odwroc("123456789"));
    assertNull(StringUtilities.odwroc(null));
  }

  @Test
  public void testUsunBialeZnaki() {
    assertEquals("HelloWorld", StringUtilities.usunBialeZnaki("Hello World"));
    assertEquals("JavaProgramming", StringUtilities.usunBialeZnaki("  Java  Programming "));
    assertNull(StringUtilities.usunBialeZnaki(null));
  }

  @Test
  public void testCzyPalindrom() {
    assertTrue(StringUtilities.czyPalindrom("madam"));
    assertTrue(StringUtilities.czyPalindrom("A man a plan a canal Panama"));
    assertFalse(StringUtilities.czyPalindrom("Hello"));
    assertFalse(StringUtilities.czyPalindrom(null));
  }

  @Test
  public void testDoCamelCase() {
    assertEquals("helloWorld", StringUtilities.doCamelCase("hello world"));
    assertEquals("javaProgrammingLanguage", StringUtilities.doCamelCase("Java Programming Language"));
    assertNull(StringUtilities.doCamelCase(null));
  }

  @Test
  public void testZamienNaWielkieLitery() {
    assertEquals("HELLO WORLD", StringUtilities.zamienNaWielkieLitery("Hello World"));
    assertEquals("JAVA", StringUtilities.zamienNaWielkieLitery("java"));
    assertEquals("123 ABC", StringUtilities.zamienNaWielkieLitery("123 abc"));
    assertNull(StringUtilities.zamienNaWielkieLitery(null));
  }

  @Test
  public void testDoTitleCase() {
    assertEquals("Hello World", StringUtilities.doTitleCase("hello world"));
    assertEquals("Java Programming Language", StringUtilities.doTitleCase("java programming language"));
    assertNull(StringUtilities.doTitleCase(null));
  }

}