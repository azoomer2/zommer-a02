/*
 *   UCF COP3330 Fall 2021 Assignment 2 Solution
 *   Copyright 2021 Alexander Zommer
 */


import java.util.Scanner;

public class Solution12 {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the principal: ");
        String principalIn = scan.nextLine();
        int principal = Integer.parseInt(principalIn);

        System.out.print("Enter the rate of interest: ");
        String rateIn = scan.nextLine();
        double rateInt = Double.parseDouble(rateIn);
        double rate = rateInt / 100;


        System.out.print("Enter the number of years: ");
        String yearsIn = scan.nextLine();
        int years = Integer.parseInt(yearsIn);

        double investment = principal*(1+(rate*years));

        double investRound = Math.round(investment*100) / 100;

        System.out.print("After " + years + " years at " + rateInt + ", the investment will be worth $" + investRound);
    }
}



/*
    Take inputs for principal, rate, and years
    Do math with order of ops
    Round number to 2 decimal places
    Print with decimal formatting

 */