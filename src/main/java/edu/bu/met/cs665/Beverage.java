/**
 * Name: Lingxiao Li
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/04/2024
 * File Name: Beverage.java
 * Description: This is an abstract class and parent class for offsprings
 */

package edu.bu.met.cs665;

/**
 * This is the Beverage class.
 */

public abstract class Beverage {

  private final String name;

  private int milkNum;

  private int sugarNum;

  private final double price;

  /**
   * Beverage class constructor and offspring classes can inherent this for easy use.
   */

  public Beverage(String name, double price) {
    this.name = name;
    this.milkNum = 0;
    this.sugarNum = 0;
    this.price = price;
  }

  /**
   * addCondiment method.
   * would add one unit of Condiment enum object if the total unit of that type is less than 3
   */

  public void addCondiment(Condiment condiment) {

    switch (condiment) {
      case MILK:
        if (this.milkNum < 3) {
          this.milkNum += 1;
          System.out.println("Adding milk...");
        } else {
          System.out.println("You can only add 0-3 units of milk!");
        }
        break;
      case SUGAR:
        if (this.sugarNum < 3) {
          this.sugarNum += 1;
          System.out.println("Adding sugar...");
        } else {
          System.out.println("You can only add 0-3 units of sugar!");
        }
        break;
      default:
        System.out.println("Invalid condiment: " + condiment);
        break;
    }
  }

  /**
   * name getter.
   */

  public String getName() {
    return this.name;
  }

  /**
   * milk number getter.
   */

  public int getMilkNum() {
    return this.milkNum;
  }

  /**
   * sugar number getter.
   */

  public int getSugarNum() {
    return this.sugarNum;
  }

  /**
   * original price getter.
   */

  public double getPrice() {
    return this.price;
  }

  /**
   * override to-string method.
   */

  @Override
  public String toString() {

    return "Your " + this.getName() + " with " + this.getMilkNum() + " milk units and "
        + this.getSugarNum() + " sugar units costs: $" + this.calculatePrice();
  }

  /**
   * abstract method for calculating total price.
   */

  public abstract double calculatePrice();

}
