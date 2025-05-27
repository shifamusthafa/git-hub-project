package seleniumcssday3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Csspractice1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().window().maximize();
		//Thread.sleep(1000);
		driver.findElement(By.className("_97w5")).click();
		driver.findElement(By.name("firstname")).sendKeys("shifa");
		Thread.sleep(2000);
		driver.findElement(By.name("lastname")).sendKeys("musthafa");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_email__")).sendKeys("shifa22@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#password_step_input")).sendKeys("shifa123");
		Thread.sleep(2000);
		driver.manage().window().minimize();
		
	}

}
