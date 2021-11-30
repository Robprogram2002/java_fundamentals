package com.tutorial.fundamentals;

import java.util.Scanner;

public class user_input {
    public static void main (String[] args) {
        // we create an instance of the scanner Class. This instance will get us access to the console.
        // we can use this console object multiple times
        Scanner console = new Scanner(System.in);

        System.out.println("Please, enter your name:");
        String user_name = console.nextLine();
        System.out.println("user name : " + user_name);

        // Example:
        System.out.println("Please enter the name of the book and the author");
        String title = console.nextLine();
        String author = console.nextLine();

        System.out.println(title + " was written by " + author);
    }
}
