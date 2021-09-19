/*
 *   UCF COP3330 Fall 2021 Assignment 2 Solution
 *   Copyright 2021 Alexander Zommer
 */



import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution10 {
    private static final Scanner scan = new Scanner(System.in);


    private static int promptPrice(int itemNum) {
        System.out.print("Enter the price of item " + itemNum + " :");
        String input = scan.nextLine();
        return Integer.parseInt(input);

    }

    private static int promptQuantity(int itemNum) {
        System.out.print("Enter the quantity of item " + itemNum + " :");
        String input = scan.nextLine();
        return Integer.parseInt(input);
    }


    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);

        int price1 = promptPrice(1);
        int quantity1 = promptQuantity(1);

        int price2 = promptPrice(2);
        int quantity2 = promptQuantity(2);

        int price3 = promptPrice(3);
        int quantity3 = promptQuantity(2);

        double subtotal = (price1*quantity1) + (price2*quantity2) + (price3*quantity3);
        double tax = subtotal * 0.055;

        System.out.println("Subtotal: $" + df.format(subtotal));
        System.out.println("Tax: $" + df.format(tax));
        System.out.println("Total: $" + (subtotal + tax));
    }
}

/*
    Take input for price and quantity of items 1-3
    Total the prices
    Calculate tax
    Print totals
 */