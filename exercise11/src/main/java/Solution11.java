/*
 *   UCF COP3330 Fall 2021 Assignment 2 Solution
 *   Copyright 2021 Alexander Zommer
 */


import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution11 {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        DecimalFormat dollar = new DecimalFormat();
        dollar.setMaximumFractionDigits(2);

        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(4);

        System.out.print("How many euros are you exchanging? ");
        String eurosIn = scan.nextLine();
        int euros = Integer.parseInt(eurosIn);

        System.out.print("What is the exchange rate? ");
        String rateIn = scan.nextLine();
        double rate = Double.parseDouble(rateIn);

        double dollars = euros * rate;
        double dollarsRounded = Math.round(dollars*100.0)/100.0;

        System.out.print(euros + " euros at an exchange rate of " + df.format(rate) + " is " + dollarsRounded + " U.S. dollars.");
    }
}


/*
    Take input of euros to exchange
    Take input rate
    Calculate the conversion
    Print in one statement

 */