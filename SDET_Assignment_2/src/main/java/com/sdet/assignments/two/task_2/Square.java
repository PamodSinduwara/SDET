package com.sdet.assignments.two.task_2;

public class Square extends Quadrangle{

    public Square(int length) {
        super(length, length);
    }


    public int getArea() {
        return length * length;
    }

    @Override
    public int getPerimeter() {
        return 4 * length;
    }

}
