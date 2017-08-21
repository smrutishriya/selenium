package pageClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	static WebDriver driver;
	
	
	static void openBrowser()
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Hvuser\\Downloads\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	static void navigateToUrl()
	{
		driver.get("http://adactin.com/HotelApp/index.php");
	}
	
}
