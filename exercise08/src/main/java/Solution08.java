/*
 *   UCF COP3330 Fall 2021 Assignment 2 Solution
 *   Copyright 2021 Alexander Zommer
 */



import java.util.Scanner;

public class Solution08 {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("How many people? ");
        String peopleIn = scan.nextLine();
        int people = Integer.parseInt(peopleIn);

        System.out.print("How many pizzas do you have? ");
        String pizzasIn = scan.nextLine();
        int pizzas = Integer.parseInt(pizzasIn);

        System.out.print("How many slices per pizza? ");
        String slicesIn = scan.nextLine();
        int slices = Integer.parseInt(slicesIn);

        int totalSlices = slices *  pizzas;

        System.out.println(people + " people with " + pizzas + " pizzas (" + totalSlices + " slices)");

        int slicesPer = totalSlices / people;
        int remainderSlices = totalSlices % people;

        System.out.println("Each person gets " + slicesPer + " pieces of pizza.");
        System.out.println("There are " + remainderSlices + " leftover pieces.");

    }

}

/*
    Take input for how many people
    Take input for number of pizzas
    Take input for slices per pizza
    Print out the total people, pizzas, and total slices
    Calculate how many slices per person (% operator)
    Print the slices per person
    Print the remainder from the %
 */

