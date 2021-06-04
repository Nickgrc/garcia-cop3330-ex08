import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Nickolas Garcia
 */



public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many people? ");
        String people = in.nextLine();

        System.out.print("How many pizzas do you have? ");
        String pizza = in.nextLine();

        System.out.print("How many slices per pizza? ");
        String slices = in.nextLine();

        int a = Integer.parseInt(people);
        int b = Integer.parseInt(pizza);
        int c = Integer.parseInt(slices);
        int slice = b * c;
        int piece = slice / a;
        //calculating leftovers 
        int left = slice % a;

        System.out.println(people + " people with " + pizza + " pizzas " + "(" + slice + " slices)");
        System.out.println("Each person gets " + piece + " pieces of pizza.");
        System.out.println("There are " + left + " leftover pieces.");


    }
}
