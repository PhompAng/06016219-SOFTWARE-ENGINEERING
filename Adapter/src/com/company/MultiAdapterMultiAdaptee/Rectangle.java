package com.company.MultiAdapterMultiAdaptee;

/**
 * Created by phompang on 11/26/2016 AD.
 */
public class Rectangle implements Shape {
    private LegacyRectangle adaptee;

    public Rectangle(LegacyRectangle adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public double area(int x1, int y1, int x2, int y2) {
        return adaptee.area(x1, y1, Math.abs(x2-x1), Math.abs(y2-y1));
    }
}
