package com.sdet.assignments.five.question_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountFruit {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Sinduwara_106261\\Documents\\SDET_Assignment_5\\src\\main\\java\\com\\sdet\\assignments\\five\\question_2\\Vowels Fruit.txt";

        try {
            int fruitCount = countFruits(filePath);

            System.out.println("Number of fruits: " + fruitCount);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static int countFruits(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        int count = 0;
        while ((line = reader.readLine()) != null) {
            String[] fruits = line.split(",");
            count += fruits.length;
        }
        reader.close();
        return count;
    }
}
