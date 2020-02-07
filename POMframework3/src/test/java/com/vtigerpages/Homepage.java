package com.vtigerpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends Headerpage {
	
private WebDriver driver;
	
	public Homepage(WebDriver driver)
	{    
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

}
