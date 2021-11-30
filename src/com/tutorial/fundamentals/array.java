package com.tutorial.fundamentals;

import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int[] ages = new int[4];

        ages[0] = 23;
        ages[1] = 14;
        ages[2] = 24;
        ages[3] = 120;

        /*
        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i]);
        }
        */

        for (int age : ages) {
            System.out.println(age);
        }

        Driver[] drivers = new Driver[3];
        drivers[0] = new Driver("Peter");
        drivers[1] = new Driver("James");
        drivers[2] = new Driver("Carlos");

        for (Driver object: drivers) {
            System.out.println(object.name);
        }

        String[] fruits = {"Melon", "apple", "banana", "strawberry", "berry", "pineapple"};
        for (String fruit: fruits) {
            System.out.println(fruit);
        }

        // we can also create a matrix using two arrays (one for rows and other for columns)
        int[][] matrix1 = new int[3][4];
        int[][] matrix2 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(Arrays.deepToString(matrix1));
        System.out.println(Arrays.deepToString(matrix2));
    }
}
