package com.tutorial.proyect1_sells;

public class OrderItem {
    private final Product product;
    private int quantity;
    private double total;

    public OrderItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
        this.total = product.getPrice() * quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotal() {
        return total;
    }

    public void setQuantity(int newQuantity) {
        var dif = newQuantity - this.quantity;
        this.quantity = newQuantity;
        this.total = this.total + dif*this.product.getPrice();
    }

    public void changeOneQuantity(boolean up) {
        if (up) {
            setQuantity(this.quantity + 1);
        } else {
            setQuantity(this.quantity - 1);
        }
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "product=" + product.toString() +
                ", quantity=" + quantity +
                ", total=" + total +
                '}';
    }
}
