package dataDrivenFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import sa.excel.ExcelOp;

public class AdactinLogin {

	public static WebDriver driver;
	
	public static void openHotelapp()
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Hvuser\\Downloads\\geckodriver-v0.18.0-win64\\geckodriver.exe");
	    driver=new FirefoxDriver();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	public static void logIn(String Username,String Password)
	{
		driver.get("http://adactin.com/HotelApp/index.php");
		driver.findElement(By.id("username")).sendKeys(Username);
	    driver.findElement(By.id("password")).sendKeys(Password);
	    driver.findElement(By.id("login")).click();
	
	}
	
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		openHotelapp();
		ExcelOp.openExcel("D:\\Credentilal.xlsx");
		ExcelOp.loadSheet(0);
		for(int rowNum=0;rowNum<2;rowNum++)
		{
			String username=ExcelOp.read(rowNum,0);

			String password=ExcelOp.read(rowNum,1);
			logIn(username, password);
			
		}
		
		

	}

}
