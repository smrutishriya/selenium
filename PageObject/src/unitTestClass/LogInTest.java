package unitTestClass;





import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageClass.LogInPage;

public class LogInTest {
	
	LogInPage login;
	
	@BeforeClass 
	public void loginPage()
	{
		login=new LogInPage();
		
	}
	
	@Test
	public void validlogIn()
	{
		login.loadUrl();
		login.setTxtUsername("smrutishriya");
		login.setTxtPassword("adactin1");
		login.clickLogin();
		
	}
	
	@Test
	public void invalidlogIn()
	{
		login.loadUrl();
		login.setTxtUsername("grhjh");
		login.setTxtPassword("abcd");
		login.clickLogin();
	}
	
	@Test
	public void noValueinUsername()
	{
		login.loadUrl();
		login.setTxtUsername("");
		login.clickLogin();
		Assert.assertTrue(login.isExistusername());
		System.out.println("Username is empty");
	}
	
	@Test
	public void noValueinPassword()
	{
		login.loadUrl();
		login.setTxtUsername("smrutishriya");
		login.setTxtPassword("");
		login.clickLogin();
		Assert.assertTrue(login.isExistpassword());
		System.out.println("Password is empty");
	}
	
}
