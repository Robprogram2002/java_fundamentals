package com.tutorial.fundamentals;

import java.util.Scanner;

public class parse_types {
    public static void main (String[] args) {
        int age = Integer.parseInt("20");
        System.out.println("The age is: " + (age + 1));

        double pi = Double.parseDouble("3.1416");
        System.out.println("the pi value is: " + pi);

        Scanner console = new Scanner(System.in);
        System.out.println("Please, enter your age: ");
        int user_age =  Integer.parseInt(console.nextLine());

        if (user_age > 18) {
            System.out.println("You are an adult");
        }else{
            System.out.println("You are not an adult");
        }

        // we can parse numbers into text
        String textAge = String.valueOf(21);
        System.out.println("Age in text is: " +  textAge);

        // for example, we can take only the first character that the user type
        System.out.println("Please take a number between 0 to 9");
        char charNumber = console.nextLine().charAt(1);
        System.out.println("Your number is: " + charNumber);
    }

}
