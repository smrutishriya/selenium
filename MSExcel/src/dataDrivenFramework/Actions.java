package dataDrivenFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Actions {
	public static WebDriver driver;
	
	public static void initDriver()
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Hvuser\\Downloads\\geckodriver-v0.18.0-win64\\geckodriver.exe");
	    driver=new FirefoxDriver();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.get("http://adactin.com/HotelApp/index.php");
	}
	
	public static void EnterText(String locatorType,String locator,String actionValue)
	{
		if(locatorType.equals("id"))
		{
		driver.findElement(By.id(locator)).sendKeys(actionValue);
		}
	}
	
	public static void Click (String locatorType,String locator)
	{
		if(locatorType.equals("id"))
		driver.findElement(By.id(locator)).click();
	}
	
	public static void select(String locatorType,String locator,String actionValue)
	{
		if(locatorType.equals("id"))
		{
		Select sc=new Select (driver.findElement(By.id(locator)));
		sc.selectByVisibleText(actionValue);
		}
		
	}

}
	