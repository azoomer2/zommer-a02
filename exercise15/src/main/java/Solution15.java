/*
 *   UCF COP3330 Fall 2021 Assignment 2 Solution
 *   Copyright 2021 Alexander Zommer
 */


import java.util.Scanner;

public class Solution15 {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        String correctPass = "abc$123";

        System.out.print("Enter your username: ");
        String username = scan.nextLine();

        System.out.print("What is the password? ");
        String passwordEntered = scan.nextLine();

        if(passwordEntered.equals(correctPass))
        {
            System.out.print("Welcome " + username + "!");
        }
        else{
            System.out.print("You are not " + username);
        }
    }
}




/*
    Prompt for username
    Prompt for password
    If passwordIn = password Greet user
    Else deny user

 */