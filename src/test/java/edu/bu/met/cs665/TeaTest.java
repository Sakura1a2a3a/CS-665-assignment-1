package edu.bu.met.cs665;

import org.junit.Test;

import static org.junit.Assert.*;

public class TeaTest {

  @Test
  public void addCondiment() {
    Tea thisTea = new Tea("Green", 6.5);
    thisTea.addCondiment(Condiment.MILK);
    thisTea.addCondiment(Condiment.MILK);
    assertEquals(0, thisTea.getMilkNum());
  }

  @Test
  public void calculatePrice() {
    Tea thisTea = new Tea("Yellow", 6.5);
    thisTea.addCondiment(Condiment.SUGAR);
    thisTea.addCondiment(Condiment.SUGAR);
    assertEquals(6.5, thisTea.calculatePrice(), 0.01);
  }
}