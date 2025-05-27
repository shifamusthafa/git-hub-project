package seleniumday2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//to perform multiple action
		WebElement email = driver.findElement(By.name("email"));
		Thread.sleep(1000);
		email.sendKeys("shifa@gmailcom");
		Thread.sleep(1000);
		email.clear();
		Thread.sleep(1000);
		email.sendKeys("musthafa@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("shifa123");
		driver.findElement(By.name("login")).click();
		//Thread.sleep(3000);
	//	driver.manage().window().minimize();
		
	}
	

}
