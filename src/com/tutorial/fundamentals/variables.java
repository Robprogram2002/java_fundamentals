package com.tutorial.fundamentals;

public class variables {
    public static void main (String[] args) {
        // what is a variable ?
        // In Java there are primitive data types and Reference data types
        // Two examples of primitive data types are integers and floating points
        int myInteger = 10;  // In java variables are named in camel case format
        System.out.println(myInteger);

        // we change the value of the variable
        myInteger = 5;
        System.out.println(myInteger);

        // Note that we cannot redefine a variable (in the same scope) , the following line would cause an exception
        // byte myInteger = 6;

        // Java can infer the type of variable based on the type of the data value. For this, we ust use the var keyword to tell
        // java compiler infer the type.

        var myFloat = 12.22;
        var myString = "Some random string";

        System.out.println(myString);

        // Finally, we can concatenate two strings with the following syntax
        String name = "Robert";
        String degree = "Ph.D Physics";
        var union = name + ", " + degree;

        System.out.println(union);

        // *****************************
        // Note : Difference between a primitive type and a reference type

        // when we store a primitive type in a variable, java create a space in memory where the data is placed
        // and the variable hold the actual data. If the variable is created in the scope of a method. Then when
        // the method finish the variable and the space in memory is destroyed.

        //Example:
        var X = 10;
        var Y = X;

        // what happened here?
        // variable Y was assigned the value that the variable X hold. This value is the actual data in memory since
        // the data type is a primitive type. Then Y hold the data 10. Now these two variables are completely independent
        // they are place in different locations in memory and no way of reference is created.

        // SO, if we change variable X.
        X = 120;

        // what occurs to variable Y ?
        // Nothing, since the variables are independent the value of Y don't change is still 10.

        System.out.println(X);
        System.out.println(Y);

        // Now if the data is not a primitive type but a more complex type like a class instance, for example
        var objectX = new Person();
        objectX.name = "Patric";
        objectX.age = 22;
        var objectY = objectX;

        // then the variable objectX is a reference variable as well as the objectY variable.
        // In this case, the objectX variable does not hold the actual data (the actual object) instead the variable hold
        // the direction in memory where the data is stored. Since, the actual value that we are assigning in variable
        // objectY is the direction to the same place in memory.
        // For this reason, if we use one of those variables to change the actual data stored in memory, both variables
        // will note the changed because they are referring to the same data (and that data was changed)

        objectY.name = "Pearson";

        objectX.show_info();
        objectY.show_info();
    }
}
