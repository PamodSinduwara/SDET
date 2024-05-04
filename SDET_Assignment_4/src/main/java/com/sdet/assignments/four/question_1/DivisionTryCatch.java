package com.sdet.assignments.four.question_1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionTryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter the denominator: ");
            int denominator = scanner.nextInt();

            if (denominator == 0) {
                System.out.println("Result: NaN");
            } else {
                int result = numerator / denominator;
                System.out.println("Result: " + result);
            }
        } catch (InputMismatchException e) {
            System.out.println("Entered value was not an integer");
        } catch (ArithmeticException e) {
            System.out.println("Result: NaN");
        } finally {
            scanner.close();
        }
    }
}
