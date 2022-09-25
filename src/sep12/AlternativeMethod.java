package sep12;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AlternativeMethod {

	public static void main(String[] args) throws Throwable {
		FileInputStream fi = new FileInputStream("D:/Documents/Book.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheet("Login");
		int rc = ws.getLastRowNum();
		System.out.println("No.of Rows: "+rc);
		//read the user and Passord from the diff cells
		String user =ws.getRow(2).getCell(0).getStringCellValue();
		String user1= ws.getRow(1).getCell(0).getStringCellValue();
		System.out.println(user+"  "+user1);
		fi.close();
		wb.close();

	}

}
