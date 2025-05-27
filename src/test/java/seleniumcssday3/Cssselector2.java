package seleniumcssday3;

import java.util.List;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class Cssselector2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.get("https://www.medimention.com/");
		Thread.sleep(1000);
		 List<WebElement> number = driver.findElements(By.cssSelector("input.form-control"));
		 number.get(0).sendKeys("shifa");
		 //search.sendKeys("shirt");
		 
		 //Thread.sleep(1000);

	}

}
