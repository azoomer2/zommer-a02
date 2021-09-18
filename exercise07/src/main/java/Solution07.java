/*
 *   UCF COP3330 Fall 2021 Assignment 2 Solution
 *   Copyright 2021 Alexander Zommer
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution07 {
    static final double m2tof2conv = 0.09290304;
    private static final Scanner scan = new Scanner(System.in);

    private static double f2tom2conversion(double f2)
    {
        return f2*m2tof2conv;
    }


    public static void main(String[] args)
    {
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(3);

        System.out.print("What is the length of the room in feet? ");
        String input = scan.nextLine();
        double length = Double.parseDouble(input);

        System.out.print("What is the width of the room in feet? ");
        String input2 = scan.nextLine();
        double width = Double.parseDouble(input2);

        System.out.println("You entered dimensions of " + length + " feet by " + width + " feet.");
        System.out.println("The area is");

        double area = width * length;
        double aream2 = f2tom2conversion(area);
        System.out.println(area + " square feet");
        System.out.println(df.format(aream2) + " square meters");


    }
}

/*  Take length input
    Take width input
    Print dimensions
    Calculate area in sqft
    Convert sqft to m2 using function
 */