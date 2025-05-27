package multiplexpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elmentsfinding {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("shifa@gmil.com");
	driver.findElement(By.id("//input[@id='pass']")).sendKeys("shifa123");
	driver.findElement(By.xpath("//button[@name='login']")).click();
	Thread.sleep(1000);
	
	
	
	}
	

}
