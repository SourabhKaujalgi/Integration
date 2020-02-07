package com.vtigerpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	 WebElement imglogo=driver.findElement(By.xpath("//img[@src='include/images/vtiger-crm.gif']"));
	 WebElement txtusername=driver.findElement(By.name("user_name"));
	 WebElement txtpwd=driver.findElement(By.name("user_password"));
	 WebElement btnlogin=driver.findElement(By.name("Login"));
	 WebElement lblErrormsg=driver.findElement(By.xpath("//td[contains(text(),'You must specify a valid username and password.')]"));
	
	
	
	//By imglogo = By.xpath("//img[@src='include/images/vtiger-crm.gif']");
	//By txtusername = By.name("user_name");
	//By txtpwd = By.name("user_password");
	//By btnLogin = By.name("Login");
	//By lblErrormsg = By.xpath("//td[contains(text(),'You must specify a valid username and password.')]");
	
	
	public boolean invalidLogin()
	{
		
		 
		boolean val = false;
		try
		{
			val = lblErrormsg.isDisplayed();
		}
		catch(Throwable t)
		{
			System.out.println(t.getMessage());
		}
		return val;
	}
	
	public boolean verifytitle()
	{
			
		if(driver.getTitle().trim().equals("vtiger123 CRM - Commercial Open Source CRM"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	public boolean verifylogo()
	{
			
		if(imglogo.isDisplayed())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	public Headerpage validlogin(String user, String pwd)
	{
		txtusername.clear();
		txtusername.sendKeys(user);
		txtpwd.clear();
		txtpwd.sendKeys(pwd);
		btnlogin.click();
		return new Headerpage(driver);
	}
	
	

}
