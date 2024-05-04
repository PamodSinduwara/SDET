package com.sdet.assignments.four.question_4;
import java.io.FileWriter;
import java.io.IOException;
public class WriteFile {
    public static void main(String[] args) {
        String message = "Please don't just copy and paste answers in the Assignment pdf. Upload the project zip files to the shared location.";
        String filename = "C:\\Users\\Sinduwara_106261\\Documents\\SDET_Assignment_4\\src\\main\\java\\com\\sdet\\assignments\\four\\question_4\\output.txt";

        FileWriter writer = null;

        try {
            writer = new FileWriter(filename);
            writer.write(message);
            System.out.println("Message written to file: " + filename);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    System.err.println("Error closing file writer: " + e.getMessage());
                }
            }
        }
    }
}
