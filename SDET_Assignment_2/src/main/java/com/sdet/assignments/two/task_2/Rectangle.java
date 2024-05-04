package com.sdet.assignments.two.task_2;

public class Rectangle extends Quadrangle{

    public Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    public int getArea() {
        return length * width;
    }

    @Override
    public int getPerimeter() {
        return 2 * (length + width);
    }
}
