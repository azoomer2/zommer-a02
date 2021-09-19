/*
 *   UCF COP3330 Fall 2021 Assignment 2 Solution
 *   Copyright 2021 Alexander Zommer
 */

import java.text.NumberFormat;
import java.util.Scanner;

public class Solution14 {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String wisconsin = "WI";

        System.out.print("What is the order amount? ");
        String orderIn = scan.nextLine();
        int order = Integer.parseInt(orderIn);

        System.out.print("What is the state? ");
        String state = scan.nextLine();

        if(state.equals(wisconsin))
        {
            double rate = 0.055;
            System.out.println("The subtotal is $" + order);
            double tax = order * rate;
            String taxRound = formatter.format(tax);

            System.out.println("The tax is " + taxRound);
            String total = formatter.format(tax+order);
            System.out.println("The total is " + total);
        }
        else
        {
            System.out.println("The total is $" + order);

        }
    }
}


/*
    Take order amount
    Take state
    If wi then rate = .055
    Else display total

 */