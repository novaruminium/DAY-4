package org.example;

import java.util.Scanner;

public class StackedStars
{
    public static void stackedStars()
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input number: ");
        int n = scan.nextInt();

        //First loop for the row management.
        for (int i = 1 ; i <= n ; i++)
        {
            //Second loop for the printing management.
            for(int j = 1 ; j <= i ; j++)
            {
                System.out.print("*" + "\t");
            }
            System.out.println();
        }
    }
}
