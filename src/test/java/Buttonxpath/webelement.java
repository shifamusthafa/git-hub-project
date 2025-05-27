package Buttonxpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.medimention.com/");
		driver.manage().window().maximize();
		
		List<WebElement>name =driver.findElements(By.xpath("//input[@name='name']"));
		name.get(0).sendKeys("shifa");
		Thread.sleep(1000);
		name.get(1).sendKeys("musthafa");
		Thread.sleep(2000);
		
		
		List<WebElement> email = driver.findElements(By.xpath("//input[@name='email']"));
		 email.get(0).sendKeys("shifa@gmail.com");
		 Thread.sleep(2000);
		 email.get(1).sendKeys("azar@gmail.com");
		 
		 List<WebElement>number = driver.findElements(By.xpath("//input[@name='phone']"));
		 number.get(0).sendKeys("1235678902");
		 Thread.sleep(1000);
		 number.get(1).sendKeys("9870654321");
		 

	}

}
