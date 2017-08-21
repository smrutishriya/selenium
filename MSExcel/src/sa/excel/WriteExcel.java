package sa.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		FileInputStream fis= new FileInputStream(new File("D:\\Test.xlsx"));
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheetAt(0);
		Row row=sheet.getRow(0);
		Cell cell=row.createCell(3);
		cell.setCellValue("MyData");
		fis.close();
		
		FileOutputStream fos=new FileOutputStream(new File("D:\\Test.xlsx"));
		workbook.write(fos);
		workbook.close();
		
	}

}