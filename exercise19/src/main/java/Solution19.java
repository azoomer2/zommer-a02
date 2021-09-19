/*
 *   UCF COP3330 Fall 2021 Assignment 2 Solution
 *   Copyright 2021 Alexander Zommer
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution19 {
    private static final Scanner scan = new Scanner(System.in);

    public static double BMICalculator(int h, int w){
        return ((w+0.0) / (h*h))*703;
    }

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(1);

        System.out.print("Please input your weight: ");
        while(!scan.hasNextInt()){
            System.out.print("Input is not a number.");
            scan.nextLine();
        }
        int weight = scan.nextInt();

        System.out.print("Please input your height: ");
        while(!scan.hasNextInt()){
            System.out.print("Input is not a number.");
            scan.nextLine();
        }
        int height = scan.nextInt();

        double bmi = BMICalculator(height,weight);

        System.out.println("Your bmi is " + df.format(bmi));
        if(bmi < 18.5)
            System.out.print("You are underweight and should consult your doctor.");
        else if(bmi >18.5 && bmi <25)
            System.out.print("You are within the ideal weight range.");
        else
            System.out.print("You are overweight and should consult your doctor.");
    }
}

/*
    Take input for weight
    Take input for height
    calculate the bmi
    if bmi is between 18.5 and 25 print normal
    if bmi is over, print overweight message
    if bmi is under, print underweight message
 */