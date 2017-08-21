package dataDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import sa.excel.ExcelOp;

public class TestRunner {
	
	@BeforeClass()
	void init()
	{
		Actions.initDriver();
	}
	
	@Test
	void test() throws IOException
	{
		ExcelOp.openExcel("D:\\keyWord.xlsx");
		ExcelOp.loadSheet(0);
		for(int rowNumber=0;rowNumber<6;rowNumber++)
		{
			if(ExcelOp.sheet.getRow(rowNumber).getCell(2).getStringCellValue().equalsIgnoreCase("EnterText"))
				Actions.EnterText(ExcelOp.sheet.getRow(rowNumber).getCell(0).getStringCellValue(),ExcelOp.sheet.getRow(rowNumber).getCell(1).getStringCellValue(),ExcelOp.sheet.getRow(rowNumber).getCell(3).getStringCellValue()+Keys.TAB);
			
			if(ExcelOp.sheet.getRow(rowNumber).getCell(2).getStringCellValue().equalsIgnoreCase("Click"))
				Actions.Click(ExcelOp.sheet.getRow(rowNumber).getCell(0).getStringCellValue(),ExcelOp.sheet.getRow(rowNumber).getCell(1).getStringCellValue());
			
			if(ExcelOp.sheet.getRow(rowNumber).getCell(2).getStringCellValue().equalsIgnoreCase("select"))
				Actions.EnterText(ExcelOp.sheet.getRow(rowNumber).getCell(0).getStringCellValue(),ExcelOp.sheet.getRow(rowNumber).getCell(1).getStringCellValue(),ExcelOp.sheet.getRow(rowNumber).getCell(3).getStringCellValue());
		}
	}

}
 