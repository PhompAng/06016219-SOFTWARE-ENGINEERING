package com.company;

/**
 * Created by phompang on 11/27/2016 AD.
 */
public class ImageProxy implements Image {

    private HighResImage highResImage;
    private String name;

    public ImageProxy(String name) {
        this.setName(name);
        System.out.println("Loading proxy Image:" + name);
    }

    @Override
    public void show() {
        if (highResImage == null) {
            highResImage = new HighResImage(name);
        }
        highResImage.show();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
