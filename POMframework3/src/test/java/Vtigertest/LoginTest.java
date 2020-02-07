package Vtigertest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.vtigerpages.Headerpage;
import com.vtigerpages.Homepage;
import com.vtigerpages.LoginPage;

import vitigercommon.CommonFunction;
import vitigercommon.config1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class LoginTest extends BaseTest {
  
  @BeforeClass
  public void launchapplication() {
	  
	  openaap();
	  
  }
  @Test
  public void verifyTitaleTC01() throws Throwable
  {  
	 
	  SoftAssert sf= new  SoftAssert();
	  LoginPage lp=new LoginPage(driver);
	  System.out.println("I am in Login page");
	  boolean val=lp.verifytitle();
	  AssertJUnit.assertEquals(val, true);
	  sf.assertAll();
	  CommonFunction.getscreenshot("verifyTitaleTC01", driver);
  }
  @Test
  public void verifInvalvalidloginTC02()
  {
	  SoftAssert sf= new  SoftAssert();
	  LoginPage lp=new LoginPage(driver);
	  boolean val=lp.invalidLogin();
	  AssertJUnit.assertEquals(val, true);
	  sf.assertAll();
	  
	  
  }
  
  @Test
  public void verifyvalidloginTC03()
  {   
	  SoftAssert sf= new  SoftAssert();
	  LoginPage lp=new LoginPage(driver);
	  Headerpage val=lp.validlogin(config1.userid, config1.pwd);
	  AssertJUnit.assertEquals(val, true);
	  sf.assertAll();
	  
  }
  @AfterClass
  public void closeApp()
  {
	  driver.quit();
  }
  
}
