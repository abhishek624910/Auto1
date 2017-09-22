package testNgScript;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import commonUtilities.Browsers;
import commonUtilities.Constants;
import pageObjectRepo.LoginPage;
import pageObjectRepo.LogoutPage;
@Listeners(commonUtilities.Screenshot.class)
public class LoginTest {
  @BeforeMethod
  public void preTest(){
	  Browsers b=new Browsers();
	  //EcelLib ex=new EcelLib();
	  b.getbrowser();
	  Reporter.log("Application Lunched",true);
	  Browsers.driver.get(Constants.url);
	  Reporter.log("Url passed",true);
  }
  @Test
  public void f() {
	  LoginPage l=PageFactory.initElements(Browsers.driver, LoginPage.class);
	  Assert.assertEquals(Browsers.driver.getTitle(), "vtiger CRM 5 - Commercial Open Source CRM", "Title match");
	  l.loginToApp();
	  Reporter.log("LoggedIn successFully",true);
	  LogoutPage l1=PageFactory.initElements(Browsers.driver, LogoutPage.class);
	  l1.logoutFromApp();
	  Reporter.log("LoggedOut successFully",true);
  }
  @AfterMethod
  public void postTest() throws InterruptedException{
	 Thread.sleep(2000);
	 Browsers.driver.close();
	 Reporter.log("Browser closed successFully",true);
  }
}
