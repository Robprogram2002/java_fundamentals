package com.tutorial.fundamentals;

public class primitive_types {
    public static void main(String[] args) {
        // ******** INTEGERS
        // Int is a primitive type, but there are many types of teh int type.
        // these are: byte short, int, long
        // each of these have a specific size and range
        // 8 bits (-128, 127) , 16 bits (-32,768, 32,767), 32 bits (-2^31, 2^31 - 1), 64 bits (-2^63, 2^63 -1)


        // example :
        byte myByte = 10;
        System.out.println("Max value: " + Byte.MAX_VALUE);
        System.out.println("Min value: " + Byte.MIN_VALUE);
        System.out.println("Byte value: " + myByte);

        long myLong = 12434123;
        System.out.println("Max value: " + Long.MAX_VALUE);
        System.out.println("Min value: " + Long.MIN_VALUE);
        System.out.println("Byte value: " + myLong);

        float byteToFloat = ((float) myByte);
        // we can cast a data type to another with the following syntax when the action is allowed
        System.out.println(byteToFloat);


        // ******* FLOATS
        // there are two types of the float primitive data type:
        // > Float : 32 bits ,
        // > Double : 64 bits ,

        // by defect when we assign a floating point number to a variable, java would tell us that tha data type is double,
        // so we need to cast the data.
        float myFloat = (float) 3.1416;
        float myFloat2 = 2.3124F;
        // these two ways are equivalent, they tell to java that we want to store the data as float types

        System.out.println("float value: " + myFloat);
        System.out.println("Max value : " + Float.MAX_VALUE);
        System.out.println("Min value: " + Float.MIN_VALUE);

        double myDouble = 123.823;
        System.out.println("double value: " + myDouble);
        System.out.println("Max value: " + Double.MAX_VALUE);
        System.out.println("Min value: " + Double.MIN_VALUE);


        // ******* CHAR PRIMITIVE DATA TYPE
        // the char data type can only store a single character. But we can use it also to store unicode characters either by
        // string clave or by decimal index.

        // we must use single quotes for a character primitive type.
        char myCharacter = 'a';
        System.out.println("My character: " + myCharacter);

        // 3 different ways
        char unicodeString = '\u0021';
        char unicodeDecimal = 33;   //here java will understand since we put char type that 33 means unicode and not an integer number
        char unicodeChar = '!';

        System.out.println(unicodeChar);
        System.out.println(unicodeDecimal);
        System.out.println(unicodeString);

        // Note: if we use the var keyword, then java would infer that 33 means an integer and not a unicode clave
        var code = 33;
        System.out.println(code);

        // ***** BOOLEAN PRIMITIVE TYPE
        boolean myBoolTrue = true;
        boolean myBoolFalse = false;

        System.out.println(myBoolFalse);
        System.out.println(myBoolTrue);

    }
}




