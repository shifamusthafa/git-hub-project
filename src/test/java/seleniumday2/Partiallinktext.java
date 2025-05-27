package seleniumday2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Partiallinktext {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
	//	driver.findElement(By.partialLinkText("cement")).click();
		//Thread.sleep(1000);
		//driver.manage().window().minimize();
		//classname
	  List<WebElement> email=driver.findElements(By.className("inputtext _55r1 inputtext _9npi inputtext _9npi"));
	 // email.get(0).sendKeys("shifa@gmail.com");
	  System.out.println(email.size());
	
	}
	
	

}
