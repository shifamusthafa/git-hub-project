package paralleltestng;

 import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
	public class ParallelTestng
	 {
	   WebDriver driver;
	   @BeforeClass
	   @Parameters({"browser"})
	   void setUp(String bro) throws InterruptedException{
		   
		   
		   switch(bro) {
		   case "chrome":driver =new ChromeDriver();
		   break;
		   case "edge": driver = new EdgeDriver();
		   }
		   
		   
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			Thread.sleep(3000);
		}
	   @Test
	   void login() throws InterruptedException {
		   driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		   driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		   driver.findElement(By.xpath("//button[@type='submit']")).click();
		   Thread.sleep(3000);
	   }
	   @Test
	   void admin() throws InterruptedException {
		   List<WebElement> a =driver.findElements(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']"));
		   a.get(0).click();
		   Thread.sleep(1000);
		 List<WebElement> name =driver.findElements(By.xpath("//input[@class='oxd-input oxd-input--active']"));
		 name.get(1).sendKeys("shifa");
		 driver.findElement(By.xpath("//div[@class='oxd-select-text-input']"));
		 Actions ac = new Actions(driver);
		 ac.keyDown(Keys.ARROW_DOWN).sendKeys("A").keyUp(Keys.ARROW_DOWN).perform();
		 driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("azarudhin musthafa");
		 
		   Thread.sleep(1000);
	   }
	   @Test
	   void PIM() throws InterruptedException {
		   List<WebElement> p =driver.findElements(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--n']"));
		   p.get(1).click();
		   Thread.sleep(1000);
		   
	   }
	   @Test
	   void  leave() throws InterruptedException {
		   List<WebElement> l =driver.findElements(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']"));
		   l.get(2).click();
		   Thread.sleep(1000);
	   }
	   @AfterClass
	   void quit() {
		   driver.quit();
	   }
	   
	}


