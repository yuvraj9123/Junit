package DateDriven.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataWriteEx {
	public static void datewrite(String priceexcel,String Sheetname, int rowno,int cellno) throws IOException {
		
		File f = new File("D:\\esclipe dont delete\\TestNG\\data\\"+priceexcel+".xlsx");
		Workbook wb = new XSSFWorkbook();
		 Sheet createSheet = wb.createSheet(Sheetname);
		 Row createRow = createSheet.createRow(rowno);
		 Cell createCell = createRow.createCell(cellno);
	     createCell.setCellValue("123456");
	     FileOutputStream fos = new FileOutputStream(f);
	     wb.write(fos);
	    
	}
	
	
}