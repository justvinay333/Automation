package sep12;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FormatText {

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
			XSSFCellStyle style = wb.createCellStyle();
			XSSFFont font = wb.createFont();
			font.setColor(IndexedColors.DARK_GREEN.getIndex());
			font.setBold(true);
			font.setBoldweight(XSSFFont.BOLDWEIGHT_BOLD);
			style.setFont(font);
			ws.getRow(i).getCell(3).setCellStyle(style);
			

	}
		fi.close();
		FileOutputStream fo = new FileOutputStream("D:/Documents/Results.xlsx ");
		wb.write(fo);
		fo.close();
		wb.close();

	}}
