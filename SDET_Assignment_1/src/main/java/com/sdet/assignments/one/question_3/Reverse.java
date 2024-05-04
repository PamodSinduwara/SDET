package com.sdet.assignments.one.question_3;
import java.util.Scanner;

public class Reverse {

    public static int reverseNumber(int number) {
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return reversedNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        int reversedNum = reverseNumber(num);
        System.out.println("Reversed number: " + reversedNum);
    }
}
