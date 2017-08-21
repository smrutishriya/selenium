package dataDrivenFramework;


import java.io.IOException;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import sa.excel.ExcelOp;

public class TestNGTest extends AdactinLogin {
	
	@BeforeClass
	public void setUp() throws IOException
	{
		openHotelapp();
		ExcelOp.openExcel("D:\\Credentilal.xlsx");
		ExcelOp.loadSheet(0);                                  
	}
	
	/*@Test
	public void main1() throws IOException
	{
		ExcelOp.loadSheet(0);
	logIn(ExcelOp.read(0, 0), ExcelOp.read(0,1));
		Assert.assertTrue(isExist("username_show"));
		ExcelOp.closeSheet();
	}
	
	@Test
	public void main2() throws IOException
	{
		ExcelOp.loadSheet(0);
		logIn(ExcelOp.read(1, 0), ExcelOp.read(1,1));
		Assert.assertTrue(isExist("username_show"));
		ExcelOp.closeSheet();
	}*/
	
	boolean isExist(String inputId)
	{
		try{
			WebElement ele= driver.findElement(By.id(inputId));
			return true;
		}
		catch(NoSuchElementException e)
		{
			return false;
		}
	}
	
	@DataProvider(name="loginData")
	Object[][] dataProvider()
	{
		Object[][] data=ExcelOp.readAll();
				return data;
	}
	
	@Test(dataProvider="loginData")
	public void main3(String username,String password) throws IOException
	{
		ExcelOp.loadSheet(0);
		logIn(username, password);
		Assert.assertTrue(isExist("username_show"));
		ExcelOp.closeSheet();
	}
	
	
	
	
	}


