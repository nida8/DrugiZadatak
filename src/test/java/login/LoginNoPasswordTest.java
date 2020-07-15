package login;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.SauceLoginPage;

public class LoginNoPasswordTest extends BaseTest {

@Test
public void verifyNoPasswordNotLoggedIn() {	
		
		
		SauceLoginPage slp = getDriver();
		slp.enterUsername();
		slp.clicklogButton();
		String errorMsg = slp.getErrorMsg();
		Assert.assertEquals(errorMsg, "Epic sadface: Password is required","Error message is incorrect.");
		String url = slp.getPageUrl();
		Assert.assertEquals(url, "https://www.saucedemo.com/", "User is not on correct page");
		
		
		
		
		
		}


}
