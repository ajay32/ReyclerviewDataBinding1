package com.ajay.databindingexamples.Model;

public class CategoryObject {  // simple getter setter
    private String name;
    private int imageUrl;
    public CategoryObject(String name, int imageUrl) {
        this.name = name;
        this.imageUrl = imageUrl;
    }
    public String getName() {
        return name;
    }
    public int getImageUrl() {
        return imageUrl;
    }
}