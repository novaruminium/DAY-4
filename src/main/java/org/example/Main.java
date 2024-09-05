package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Select the number for the question: ");
        System.out.println("1. Multiplication Table.");
        System.out.println("2. Stacked Stars.");
        System.out.println("3. Input from Scanner.");
        System.out.println("4. Simple Game.");
        System.out.println("5. Case Swap.");
        System.out.print("Enter choice: ");
        int a = scan.nextInt();

        switch (a)
        {
            case 1:
                //Create a program that prints a multiplication table up to n x n.
                Multiplication.multiplicationTable();
                break;

            case 2:
                //Write a program to print the following pattern for n rows.
                StackedStars.stackedStars();
                break;

            case 3:
                //Write a code that reads n number of input from scanner.
                ContinuedNumber.continuedNumber();
                break;

            case 4:
                //Create a simple number guessing game.


                break;

            case 5:
                //Write a code to swap the case of each character from string.

                break;

            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}