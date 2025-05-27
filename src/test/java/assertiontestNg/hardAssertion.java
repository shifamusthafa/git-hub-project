package assertiontestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
//assertion is important in testNG to check if the test cases is passed or fail
public class hardAssertion {
	WebDriver driver;
	@BeforeClass
	void setUp() {
		 driver = new ChromeDriver();
		 driver.get("https://uncodemy.com/");
		 driver.manage().window().maximize();
		 }
	@Test
	void Title() {
		String expectedtitle="my title";
		String actualtitle = driver.getTitle();
		if(expectedtitle.equals(actualtitle)) {
			System.out.println("Test case pass");
			Assert.assertTrue(true);
		}
		else {
			System.out.println("test case fail");
			Assert.assertTrue(false);
		}
		//Assert.assertEquals(expectedtitle, actualtitle);
		
	}
	@AfterClass
	void close() {
		driver.close();
	}

}

/*by default we are using hard assertion.
 * we are having two types of assertion:
 * 1.Softassertion(without object we cannot use soft assertion)
 * 2.Hardassertion
 * we have different type of hard assertion(by default)
 * 1.Assert.assertEquals(123,123);
 * it is passed wen both parameter are equal
 * Assert.assertNotEquals(123,456)
 * it is passed when both parameter are not equal
 * Assert.assertTrue(true/a<b);if your condition is true we can passed
 * Assert.assertFalse(false/a>b)if your condition is false then it is passed
 * assert.assertFail:if all condition are true it fails the class
 * */
