/*
 *   UCF COP3330 Fall 2021 Assignment 2 Solution
 *   Copyright 2021 Alexander Zommer
 */

import java.util.Scanner;

public class Solution18 {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter C or F for which unit your temperature is in: ");
        String inputChoice = scan.nextLine();

        if(inputChoice.equals("C") || inputChoice.equals("c")){
            System.out.print("Please enter the temperature in Celsius: ");
            String celsiusIn = scan.nextLine();
            int celsius = Integer.parseInt(celsiusIn);

            double fahrenheitConverted = (celsius*(9/5.0) + 32);
            System.out.println("The temperature in fahrenheit is "+ fahrenheitConverted);

        }
        else if(inputChoice.equals("F") || inputChoice.equals("f")){
            System.out.print("Please enter the temperature in Fahrenheit: ");
            String fahrenheitIn = scan.nextLine();
            int fahrenheit = Integer.parseInt(fahrenheitIn);

            double celsiusConverted = ((fahrenheit - 32) * (5/9.0));
            System.out.println("The temperature in celsius is "+ celsiusConverted);
        }
        else
            System.out.println("Invalid entry!");
    }
}




/*
    Take input for c to f or f to c
    Compare and decide which conversion to do
    If c or C use cel to far conversion
    If f or F use far to cel conversion
    print output

 */