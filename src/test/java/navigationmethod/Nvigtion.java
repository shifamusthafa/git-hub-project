package navigationmethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nvigtion {

	public static void main(String[] args) {
	/*navigation type
	 * navigation().to URL()
	 * navigation().back()
	 * navigation().forward()
	 * navigation().refresh()
	 * 
	 * */
	WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
		
	}
	
	

}
