package sep13;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CovertIntdatatoStringdata {

	public static void main(String[] args) throws Throwable {
		FileInputStream fi = new FileInputStream("D://Documents/Book.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheet("Login");
		int rc = ws.getLastRowNum();
		for(int i=1; i<=rc; i++) {
			String user = ws.getRow(i).getCell(0).getStringCellValue();
			if(wb.getSheet("Login").getRow(i).getCell(2).getCellType()==Cell.CELL_TYPE_NUMERIC) {
				//read the int data from cell
				int celldata = (int)wb.getSheet("Login").getRow(i).getCell(2).getNumericCellValue();
				String ID = String.valueOf(celldata);
				System.out.println(user+"     "+ID);
			}
		}
		fi.close();
		wb.close();
		
		

	}

}
