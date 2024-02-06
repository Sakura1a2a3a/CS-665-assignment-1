package edu.bu.met.cs665;

import org.junit.Test;

import static org.junit.Assert.*;

public class VendorTest {

  @Test
  public void payAndGet() {
    Vendor machine = new Vendor();
    machine.orderDrink("coffee", "Espresso");
    machine.orderDrink("tea", "Green");
    machine.addCondimentButton(Condiment.MILK);
    machine.addCondimentButton(Condiment.SUGAR);
    assertEquals(machine.toString(), "Your Espresso with 1 milk units and 1 sugar units costs: $7.5");
  }
}