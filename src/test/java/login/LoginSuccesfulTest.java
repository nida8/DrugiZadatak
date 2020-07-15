package login;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.SauceLoginPage;

public class LoginSuccesfulTest extends BaseTest {
	
@Test	
public void LogInToDashboard(){
		
		SauceLoginPage slp = getDriver();
		
		slp.enterUsername();
		slp.enterPassword();

		slp.clicklogButton();

		String url = slp.getPageUrl();
		Assert.assertEquals(url, "https://www.saucedemo.com/inventory.html", "User is not on correct page");
	
	
	
	}

}
