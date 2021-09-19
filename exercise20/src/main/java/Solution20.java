/*
 *   UCF COP3330 Fall 2021 Assignment 2 Solution
 *   Copyright 2021 Alexander Zommer
 */

import java.text.NumberFormat;
import java.util.Scanner;

public class Solution20 {
    private static final Scanner scan = new Scanner(System.in);

    private static void wiCalculator(int order)
    {
        System.out.print("What county do you live in? ");
        String county = scan.nextLine();

        if(county.equals("Eau Claire"))
            taxCalc(0.055,order);

        else if(county.equals("Dunn"))
            taxCalc(0.054,order);
        else
            taxCalc(0.05,order);

    }


    private static void taxCalc(double taxRate, int order)
    {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        double tax = taxRate*order;
        double total = tax + order;

        System.out.println("The tax is " + formatter.format(tax));
        System.out.println("The total is " + formatter.format(total));

    }

    public static void main(String[] args) {

        System.out.print("What is the order amount? ");
        String orderIn = scan.nextLine();
        int order = Integer.parseInt(orderIn);

        System.out.print("What state do you live in? ");
        String state = scan.nextLine();

        if(state.equals("Wisconsin"))
            wiCalculator(order);
        else if(state.equals("Illinois"))
            taxCalc(0.08,order);
        else
            taxCalc(0,order);
    }


}


/*
    Input for the order amount
    Take input for the state
    if state is wisconsin
        input for county
        if county is eau claire
            add 0.005 to tax
        if county is dunn
            add 0.004 to tax
    if else state is illinois
        tax is 0.08
    else
        tax = 0
 */