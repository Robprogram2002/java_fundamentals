package com.tutorial.programming;

enum Days {
    // here we are declaring an enum of days. Each element in an enum is public,static and final, so they are constants.
    // by default each enum element is a String type
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

// we can create more complex enums where each element has its own properties.
enum Continents {
    Africa(53),
    America(34),
    Europe(46),
    Asia(44),
    Ocean(14);

    //we declared a property for each element
    private final int countriesNumber;

    // and we create a constructor that will be called once for each element
    Continents(int countriesNumber) {
        this.countriesNumber = countriesNumber;
    }

    // we created a method to return the property value for a specific element of the enum.
    public int getCountriesNumber() {
        return this.countriesNumber;
    }

}

public class Enums {

    public static void main(String[] args) {
        System.out.println("Today is :" + Days.TUESDAY);

        System.out.println("I live in " + Continents.America
                + "\n And the number of countries here is "
                + Continents.America.getCountriesNumber());
    }
}
