package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SauceLoginPage {


	private WebDriver driver;
	private By logButton = By.className("btn_action");
	private By username = By.id("user-name");
	private By password = By.id("password");
	
	
	public SauceLoginPage(WebDriver driver){
		
		this.driver = driver;
	}
	
	public SauceLoginPage enterUsername(){
		
		driver.findElement(username).sendKeys("standard_user");
		return new SauceLoginPage(driver);
			
	}
	
	public SauceLoginPage enterPassword(){
		
		driver.findElement(password).sendKeys("secret_sauce");
		return new SauceLoginPage(driver);
			
	}
		
	public SauceLoginPage clicklogButton(){
		
		driver.findElement(logButton).click();
		return new SauceLoginPage(driver);
		
	}
	
	public String getErrorMsg() {
		return driver.findElement(By.cssSelector("[data-test=\"error\"]")).getText();
	}
	
	public String getPageUrl(){
		
		return driver.getCurrentUrl();
	}
	
	
	

	

}

