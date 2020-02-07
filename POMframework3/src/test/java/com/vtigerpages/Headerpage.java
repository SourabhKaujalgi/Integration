package com.vtigerpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Headerpage {
private WebDriver driver;
	
	public Headerpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Logout")
    WebElement link;
	
	@FindBy(linkText="New lead")
    WebElement newlead;
	
 public LoginPage clicklogout()
 {
	 link.click();
	 return new LoginPage(driver);
 }
public LeadPage clickNewLead()
{
	newlead.click();
	return new LeadPage(driver);
}
}
