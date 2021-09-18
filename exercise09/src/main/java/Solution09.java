/*
 *   UCF COP3330 Fall 2021 Assignment 2 Solution
 *   Copyright 2021 Alexander Zommer
 */


import java.util.Scanner;

public class Solution09 {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Please input the length of the ceiling: ");
        String lengthIn = scan.nextLine();
        int length = Integer.parseInt(lengthIn);

        System.out.print("Please input the width of the ceiling: ");
        String widthIn = scan.nextLine();
        int width = Integer.parseInt(widthIn);

        int area = length*width;
        int paintNeeded = (int)Math.ceil((double) area / 350);

        System.out.println("You will need to purchase " + paintNeeded + " gallons of paint to cover " + area + " square feet.");
    }
}

/*
    Take input for length and width of ceiling
    Use division and Math.ceil to round up for paint needed
 */