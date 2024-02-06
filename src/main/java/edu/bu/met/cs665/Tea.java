/**
 * Name: Lingxiao Li
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/04/2024
 * File Name: Tea.java
 * Description: This is a discrete class extends Beverage class
 */

package edu.bu.met.cs665;

/**
 * This is the Tea class.
 */

public class Tea extends Beverage {

  /**
   * Tea class constructor.
   */
  public Tea(String name, double price) {
    super(name, price);
  }

  /**
   * addCondiment method implementation.
   */
  @Override
  public void addCondiment(Condiment condiment) {
    System.out.println("Sorry, no one add condiment to tea!");
  }

  /**
   * calculatePrice method implementation.
   */
  @Override
  public double calculatePrice() {
    return this.getPrice();
  }

}
