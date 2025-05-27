package implictWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wait {
public static void  main(String[]args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	//max=9sec according to requriments
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
	driver.manage().window().maximize();
	
    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    
    
    
    
    
    
}

}
