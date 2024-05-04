package com.sdet.assignments.one.question_5;

public class ProductCal {

    public static void main(String[] args) {
        int product = 1;

        for (int i = 1; i <= 15; i += 2) {
            product *= i;
        }

        System.out.println("Product of odd integers from 1 to 15: " + product);
    }
}
