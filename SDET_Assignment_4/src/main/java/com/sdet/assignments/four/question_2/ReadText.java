package com.sdet.assignments.four.question_2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadText {

    public static void main(String[] args){

        new ReadText().readText();
    }

    public void readText(){
        try (Scanner scanner = new Scanner(new File("C:\\Users\\Sinduwara_106261\\Documents\\SDET_Assignment_4\\src\\main\\java\\com\\sdet\\assignments\\four\\question_2\\name.txt"))){
            while(scanner.hasNext()) {
                System.out.println(scanner.next());
            }
        }catch(FileNotFoundException fex){
            System.out.println("Unable to find the file");
        }
    }
}
