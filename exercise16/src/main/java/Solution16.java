/*
 *   UCF COP3330 Fall 2021 Assignment 2 Solution
 *   Copyright 2021 Alexander Zommer
 */


import java.util.Scanner;

public class Solution16  {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("What is your age? ");
        String ageIn = scan.nextLine();
        int age = Integer.parseInt(ageIn);

        System.out.println(age >=16 ?"You are old enough to legally drive." :"You are not old enough to legally drive.");
    }
}



/*
    Prompt user for age
    If user age < 16, not old enough  to drive
    Else old enough to drive

 */