package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pageobject1 {

	WebDriver driver;
	
	pageobject1(WebDriver driver){
		this.driver = driver;
		
	}
	By user = By.xpath("//input[@placeholder='Username']");
	By pass = By.xpath("//input[@placeholder='Password']");
	By login = By.xpath("//button[@type='submit']");
	
	
	public void setUserName(String userName) {
		driver.findElement(user).sendKeys(userName);
		
		}
	public void setPassword(String password) {
		driver.findElement(pass).sendKeys(password);
	}
	public void setLog() {
		driver.findElement(login).click();
	}
}
