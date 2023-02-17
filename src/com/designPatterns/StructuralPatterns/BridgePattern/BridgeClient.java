package com.designPatterns.StructuralPatterns.BridgePattern;

public class BridgeClient {
    public static void main(String[] args) {
        // the main code will be written here
        // code

        // creating color classes
        IColor red = new RedColor();
        IColor green = new GreenColor();

        // creating shape classes
        Shape triangle = new Triangle(green, 20);
        Shape rectangle = new Rectangle(red, 50);

        // ============ printing the triangle =================
        System.out.println("Coloring Triangle:");
        triangle.drawShape();

        // change the triangle border width 3 times
        triangle.modifyShape(3);

        // print the new triangle
        triangle.drawShape();


        // ============ printing the rectangle =================
        System.out.println("\nColoring Rectangle:");
        rectangle.drawShape();

        // change the rectangle border width 2 times
        rectangle.modifyShape(2);

        // print the new triangle
        rectangle.drawShape();

    }
}
