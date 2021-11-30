package com.tutorial.fundamentals;

//

class AddOperator {
    public int a;
    public int b;
    // combining static and final is like declaring a constant
    public static final double PI = 3.1416;

    // we can overload the constructor of a class. Each different type of constructor must deffer by the number or
    // the type of the arguments being received

    public AddOperator() {
        //empty constructor
    }

    public AddOperator(int a) {
        // single property constructor
        this.a = a;
    }

    public AddOperator(int a, int b) {
        // complete constructor
        this.a = a;
        this.b = b;
    }

    // we have created three different constructor functions

    // In the same way, we can overload a method by creating several methods with the same name, but different types or 7
    // quantity of arguments .

    public int add() {
        return this.a + this.b;
    }

    public int add(int a , int b) {
        return a + b;
    }

    public double add (double a , double b) {
        return a + b;
    }

    public String add (String a, String b) {
        return a + b;
    }

    public double circArea (double radius) {
        return radius*2*PI;
    }
}

public class overloading {
    public static void main(String[] args) {

        // we create three different instances of the same class using the three different constructor functions
        final AddOperator operator1 = new AddOperator();
        AddOperator operator2 = new AddOperator(25);
        AddOperator operator3 = new AddOperator(14,-234);

        // note that besides we have created the variable as a final variable we can change the data that the
        // variable is referring to, since this action doesn't change actually the value of the variable just the data in memory
        // that the variable is referring.
        operator1.a = 123;
        operator1.b = -123;

        // but if we try to reassign the variable to a new reference, them we indeed receive an error.
        // operator1 = operator2;

        // we use the add method in its four different flavors (overloading)
        System.out.println(operator3.add());
        System.out.println(operator3.add(8.123, -23.12346));
        System.out.println(operator3.add(23,6));
        System.out.println(operator3.add("123", "321"));
        System.out.println(operator3.circArea(4.22));
    }

}
