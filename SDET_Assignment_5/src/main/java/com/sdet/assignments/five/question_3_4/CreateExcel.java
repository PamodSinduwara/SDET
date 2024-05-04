package com.sdet.assignments.five.question_3_4;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateExcel {
    public static void main(String[] args) {

        try (Workbook workbook = new XSSFWorkbook()) {
            Sheet sheet = workbook.createSheet("Numeric Types");
            Row headerRow = sheet.createRow(0);
            headerRow.createCell(0).setCellValue("Numeric Type");
            headerRow.createCell(1).setCellValue("Min Value");
            headerRow.createCell(2).setCellValue("Max Value");
            String[] numericTypes = {"byte", "short", "int", "long", "float", "double"};
            Number[] minValues = {Byte.MIN_VALUE, Short.MIN_VALUE, Integer.MIN_VALUE, Long.MIN_VALUE, -Float.MAX_VALUE, -Double.MAX_VALUE};
            Number[] maxValues = {Byte.MAX_VALUE, Short.MAX_VALUE, Integer.MAX_VALUE, Long.MAX_VALUE, Float.MAX_VALUE, Double.MAX_VALUE};

            for (int i = 0; i < numericTypes.length; i++) {
                Row row = sheet.createRow(i + 1);
                row.createCell(0).setCellValue(numericTypes[i]);
                row.createCell(1).setCellValue(String.valueOf(minValues[i]));
                row.createCell(2).setCellValue(String.valueOf(maxValues[i]));
            }

            try (FileOutputStream fileOut = new FileOutputStream("C:\\Users\\Sinduwara_106261\\Documents\\SDET_Assignment_5\\src\\main\\java\\com\\sdet\\assignments\\five\\question_3_4\\NumericTypes.xlsx")) {
                workbook.write(fileOut);
                System.out.println("Excel file has been created successfully!");
            }
            readDataFromExcel();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void readDataFromExcel(){
        try (FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Sinduwara_106261\\Documents\\SDET_Assignment_5\\src\\main\\java\\com\\sdet\\assignments\\five\\question_3_4\\NumericTypes.xlsx");
             Workbook workbook = new XSSFWorkbook(fileInputStream)) {
            Sheet sheet = workbook.getSheetAt(0);

            for (Row row : sheet) {
                if(row.getRowNum()!=0){
                    System.out.print("Data Type: "+ row.getCell(0) + "\t");
                    System.out.print("Max Value: "+ row.getCell(1) + "\t");
                    System.out.print("Min Value: "+ row.getCell(2));
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
