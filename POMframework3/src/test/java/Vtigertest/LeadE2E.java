package Vtigertest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.vtigerpages.Headerpage;
import com.vtigerpages.LeadPage;
import com.vtigerpages.LoginPage;

import vitigercommon.config1;

public class LeadE2E extends BaseTest {
	
	  private static final String String = null;

	@BeforeClass
	  public void launchapplication() {
		  if(driver==null)
		  {
		 openaap();
		  }
		  
	  }
	 
	 
	  @Test(dataProvider="testdata")
	  public void createleadTC05(String lname,String comp)
	  {
		  SoftAssert sf= new  SoftAssert();
		  LoginPage lp=new LoginPage(driver);
		  Headerpage hp=lp.validlogin(config1.userid, config1.pwd);
		  hp.clickNewLead();
		  LeadPage ldp=hp.clickNewLead();
		  ldp.createlead("lname", "comp");
		  LoginPage lp1=hp.clicklogout();
		  boolean val=lp.verifytitle();
		  sf.assertEquals(val, true);
		  sf.assertEquals(val, true);
		  sf.assertAll();
		  
	  }
	  
	  @DataProvider
	  public Object[][] testdata(){
		  return new Object[][]{
			  new Object[]{"admin","pdw1"},
			  new Object[]{"admin2","pdw2"},
		  };
	  }
	  
	  @AfterClass
	  public void closeApp()
	  {
		  //driver.quit();
	  }
	  
	}



