package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class ContinuedNumber
{
   public static void continuedNumber()
    {
        Scanner scan = new Scanner(System.in);
        //Need to use ArrayList because the Array will be dynamic.
        ArrayList <Integer> numbers = new ArrayList<>();

        //Variable to control the loop.
        String choice;

        //Loop to keep asking for numbers until "n".
        do
        {
            System.out.println("enter a number: ");
            int n = scan.nextInt();
            //Adding the number input to the list.
            numbers.add(n);

            //Ask the user if they want to continue.
            System.out.println("Continue? (y/n): ");
            choice = scan.next();
        }
        while (choice.equalsIgnoreCase("y"));

        //Print the numbers entered by the user.
        System.out.println("Numbers entered: "+ numbers);
    }
}
