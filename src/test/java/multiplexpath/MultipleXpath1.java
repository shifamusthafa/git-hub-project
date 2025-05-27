package multiplexpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleXpath1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='text'][@name='username']")).sendKeys("shifa");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123shif");

	}

}
