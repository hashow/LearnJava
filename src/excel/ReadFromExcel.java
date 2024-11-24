package excel;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class ReadFromExcel {

    private static final String FILE_PATH = System.getProperty("user.dir") + "DataTest/Sample1.xlsx";

    public static void main(String[] args) {
        try {
            FileInputStream inputStream = new FileInputStream(new File(FILE_PATH));
            Workbook workbook = new XSSFWorkbook(inputStream);
            Sheet dataTypeSheet = workbook.getSheetAt(0);

            Iterator<Row> rowIterator = dataTypeSheet.iterator();
            while (rowIterator.hasNext()){
                Row currentRow = rowIterator.next();

                Iterator<Cell> cellIterator = currentRow.iterator();
                while (cellIterator.hasNext());
                Cell currentCell = cellIterator.next();
                if (currentCell.getCellType() == CellType.STRING){
                    System.out.println(currentCell.getStringCellValue()+" ");
                }else if (currentCell.getCellType() == CellType.NUMERIC){
                    System.out.println(currentCell.getNumericCellValue());
                }
                System.out.println();
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e1){
            e1.printStackTrace();
        }
    }
}
