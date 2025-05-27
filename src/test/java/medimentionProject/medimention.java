package medimentionProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class medimention {
	WebDriver driver;
	@BeforeClass
	@Parameters({"browser"})
	void setUp(String bro) {
		
		switch(bro) {
		   case "chrome":driver =new ChromeDriver();
		   break;
		   case "edge": driver = new EdgeDriver();
		   }
		   
		
		driver.get("https://medimention.com/");
		driver.manage().window().maximize();
		
	}
	@Test
	 void login() throws InterruptedException {
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
			 Thread.sleep(2000);
			 number.get(1).sendKeys("9870654321");
			 
	 }

}
