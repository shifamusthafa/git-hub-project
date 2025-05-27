package Buttonxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.medimention.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//inner text
	//	driver.findElement(By.xpath("//a[text()='Home']")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//a[text()='About']")).click();
		//Thread.sleep(1000);
		
		//using contains if clss not working:
		//driver.findElement(By.xpath("//button[contains(@id,'touchget')]")).click();
		
		//strt_with xpath
		driver.findElement(By.xpath("//i[starts-with(@class,'fa fa-fac')]")).click();
	}

}
