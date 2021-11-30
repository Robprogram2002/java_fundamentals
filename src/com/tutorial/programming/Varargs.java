package com.tutorial.programming;

public class Varargs {

    // we can tell to java that we expect an unknown quantity of parameters of one type
    public static void showNumbers(int... numbers) {
        for (int number :
                numbers) {
            System.out.println("Number is : " + number);
        }
    }

    // we can combine the last feature with other specific parameters. but the varargs must always be at the end
    // they must are at the end

    public static void showTextAndNumbers(String message, int ... numbers) {
        System.out.println(message);
        Varargs.showNumbers(numbers);
    }

    public static void main(String[] args) {


        Varargs.showNumbers(2,34,123,-324,123,65,123,0);
        Varargs.showTextAndNumbers("The first six prime numbers are", 1,3,5,7,9,11);
    }
}
