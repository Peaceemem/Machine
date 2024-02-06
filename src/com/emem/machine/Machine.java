package com.emem.machine;

import java.util.Scanner;

public class Machine {
    public static void main(String[] args) {
            String[] menu = {"tea", "Espresso", "Americans", "water", "Hot chocolate"};

            Scanner scanner = new Scanner(System.in);
            System.out.println("Welcome to the vending machine! Please select a drink (1-" + menu.length + "): ");
            int choice = scanner.nextInt();

            if (choice >= 1 && choice <= menu.length) {
                String selectedDrink = menu[choice - 1];
                System.out.println("You have selected: " + selectedDrink);
            } else {
                System.out.println("Error: Invalid choice! Please select a number between 1 and " + menu.length + ".");
            }
        }
    }
