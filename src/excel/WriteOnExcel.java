package excel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteOnExcel {

    private static final String FILE_NAME = "DataTest/Sample2.xlsx";

    public static void main(String[] args) {

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet= workbook.createSheet("menuDetails");

        Object[][] partyDetails = {
                {"S_No", "Appetizers", "Drinks","Meat_Items", "Vegetable_Items", "Desert_Items"},
                {"1", "Chips", "Coca-cola","Turkey", "Alu_Bhaji", "Faluda"},
                {"2", "Fuska", "Sprite","Chicken_Roast", "Mixed_Vegetables", "Yogurt"},
                {"3", "Pakora", "Lassi","Beef_Bhuna", "Vindaloo", "Rosogolla"},
                {"4", "Daal_Puri", "Yogurt_Drink","Chicken_cutlet", "Bean_Bhaji", "Chomchom"},
                {"5", "Shinggara", "Water","Goat_Curry", "Potato_Curry", "Golapjamon"}
        };
        int rowNum = 0;
        System.out.println("Excel file created");

        for (Object[] pDatils : partyDetails) {
            Row row = sheet.createRow(rowNum ++);
            int colNum = 0;

            for (Object field : pDatils) {
                Cell cell = row.createCell(colNum++);
                if (field instanceof String){
                    cell.setCellValue((String) field);
                }else if (field instanceof Integer){
                    cell.setCellValue((Integer) field);
                }
            }
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(FILE_NAME);
            workbook.write(fileOutputStream);
            workbook.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException io){
            io.printStackTrace();
        }
        System.out.println("Done");
    }
}
