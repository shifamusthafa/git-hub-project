 package getmetod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getmethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
         System.out.println(driver.getPageSource());
         System.out.println(driver.getWindowHandle());
         
         driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));              
        Set<string create =
	
	}

}
