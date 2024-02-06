package edu.bu.met.cs665;

import org.junit.Test;

import static org.junit.Assert.*;

public class CoffeeTest {


  @Test
  public void addCondiment() {
    Coffee thisCoffee = new Coffee("Espresso", 7.5);
    thisCoffee.addCondiment(Condiment.MILK);
    thisCoffee.addCondiment(Condiment.MILK);
    thisCoffee.addCondiment(Condiment.MILK);
    thisCoffee.addCondiment(Condiment.MILK);
    assertEquals(3, thisCoffee.getMilkNum());
  }

  @Test
  public void calculatePrice() {
    Coffee thisCoffee = new Coffee("Espresso", 7.5);
    for (int i = 0; i < 5; i++) {
      thisCoffee.addCondiment(Condiment.SUGAR);
    }

    assertEquals(9.0, thisCoffee.calculatePrice(), 0.01);
  }
}