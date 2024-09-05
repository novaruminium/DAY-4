package org.example;

import java.util.Scanner;

public class CharSwap
{
    public static void charSwap()
    {
        Scanner scan = new Scanner(System.in);
        // Ask the user to input a string
        System.out.print("Input the word: ");
        String input = scan.nextLine();

        // Variable to store the result with swapped cases
        StringBuilder swappedString = new StringBuilder();

        // Loop through each character of the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if the character is uppercase
            if (Character.isUpperCase(ch)) {
                // Convert to lowercase and append to result
                swappedString.append(Character.toLowerCase(ch));
            }
            // Check if the character is lowercase
            else if (Character.isLowerCase(ch)) {
                // Convert to uppercase and append to result
                swappedString.append(Character.toUpperCase(ch));
            }
            // If it's not a letter, just append the character as is
            else {
                swappedString.append(ch);
            }
        }

        // Print the result with swapped cases
        System.out.println("Swapped case string: " + swappedString.toString());
    }
}
