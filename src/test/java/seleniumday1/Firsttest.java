package seleniumday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firsttest {

	public static void main(String[] args) throws InterruptedException {
	//how to open any browser with selenium
		WebDriver object_name = new ChromeDriver();
	//we use .get function to open the website with the help of url
		object_name.get("https://www.facebook.com/login.php/");
		//how to manage window
		object_name.manage().window().maximize();
		Thread.sleep(1000);
		//object_name.manage().window().minimize();
		//how to find the element using id locator
		object_name.findElement(By.id("email")).sendKeys("shifa@gmail.com");
		Thread.sleep(1000);
		object_name.findElement(By.name("pass")).sendKeys("shifa123");
		
		object_name.manage().window().minimize();
	}

}
