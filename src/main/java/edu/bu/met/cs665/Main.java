/**
 * Name: Lingxiao Li
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/04/2024
 * File Name: Main.java
 * Description: This is where the program gets in
 */

package edu.bu.met.cs665;

import java.util.Scanner;

/**
 * This is the Main class.
 */
public class Main {

  /**
   * A main method to run examples.
   */
  public static void main(String[] args) {
    Vendor machine = new Vendor();
    Scanner scanner = new Scanner(System.in);

    System.out.println("Welcome to the beverage vending machine!");

    while (true) {
      System.out.println("\nChoose a drink to order:");
      System.out.println("1. Coffee");
      System.out.println("2. Tea");
      System.out.println("3. Quit");

      int choice = scanner.nextInt();

      if (choice == 1) {
        System.out.println("\nChoose a type of coffee:");
        System.out.println("1. Espresso");
        System.out.println("2. Americano");
        System.out.println("3. Latte Macchiato");

        choice = scanner.nextInt();

        if (choice == 1) {
          machine.orderDrink("coffee", "Espresso");
        } else if (choice == 2) {
          machine.orderDrink("coffee", "Americano");
        } else {
          machine.orderDrink("coffee", "Latte Macchiato");
        }

      } else if (choice == 2) {
        System.out.println("\nChoose a type of tea:");
        System.out.println("1. Black");
        System.out.println("2. Green");
        System.out.println("3. Yellow");

        choice = scanner.nextInt();

        if (choice == 1) {
          machine.orderDrink("tea", "Black");
        } else if (choice == 2) {
          machine.orderDrink("tea", "Green");
        } else {
          machine.orderDrink("tea", "Yellow");
        }
      } else if (choice == 3) {
        System.out.println("Thank you for using the vending machine!");
        break;
      } else {
        System.out.println("Invalid choice. Please select a valid option.");
        continue;
      }

      while (true) {
        System.out.println("\nAdd condiments:");
        System.out.println("1. Milk");
        System.out.println("2. Sugar");
        System.out.println("3. Done");

        int condimentChoice = scanner.nextInt();

        if (condimentChoice == 1) {
          machine.addCondimentButton(Condiment.MILK);
        } else if (condimentChoice == 2) {
          machine.addCondimentButton(Condiment.SUGAR);
        } else if (condimentChoice == 3) {
          break;
        } else {
          System.out.println("Invalid choice. Please select a valid option.");
        }
      }

      machine.payAndGet();
    }

    scanner.close();

  }


}
