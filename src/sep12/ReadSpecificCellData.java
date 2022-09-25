package sep12;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadSpecificCellData {

	public static void main(String[] args) throws Throwable {
		FileInputStream fi = new FileInputStream("D://Documents/Book.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheetAt(0);
		XSSFRow row = ws.getRow(3);
		int rc = ws.getFirstRowNum();
		System.out.println("No.of Row are in Login sheet is: "+ rc);
		XSSFCell c1 =row.getCell(0);
		XSSFCell c2 = row.getCell(1);
		String user = c1.getStringCellValue();
		String password = c2.getStringCellValue();
		System.out.println(user+"  "+password);
		fi.close();
		wb.close();
		

	}

}
