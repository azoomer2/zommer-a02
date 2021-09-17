/*
 *   UCF COP3330 Fall 2021 Assignment 2 Solution
 *   Copyright 2021 Alexander Zommer
 */



import java.time.Year;
import java.util.Scanner;

public class Solution06 {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("What is your current age? ");
        String currentAge = scan.nextLine();
        int currentAgeInt = Integer.parseInt(currentAge);

        System.out.print("At what age would you like to retire? ");
        String retireAge = scan.nextLine();
        int retireAgeInt = Integer.parseInt(retireAge);

        System.out.println("You have " + (retireAgeInt - currentAgeInt) + " years left until you can retire.");

        int year = Year.now().getValue();
        System.out.println("It's " + year + ", so you can retire in " + (year + (retireAgeInt-currentAgeInt)) + ".");


        /* Take input for current age
           Take retirement age input
           Print years left
           Print retirement year
         */


    }
}
