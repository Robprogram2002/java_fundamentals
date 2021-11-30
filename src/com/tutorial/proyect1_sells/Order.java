package com.tutorial.proyect1_sells;

import java.util.Arrays;

public class Order {
    public static long ordersCount;
    private final long orderId;
    private final OrderItem[] items;
    private double total;

    public Order(OrderItem[] items) {
        this.orderId = ordersCount++;
        this.items = items;
    }

    public static long getOrdersCount() {
        return ordersCount;
    }

    public long getOrderId() {
        return orderId;
    }

    public OrderItem[] getItems() {
        return items;
    }

    public double getTotal() {
        double sum = 0;
        for (OrderItem item : items) {
            sum = sum + item.getTotal();
        }

        this.total = sum;

        return total;
    }

    public void addOrderItem(Product product, int quantity) {
        long index = -1;
        for (OrderItem item:
             this.items) {
            if (item.getProduct().getProductId() == product.getProductId()) {
                index = product.getProductId();
                break;
            }
        }

        if (index == -1 ) {
            // the product is new
            System.out.println("At a new product");
        }else {
            this.items[(int)index].setQuantity(this.items[(int)index].getQuantity() + quantity);
        }
    }

    @Override
    public String toString() {
        StringBuilder display = new StringBuilder();

        for (OrderItem item:
             this.items) {
            var quantity = item.getQuantity();
            var name = item.getProduct().getName();
            var price = item.getProduct().getPrice();
            display.append(quantity).append("\t").append(name).append("\t\t").append(price).append("\t\t")
                    .append(item.getTotal()).append("\n");
        }

        display.append("\n TOTAL : ").append(this.getTotal()).append('\n');

        return display.toString();
    }
}
