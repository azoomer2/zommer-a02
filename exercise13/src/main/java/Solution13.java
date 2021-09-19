/*
 *   UCF COP3330 Fall 2021 Assignment 2 Solution
 *   Copyright 2021 Alexander Zommer
 */


import java.text.NumberFormat;
import java.util.Scanner;

public class Solution13 {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();

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

        System.out.print("What is the number of times the interest is compounded per year? ");
        String compYearsIn = scan.nextLine();
        int compYears = Integer.parseInt(compYearsIn);

        double investment = Math.pow(((1+(rate/compYears))),(compYears*years)) * principal;

        String investRound = formatter.format(investment);

        System.out.print("$" + principal + " invested at " + rateInt + "% for " + years + (" years compounded " + compYears + " times per year is " + investRound));
    }
}





/*
    Take inputs for principal, rate, years, interest
    Do math with order of ops
    round


 */