package excel;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingOnExcelFile {

    //private static final String FILE_NAME = System.getProperty("user.dir" + "/DataTest/ExcelWriteSample1.xlsx");
    private static final String FILE_NAME = "DataTest/Sample1.xlsx";

    public static void main(String[] args) throws IOException {
        //creating excel workbook object of XSSFWorkbook class
        XSSFWorkbook workbook = new XSSFWorkbook();
        /*
        NoClassDefFoundError indicates that the classloader, which is responsible for
        dynamically loading classes, cannot find the .class file for the class that you're trying to use.
        The code wouldn't compile if the required classes weren't present (unless classes are loaded with reflection),
        so usually this exception means that your classpath doesn't include the required classes.
        */
        XSSFSheet worksheet = workbook.createSheet("groceryList"); //more dynamic

        //we are going to use Object type of 2D array here to insert values based on this array
        Object[][] stDetails = {
                {"S No", "Fruits", "Vegetables", "ResponsiblePerson"},//these are rows we are creating for the Excel header
                {"1", "Jack Fruit", "Potato", "Wazed"},
                {"2", "Grape Fruit", "Broccoli", "Nipa"},
                {"3", "Star Fruit", "Eggplant", "Mohiuddin"},
                {"4", "Green Apple", "Radish", "Sharmin"},
                {"5", "Golden Apple", "Cabbage", "Nahian"},
                {"6", "Qwe", "Turnip", "Tanku"},
                {"7", "Strawberry", "Pineapple", "Laizu"},
                {"8", "Blueberry", "Pomegranate", "Sardil"},
                {"9", "Blackberry", "Date", "Sadia"},
                {"10", "Banana", "Orange", "Randle"}
        };
        int rowNum = 0;
        System.out.println("Excel file created");

        //we are using for each loop
        for (Object[] details : stDetails) {
            Row row = worksheet.createRow(rowNum ++);
            int columnNumber = 0; //columnNumber starts with 0

            for (Object field : details) {//nested for loop
                Cell cell = row.createCell(columnNumber ++);
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
