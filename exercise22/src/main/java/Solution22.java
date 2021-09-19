/*
 *   UCF COP3330 Fall 2021 Assignment 2 Solution
 *   Copyright 2021 Alexander Zommer
 */

import java.util.Scanner;

public class Solution22 {
    private static final Scanner scan = new Scanner(System.in);

    private static int maxSearch(int[] arr,int size)
    {
        int max = arr[0];

        for(int i=1; i<size; i++)
        {
            if(arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    public static void main(String[] args) {
        int[] numbers = new int[3];

        System.out.print("Enter the first number: ");
        String num1In = scan.nextLine();
        numbers[0] = Integer.parseInt(num1In);

        System.out.print("Enter the second number: ");
        String num2In = scan.nextLine();
        numbers[1] = Integer.parseInt(num2In);

        System.out.print("Enter the third number: ");
        String num3In = scan.nextLine();
        numbers[2] = Integer.parseInt(num3In);

        int max = maxSearch(numbers,3);

        System.out.println("The largest number is " + max + ".");
    }

}


/*
    Take input for numbers 1, 2 ,3
    Save into an array
    Sort the array in a separate method
 */