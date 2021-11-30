package com.tutorial.fundamentals;

class Person {
    // class without a constructor function.
    // class' attributes, they are not initialized, then it's values are the default for each data type.
    String name;
    String title;
    int age;
    char gender;

    // This keyword:
    // it is a variable that is created automatically by the compiler when an object method is been executed.Then,
    // the variable hold a reference to the object that is being executed at the moment.

    public String changeName(String new_name) {
        var old_name = this.name;
        this.name = new_name;

        return old_name;
    }

    public void show_info() {
        System.out.println("name: " + name + "\n" + "age: " + age);
    }
}

class Driver {
    String name;
    String title;
    int age;

    // the constructor of a function must be named with the same name of the class.
    // The constructor is called automatically when a class is instantiated.
    // Indeed, we can have more than one constructor in a class.
    // We can have an empty constructor (where the properties would not be initialized) and a not empty constructor
    // when we expect arguments to initialize the properties of the class instance

    public Driver () {
        System.out.println("Constructor empty is being executed");
    }

    public Driver (String name) {
        System.out.println("Constructor not empty is being executed");
        this.name = name;
        this.title = "Driver";
        this.age = 18;
    }
}

// encapsulation of a class: using private properties, setters and getters.

class Animal {
    private String name;
    private int age;
    private String family;
    private int legs;
    private double weight;
    private boolean alive;
    private final int id;

    // remember a static property is one that is attached to the class and not to an instance of the class.
    // Then it would be shared across all the class instances. The same happens for static methods, they are attached to
    // the class and are shared to all instances.
    private static int counter;

    public Animal (String name, int age, String family, int legs, double weight, boolean alive) {
        // we can have access to a static property by the name of the class.
        Animal.counter++;
        this.name = name;
        this.age = age;
        this.family = family;
        this.legs = legs;
        this.weight = weight;
        this.alive = alive;
        this.id = Animal.counter;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFamily() {
        return this.family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public int getLegs() {
        return this.legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isAlive() {
        return this.alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public int getId() {
        return this.id;
    }

    public static int getCounter() {
        return Animal.counter;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", family='" + family + '\'' +
                ", legs=" + legs +
                ", weight=" + weight +
                ", alive=" + alive +
                ", id=" + id +
                '}';
    }
}


public class classes {
    public static void main(String[] args) {
        // on the right we create the object in memory and on the left we assign the direction of that data in memory
        // (a reference)
        Person adam = new Person();
        adam.name = "Adam";
        adam.age = 42;
        adam.title = "Lawyer";
        adam.gender = 'M';

        adam.show_info();

        // Note that adam is a reference variable that holds the direction where the actual data of the Person class
        // instance is stored and memory. Since we can access to the properties and methods of the object using the
        // variable (because it knows where these things are stored)
        // In java the directions stored in reference variables are hexadecimal claves in the form : 0x333

        System.out.println(adam);

        Driver smith = new Driver("Smith");
        Driver philip = new Driver();

        Animal myDog = new Animal("doli", 12, "canine", 4, 14.50, true);
        System.out.println(myDog.getFamily());
        System.out.println(myDog.getName());

        myDog.setName("Dolores");
        myDog.setAlive(false);
        System.out.println(myDog.isAlive());
        System.out.println(myDog.getName());

        // we cannot do this since name is a private property and can only be access from inside the class.
        // myDog.name = "some random name";

        System.out.println(myDog.toString());
        Animal myCat = new Animal("firulais", 7, "feline", 4, 5.50, false);
        // we can access to a static method from the class itself and not from an instance
        System.out.println(Animal.getCounter());
        System.out.println(myCat.getId());
    }
}
