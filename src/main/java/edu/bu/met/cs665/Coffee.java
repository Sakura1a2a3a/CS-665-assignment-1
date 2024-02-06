/**
 * Name: Lingxiao Li
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/04/2024
 * File Name: Coffee.java
 * Description: This is a discrete class extends Beverage class
 */

package edu.bu.met.cs665;

/**
 * This is the Coffee class.
 */

public class Coffee extends Beverage {

  /**
   * This is the constructor.
   */
  public Coffee(String name, double price) {
    super(name, price);
  }

  /**
   * calculatePrice method implementation.
   */
  @Override
  public double calculatePrice() {
    return this.getPrice() + 0.50 * (this.getMilkNum() + this.getSugarNum());
  }
}
