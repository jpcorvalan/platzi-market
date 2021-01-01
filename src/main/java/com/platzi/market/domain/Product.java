package com.platzi.market.domain;

public class Product {

    private int productId;
    private String name;
    private int categoryId;
    private double price;
    private int stock;
    private boolean active;
    private Category category;



    //-----Setters-----
    private void setProductId(int productId) {
        this.productId = productId;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    private void setPrice(double price) {
        this.price = price;
    }

    private void setStock(int stock) {
        this.stock = stock;
    }

    private void setActive(boolean active) {
        this.active = active;
    }

    private void setCategory(Category category) {
        this.category = category;
    }



    //-----Getters-----
    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public boolean isActive() {
        return active;
    }

    public Category getCategory() {
        return category;
    }
}
