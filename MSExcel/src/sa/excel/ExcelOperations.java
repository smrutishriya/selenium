package sa.excel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOperations {
	
	public static void main(String args[]) throws InvalidFormatException, IOException
	{
		XSSFWorkbook workbook=new XSSFWorkbook(new File("D:\\Test.xlsx"));
		XSSFSheet sheet=workbook.getSheetAt(0);
		/*for(int rowNum=0;rowNum<=sheet.getLastRowNum();rowNum++)
		{
			Row row=sheet.getRow(rowNum);
			for(int cellNum=0;cellNum<row.getLastCellNum();cellNum++)
			{
				System.out.print(sheet.getRow(rowNum).getCell(cellNum).getStringCellValue()+" ");
			}
			System.out.println();
		}*/
		
		
	for(Row row:sheet)
		for(Cell cell :row)
			System.out.println(cell.getStringCellValue());
			
		
		workbook.close();
	}

}
