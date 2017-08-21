package sa.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOp {
	
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static FileInputStream fis;
	
	
	public static void openExcel(String path) throws IOException
	{
		 fis= new FileInputStream(new File(path));
		 workbook=new XSSFWorkbook(fis);
	}
	
	
	public static void loadSheet(int sheetNumber)
	{
		 sheet=workbook.getSheetAt(sheetNumber);
	}
	
	public static String read(int rowNum,int cellNum)
	{
		
   return sheet.getRow(rowNum).getCell(cellNum).getStringCellValue();
			
	}
	
	public static void closeSheet() throws IOException
	{
		workbook.close();
	}
	
	public static Object[][] readAll()
	{
		Object[][] data=new Object[2][2];
		for(Row row:sheet)
			for(Cell cell:row)
				data[row.getRowNum()][cell.getColumnIndex()]=cell.getStringCellValue();
				
		return data;
		
	}
	
	
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		openExcel("D:\\Test.xlsx");
		loadSheet(0);
		read(0, 0);
		closeSheet();
		

	}

}
