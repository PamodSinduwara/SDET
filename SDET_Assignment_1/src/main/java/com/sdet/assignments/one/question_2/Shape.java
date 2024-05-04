package com.sdet.assignments.one.question_2;

public class Shape {

    public static void main(String[] args) {
        int size = 4;

        for (int i = 1; i <= size; i++) {

            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = size - 1; i >= 1; i--) {
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
