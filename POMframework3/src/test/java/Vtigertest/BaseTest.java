package Vtigertest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import vitigercommon.config1;

public class BaseTest {
	public WebDriver driver;
public void openaap()
{
	  System.setProperty("webdriver.chrome.driver","C:/Users/comp/Desktop/Selenium Software/chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.get(config1.url);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(config1.timeout, TimeUnit.SECONDS);
	  
}
}
