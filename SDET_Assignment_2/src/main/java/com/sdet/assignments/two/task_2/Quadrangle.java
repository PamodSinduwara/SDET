package com.sdet.assignments.two.task_2;

abstract class Quadrangle {
    protected int length;
    protected int width;

    public Quadrangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public abstract int getArea();
    public abstract int getPerimeter();
}
