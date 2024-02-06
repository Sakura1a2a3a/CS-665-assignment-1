/**
 * Name: Lingxiao Li
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/04/2024
 * File Name: Vendor.java
 * Description: This is a vendor machine class
 */

package edu.bu.met.cs665;

/**
 * This is the Vendor class.
 */

public class Vendor {

  private Boolean inUse;
  private Beverage vendorCup;

  /**
   * Vendor class constructor.
   */
  public Vendor() {
    this.inUse = Boolean.FALSE;
    this.vendorCup = null;
  }

  /**
   * order a drink to make the empty cup full of beverage.
   */
  public void orderDrink(String type, String name) {
    if (!this.inUse) {

      switch (type.toLowerCase()) {
        case "coffee":
          this.vendorCup = new Coffee(name, 6.5);
          break;
        case "tea":
          this.vendorCup = new Tea(name, 5.0);
          break;
        default:
          throw new IllegalArgumentException("Invalid beverage type");
      }

      this.inUse = Boolean.TRUE;
    } else {
      System.out.println("This vendor is in using!");
    }
  }

  /**
   * hit the button to call addCondiment method.
   */
  public void addCondimentButton(Condiment condiment) {
    if (this.inUse) {
      this.vendorCup.addCondiment(condiment);
    } else {
      System.out.println("Please order something first!");
    }
  }

  /**
   * override to-string method.
   */

  @Override
  public String toString() {
    return this.vendorCup.toString();
  }

  /**
   * pay the money and return full information of drink.
   */
  public void payAndGet() {
    if (this.inUse) {
      this.inUse = Boolean.FALSE;

      System.out.println(this.vendorCup);
      this.vendorCup = null;
    } else {
      System.out.println("You have nothing in the cup!");
    }
  }

}
