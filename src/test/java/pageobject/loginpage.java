package pageobject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class loginpage {
	WebDriver driver;
	@BeforeClass
	void setUp()
	{
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	@Test
	void testLogin() {
		pageobject1 object = new pageobject1(driver);
		object.setUserName("Admin");
		object.setPassword("admin123");
		object.setLog();
	}
	@AfterClass
	void close() {
		driver.quit();
	}
}
