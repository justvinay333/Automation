package sep12;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadRowCelldatawriteintoResultsColumn {

	public static void main(String[] args) throws Throwable {
		FileInputStream fi = new FileInputStream("D:/Documents/Book.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheet("Login");
		int rc = ws.getLastRowNum();
		System.out.println("No.of rows: "+ rc);
		for (int i = 1; i<=rc; i++)
		{
			String username =ws.getRow(i).getCell(0).getStringCellValue();
			String password = ws.getRow(i).getCell(1).getStringCellValue();
			System.out.println(username+"      "+password);
			//write as Pass into results cell
			ws.getRow(i).createCell(3).setCellValue("pass");
			
		}
		   fi.close();
		   FileOutputStream fo = new FileOutputStream("D://Documents/VD result.xlsx");
	
          wb.write(fo); 
          fo.close();
          wb.close();
          
}}
