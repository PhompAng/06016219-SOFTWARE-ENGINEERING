package com.company;

/**
 * Created by phompang on 11/27/2016 AD.
 */
public class HighResImage implements Image {

    private String name;

    public HighResImage(String name) {
        this.setName(name);
    }


    @Override
    public void show() {
        loadImage(name);
    }

    private void loadImage(String name) {
        System.out.println("loading high res image: " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
