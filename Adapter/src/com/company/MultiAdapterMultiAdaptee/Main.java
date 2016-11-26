package com.company.MultiAdapterMultiAdaptee;

public class Main {

    public static void main(String[] args) {
	    LegacyRectangle legacyRectangle = new LegacyRectangle();
        Shape shape = new Rectangle(legacyRectangle);
        System.out.println("Rectangle area: " + shape.area(0, 0, 10, 20));

        LegacyLine legacyLine = new LegacyLine();
        Shape shape1 = new Line(legacyLine);
        System.out.println("Line length: " + shape1.area(0, 0, 10, 20));

        Shape[] shapes = {new Rectangle(new LegacyRectangle()), new Line(new LegacyLine())};
        for (int i=0; i<shapes.length; i++) {
            System.out.println(shapes[i].area(0, 0, 10, 20));
        }
    }
}
