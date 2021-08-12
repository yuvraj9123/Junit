package DateDriven.org;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class trydata {
public static void main(String[] args) throws IOException {
	FileInputStream fis= new FileInputStream("C:\\Users\\intel\\eclipse-workspace\\Junit\\Data\\excelwrite1.xlsx");
	Workbook wb = new XSSFWorkbook(fis);
	Sheet sheet = wb.getSheet("facebook");
	Row row = sheet.getRow(0);
	Cell cell = row.getCell(0);
	String stringCellValue = cell.getStringCellValue();
	System.out.println(stringCellValue);
}
}
