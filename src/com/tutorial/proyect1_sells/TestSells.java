package com.tutorial.proyect1_sells;

public class TestSells {

    public static void main(String[] args) {
        Product product1 = new Product("Straight Jeans", 88.00, "Clothe");
        Product product2 = new Product("Joggers white", 84.00, "Clothe");
        Product product3 = new Product("Chandal oranges", 74.00, "Fashion");
        Product product4 = new Product("Sport t-shirts", 54.99, "Shoes");

        OrderItem item1 = new OrderItem(product1, 2);
        OrderItem item2 = new OrderItem(product2, 1);
        OrderItem item3 = new OrderItem(product3, 4);
        OrderItem item4 = new OrderItem(product4, 2);

        OrderItem[] items = {item1, item2, item3, item4};
        Order myOrder = new Order(items);
        System.out.println(myOrder.toString());
        myOrder.addOrderItem(product2, 4);
        System.out.println(myOrder.toString());

    }
}
