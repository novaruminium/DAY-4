package org.example;

import java.util.Random;
import java.util.Scanner;

public class Game
{
    public static void game()
    {
        Scanner scan = new Scanner(System.in);
        //First we need to create a Random object.
        Random random = new Random();

        //Generating random number between 1-100.
        int randomNumber = random.nextInt(100) + 1;

        //Variable to store user's guess.
        int guess;

        System.out.println("Let's play a game!");
        System.out.println("Guess what number am I thinking? it's from 1 - 100! ");

        //Repeat until the correct guess is made.
        do
        {
            //Asking user for the guess.
            System.out.println("Input your guess: ");
            guess = scan.nextInt();

            //If the guess is bigger than the randomNumber, it says some clue.
            if (guess > randomNumber)
            {
                System.out.println("Wrong! it's too high!");
            }
            //If the guess is smaller than the randomNumber, it says some clue.
            else if (guess < randomNumber)
            {
                System.out.println("Wrong! it's too low!");
            }
        }
        //Continue until the guess is correct.
        while (guess != randomNumber);

        System.out.println(randomNumber + " is true! Congratulations!");
    }
}
