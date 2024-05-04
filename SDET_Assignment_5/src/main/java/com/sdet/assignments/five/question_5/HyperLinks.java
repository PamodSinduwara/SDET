package com.sdet.assignments.five.question_5;

import org.apache.poi.common.usermodel.HyperlinkType;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;
import java.io.IOException;

public class HyperLinks {
    public static void main(String[] args) {

        try (Workbook workbook = new XSSFWorkbook()) {

            Sheet sheet = workbook.createSheet("Hyperlinks");
            Row headerRow = sheet.createRow(0);
            headerRow.createCell(0).setCellValue("Web Sites");
            CellStyle hyperlinkStyle = workbook.createCellStyle();
            Font font = workbook.createFont();
            font.setUnderline(Font.U_SINGLE);
            font.setColor(IndexedColors.BLUE.getIndex());
            hyperlinkStyle.setFont(font);
            createHyperlinkCell(sheet, 1, 0, "google", "https://www.google.com", hyperlinkStyle);
            createHyperlinkCell(sheet, 2, 0, "facebook", "https://www.facebook.com", hyperlinkStyle);
            createHyperlinkCell(sheet, 3, 0, "youtube", "https://www.youtube.com", hyperlinkStyle);

            try (FileOutputStream fileOut = new FileOutputStream("C:\\Users\\Sinduwara_106261\\Documents\\SDET_Assignment_5\\src\\main\\java\\com\\sdet\\assignments\\five\\question_5\\Hyperlinks.xlsx")) {
                workbook.write(fileOut);
                System.out.println("Excel file with hyperlinks created successfully.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void createHyperlinkCell(Sheet sheet, int rowIdx, int colIdx, String linkText, String linkUrl, CellStyle style) {
        Row row = sheet.getRow(rowIdx);
        if (row == null) {
            row = sheet.createRow(rowIdx);
        }
        Cell cell = row.createCell(colIdx);
        cell.setCellValue(linkText);
        CreationHelper createHelper = sheet.getWorkbook().getCreationHelper();
        Hyperlink hyperlink = createHelper.createHyperlink(HyperlinkType.URL);
        hyperlink.setAddress(linkUrl);
        cell.setHyperlink(hyperlink);

        if (style != null) {
            cell.setCellStyle(style);
        }
    }
}
