package pageClass;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	
	@FindBy(id="username")
	WebElement txtUsername;
	
	
	@FindBy(id="password")
	WebElement txtPassword;
	
	@FindBy(id="login")
	WebElement btnlogin;
	
	@FindBy(id="username_span")
	WebElement emptyusernameerror;
	
	@FindBy(id="password_span")
	WebElement emptypassworderror;
	
	public LogInPage()
	{
		Base.openBrowser();
		PageFactory.initElements(Base.driver,this);
		
	}
	
	public void loadUrl()
	{
		Base.navigateToUrl();
		
	}
	
	public String getTxtUsername()
	{
		return txtUsername.getAttribute("value");
	}
	
	public void setTxtUsername(String value)
	{
		
		txtUsername.clear();
		txtUsername.sendKeys(value);
		
	}
	
	public void setTxtPassword(String value)
	{
		txtPassword.clear();
		txtPassword.sendKeys(value);
	}
	
	public void clickLogin()
	{
		btnlogin.click();
	}

	public boolean isExistusername()
	{
		
			try{if(emptyusernameerror.isDisplayed())
				return true;
			else
		      return false;}
			catch(NoSuchElementException e)
			{
				return false;
			}
	}
	
	public boolean isExistpassword()
	{
		
			try{if(emptypassworderror.isDisplayed())
				return true;
			else
		      return false;}
			catch(NoSuchElementException e)
			{
				return false;
			}
	}
	
}
