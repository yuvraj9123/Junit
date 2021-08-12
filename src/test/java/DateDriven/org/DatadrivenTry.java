package DateDriven.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DatadrivenTry {
public static void main(String[] args) throws IOException {
	File f = new File ("C:\\Users\\intel\\eclipse-workspace\\Junit\\Data\\excelreding.xlsx");
	FileInputStream fis = new FileInputStream(f);
	Workbook wb = new XSSFWorkbook(fis);
	Sheet sheet = wb.getSheet("Sheet1");
	for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
		Row row = sheet.getRow(i);
		String value = "";
		for (int j = 0; j <row.getPhysicalNumberOfCells(); j++) {
			Cell cell = row.getCell(j);
			int cellType = cell.getCellType();
			if (cellType==1) {
				 value = cell.getStringCellValue();
			}
			 else if (DateUtil.isCellDateFormatted(cell)) {
				 Date dateCellValue = cell.getDateCellValue();
				 SimpleDateFormat s = new SimpleDateFormat("dd-mm-yyyy");
				  value = s.format(dateCellValue);	
			}
			 else {
				double cellValue = cell.getNumericCellValue();
				long l = (long)cellValue;
				 value = String.valueOf(l);
			}
			System.out.println(value);
		}
		
	}
	
	
}

}
