package com.tutorial.proyect1_sells;

import java.util.List;

public class Order {
    public static long ordersCount;
    private final long orderId;
    private final List<OrderItem> items;
    private double total;

    public Order(List<OrderItem> items) {
        ordersCount++;
        this.orderId = ordersCount;
        this.items = items;
        this.total = this.calculateTotal();
    }

    private double calculateTotal() {
        double sum = 0;
        for (OrderItem item : items) {
            sum = sum + item.getTotal();
        }

        return sum;
    }

    private int getProductIndex(long productId) {
        int index = -1;
        for (OrderItem item:
                this.items) {
            if (item.getProduct().getProductId() == productId) {
                index = (int) productId;
                break;
            }
        }

        return index;
    }

    public static long getOrdersCount() {
        return ordersCount;
    }

    public long getOrderId() {
        return orderId;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public double getTotal() {
        return total;
    }

    public void addOrderItem(Product product, int quantity) {
        int index = this.getProductIndex(product.getProductId());


        if (index == -1 ) {
            // the product is new
            OrderItem newItem = new OrderItem(product,quantity);
            this.items.add(newItem);
            this.total = this.calculateTotal();
        }else {
            OrderItem selectedItem = this.items.get((index));
            selectedItem.setQuantity(selectedItem.getQuantity() + quantity);
            this.total = this.calculateTotal();
        }
    }

    public void updateOrderItem(long productId, boolean upp) {
        int index = this.getProductIndex(productId);
        this.items.get(index).changeOneQuantity(upp);
        this.total = this.calculateTotal();
    }

    public void removeOrderItem(long productId) {
        int index = this.getProductIndex(productId);
        this.items.remove(index);
        this.total = this.calculateTotal();
    }

    @Override
    public String toString() {
        StringBuilder display = new StringBuilder();

        System.out.println("Order number : " + this.getOrderId() + "/" + Order.getOrdersCount());
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
