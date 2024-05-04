package com.sdet.assignments.one.question_4;
import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int number = scanner.nextInt();
        scanner.close();

        int[] digitCount = new int[10];

        while (number != 0) {
            int digit = number % 10;
            switch (digit) {
                case 0:
                    digitCount[0]++;
                    break;
                case 1:
                    digitCount[1]++;
                    break;
                case 2:
                    digitCount[2]++;
                    break;
                case 3:
                    digitCount[3]++;
                    break;
                case 4:
                    digitCount[4]++;
                    break;
                case 5:
                    digitCount[5]++;
                    break;
                case 6:
                    digitCount[6]++;
                    break;
                case 7:
                    digitCount[7]++;
                    break;
                case 8:
                    digitCount[8]++;
                    break;
                case 9:
                    digitCount[9]++;
                    break;
                default:
                    System.out.println("Invalid digit found!");
            }
            number /= 10;
        }

        System.out.println("Individual number count:");
        for (int i = 0; i < 10; i++) {
            if (digitCount[i] > 0) {
                System.out.println("Digit " + i + ": " + digitCount[i]);
            }
        }
    }
}
