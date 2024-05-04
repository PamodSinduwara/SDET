package com.sdet.assignments.four.question_3;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class FileLineCounter {
    public static int countLines(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        int lines = 0;

        try {
            while (reader.readLine() != null) {
                lines++;
            }
        } finally {
            reader.close();
        }

        return lines;
    }

    public static void main(String[] args) {
        String filePath = "C:\\Users\\Sinduwara_106261\\Documents\\SDET_Assignment_4\\src\\main\\java\\com\\sdet\\assignments\\four\\question_3\\file.txt";

        try {
            int lineCount = countLines(filePath);
            System.out.println("Number of lines in the file: " + lineCount);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
