package seleniumcssday3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssselector3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.medimention.com/");
		//how to use attribute in css selector
		driver.findElement(By.cssSelector("input[id='banner-email']")).sendKeys("shifa@gmail.com");

	}

}
