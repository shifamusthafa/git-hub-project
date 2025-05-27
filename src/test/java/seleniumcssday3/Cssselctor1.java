package seleniumcssday3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssselctor1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.medimention.com/");
		driver.manage().window().maximize();
		/*css selector
		 * Tag id
		 * tag class
		 * tag attribute
		 * tag class attribute
		 * 
		 * syntax
		 * tagid = tagname #id name
		 * */
		
		driver.findElement(By.cssSelector("input#banner-name")).sendKeys("shifa");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#banner-email")).sendKeys("shifa2gmail.com");
		Thread.sleep(2000);
		driver.manage().window().minimize();
	}

}
