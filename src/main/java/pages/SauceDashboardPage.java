package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SauceDashboardPage{
	
	private WebDriver driver;
	private By addBtn = By.cssSelector("#inventory_container > div > div:nth-child(2) >div.pricebar > button");
	
	public SauceDashboardPage(WebDriver driver){
		
		this.driver = driver;
	}
	
	
	
	
	public SauceDashboardPage AddToCart(){
		
		driver.findElement(addBtn).click();
		return new SauceDashboardPage(driver);
		
	}
	


}
