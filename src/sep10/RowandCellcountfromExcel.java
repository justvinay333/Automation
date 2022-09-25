package sep10;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RowandCellcountfromExcel {

	public static void main(String[] args) throws Throwable {
		//Return the path of Excel
		FileInputStream fi = new FileInputStream("D://Documents/Book.xlsx");
		//Get workbook form the file
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		//Get sheet from the workbook
		XSSFSheet sh = wb.getSheet("Login");
		//Get first row from sheet
		XSSFRow rw = sh.getRow(0);
		//Count no.of rows in a sheet
		int row = sh.getLastRowNum();
		//count no.of cells in a first row
		int cells = rw.getLastCellNum();
		System.out.println("No.of rows  : "+row+"   "+"   "+cells);
		fi.close();
		wb.close();
		

	}

}
