package com.company.Default;

public class Main {

    public static void main(String[] args) {
	    LegacyRectangle legacyRectangle = new LegacyRectangle();
        Shape shape = new Rectangle(legacyRectangle);
        System.out.println("Rectangle area: " + shape.area(0, 0, 10, 10));
    }
}
