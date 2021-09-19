/*
 *   UCF COP3330 Fall 2021 Assignment 2 Solution
 *   Copyright 2021 Alexander Zommer
 */


import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution17 {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(6);

        System.out.print("Enter a 1 if you are male or a 2 if you are female: ");
        while(!scan.hasNextInt()){
            System.out.print("Input is not a number.");
            scan.nextLine();
        }
        int sex = scan.nextInt();
        double r = -1.00;

        if(sex == 1 )
            r = 0.73;
        else
            r = 0.66;

        System.out.print("How many ounces of alcohol did you have? ");
        while(!scan.hasNextInt()){
            System.out.print("Input is not a number.");
            scan.nextLine();
        }
        int consumed = scan.nextInt();

        System.out.print("What is your weight, in pounds? ");
        while(!scan.hasNextInt()){
            System.out.print("Input is not a number.");
            scan.nextLine();
        }
        int weight = scan.nextInt();

        System.out.print("How many hours has it been since your last drink? ");
        while(!scan.hasNextInt()){
            System.out.print("Input is not a number.");
            scan.nextLine();
        }
        int hours = scan.nextInt();

        double BAC = (((consumed * 5.14)/weight * r) - (0.015 * hours));

        System.out.println("\nYour BAC is " + df.format(BAC));
        if(BAC >= 0.08)
            System.out.println("It is not legal for you to drive.");
        else
            System.out.println("It is legal for you to drive.");


    }
}


/*
    Take input for sex
    Prompt for the amount of alcohol consumed
    Prompt for weight in pounds
    Prompt for hours since last drink
    calculate BAC
    Print if else for legal to drive
*/