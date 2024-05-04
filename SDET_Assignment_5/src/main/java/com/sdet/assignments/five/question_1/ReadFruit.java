package com.sdet.assignments.five.question_1;

import java.io.*;

public class ReadFruit {
    public static void main(String[] args) {
        String inputFilePath = "C:\\Users\\Sinduwara_106261\\Documents\\SDET_Assignment_5\\src\\main\\java\\com\\sdet\\assignments\\five\\question_1\\Assignment 5 Fruits.txt";
        String outputFilePath = "C:\\Users\\Sinduwara_106261\\Documents\\SDET_Assignment_5\\src\\main\\java\\com\\sdet\\assignments\\five\\question_2\\Vowels Fruit.txt";
        try {
            checkFruits(inputFilePath,outputFilePath);
            System.out.println("Vowel extraction is successful");
        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
    public static boolean checkVowels(String word){
        char firstChar = Character.toLowerCase(word.charAt(0));
        return firstChar=='a'||firstChar=='e'||firstChar=='i'||firstChar=='o'||firstChar=='u';
    }

    public static void checkFruits(String inputFile, String outputFile) throws IOException {
        try(BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            PrintWriter writer = new PrintWriter(new FileWriter(outputFile))){
            String line;

            while((line=reader.readLine())!=null){
                String[] words = line.split(",\\s*");
                for (String word: words) {
                    if (checkVowels(word)) {
                        writer.println(word);
                    }
                }
            }
        }
    }
}
