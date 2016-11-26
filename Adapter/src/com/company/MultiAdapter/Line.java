package com.company.MultiAdapter;

/**
 * Created by phompang on 11/26/2016 AD.
 */
public class Line implements Shape {
    private LegacyLine adaptee;

    public Line(LegacyLine adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public double area(int x1, int y1, int x2, int y2) {
        return adaptee.length(x1, y1, x2, y2);
    }
}
