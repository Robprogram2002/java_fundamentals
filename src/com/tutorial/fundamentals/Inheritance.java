package com.tutorial.fundamentals;

import java.util.Date;

class GenericPerson {
    // the protected keyword is used to allow child classes to access the properties on the father class.
    // So if the property on the father class is protected this means that all child classes can access directly
    // to this property.

    protected String name;
    protected String address;
    protected char gender;
    protected int age;

    public GenericPerson(String name, String address, char gender, int age) {
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.age = age;
    }

    // we use the final keyword on the methods of a class to tell java that these
    // methods cannot be overridden by the child classes.

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public final String getAddress() {
        return address;
    }

    public final void setAddress(String address) {
        this.address = address;
    }

    public final char getGender() {
        return gender;
    }

    public final void setGender(char gender) {
        this.gender = gender;
    }

    public final int getAge() {
        return age;
    }

    public final void setAge(int age) {
        this.age = age;
    }
}

// to inherit from a class we have to use the extends keyword and the name of the father class
// we can use the final keyword in a class to tell java that this class cannot be used as a father class,i.e.,
// cannot have a child class
final class Employee extends GenericPerson {
    // here we use the final keyword to tell java that this property must not be changed
    private final long employeeId;
    private double salary;
    private String job;
    private static long employeesCounter;

    public Employee(String name, String address, char gender, int age, double salary, String job ) {
        // the constructor of a class is not inherit from default. We must call the super keyword to call
        // the constructor of the father class. Depending on the number of attributes that we pass to the super
        // keyword is the constructor that would match this call (since the father class may have several constructor
        // functions)
        super(name, address, gender, age);
        Employee.employeesCounter++;
        this.employeeId = Employee.employeesCounter;
        this.salary = salary;
        this.job = job;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public static long getEmployeesCounter() {
        return Employee.employeesCounter;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", employeeId=" + employeeId +
                ", salary=" + salary +
                ", job='" + job + '\'' +
                "} ";
    }
}

final class Customer extends GenericPerson {
    private final long customerId;
    private final Date createdAt;
    private boolean vip;
    private static long customerCount;

    public Customer(String name, String address, char gender, int age, boolean vip, Date registerDate) {
        super(name, address, gender, age);
        Date dateObj = new Date();
        Customer.customerCount++;
        this.customerId = Customer.customerCount;
        this.vip= vip;
        this.createdAt = registerDate;
    }

    public long getCustomerId() {
        return customerId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }


    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public static long getCustomerCount() {
        return Customer.customerCount;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", customerId=" + customerId +
                ", createdAt=" + createdAt +
                ", vip=" + vip +
                '}';
    }
}

public class Inheritance {
    public static void main(String[] args) {
        System.out.println("Hello");
        // String name, String address, char gender, int age, double salary, String job
        Employee david = new Employee("David", "Fracc: My colonia", 'M', 32, 2300.50, "Publicist");
        Customer jenny = new Customer("Jenny", "Fracc. Sant Barbara", 'F', 19, true, new Date());
        System.out.println(david.toString());
        System.out.println(jenny.toString());

        System.out.println(Employee.getEmployeesCounter());
        System.out.println(Customer.getCustomerCount());
    }
}
