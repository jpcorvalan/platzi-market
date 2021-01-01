package com.platzi.market.domain;

public class Category {

    private int categoryId;
    private String description;
    private boolean active;



    //-----Setters-----
    private void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    private void setDescription(String description) {
        this.description = description;
    }

    private void setActive(boolean active) {
        this.active = active;
    }




    //-----Getters-----
    public int getCategoryId() {
        return categoryId;
    }

    public String getDescription() {
        return description;
    }

    public boolean isActive() {
        return active;
    }
}
