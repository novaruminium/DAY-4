package org.example;

import java.util.Scanner;

public class Multiplication
{
    public static void multiplicationTable ()
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input number: ");
        int n = scan.nextInt();

        //outer loop for rows.
        for (int i = 1; i <= n; i++)
        {
            //outer loop for columns.
            for (int j = 1; j <= n; j++)
            {
                //print the product of i & j, the \t keeps it align.
                System.out.print(i * j + "\t");

            }   //move to the next line after each row is printed.
            System.out.println();
        }
    }
}
