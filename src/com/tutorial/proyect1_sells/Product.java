package com.tutorial.proyect1_sells;

public class Product {
    private static long productsCount;
    private double price;
    private String name;
    private final long productId;
    private String category;

    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.productId = productsCount++;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getProductId() {
        return productId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public static long getProductsCount() {
        return Product.productsCount;
    }

    @Override
    public String toString() {
        return "Product{" + "price=" + price +
                ", name='" + name + '\'' +
                ", productId=" + productId +
                ", category='" + category + '\'' +
                '}';
    }
}
