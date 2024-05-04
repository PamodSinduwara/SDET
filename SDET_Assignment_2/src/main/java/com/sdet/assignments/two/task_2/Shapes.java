package com.sdet.assignments.two.task_2;

public class Shapes {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 10);

        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());

        Square square = new Square(5);

        System.out.println("Square Area: " + square.getArea());
        System.out.println("Square Perimeter: " + square.getPerimeter());
    }
}
