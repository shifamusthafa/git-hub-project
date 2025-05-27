package seleniumday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://uncodemy.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//how to find element with the help of link text
		driver.findElement(By.linkText("Placement")).click();
	Thread.sleep(1000);
	String newurl = driver.getCurrentUrl();
	System.out.println(newurl);
	driver.manage().window().minimize();
	}

}
