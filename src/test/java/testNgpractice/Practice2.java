package testNgpractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Practice2 {
	/* @BeforeMethod with the help of @beforeMethod we perform any action before test
	 method without declaring many times
	 
	 *@AfterMethod :with the help of this method we perform any action after test method without 
	 declaring it
	 
	 *@BeforeClass:We perform any action before class multiple time without declaration method(login)
	  
	 *AfterClass:We perform any action AfterClass multiple times without declaration method( logout)
	 
	 *@BeforeTest:We perform any action BeforeTest multiple times without declaration method
	 *
	 *@AfterTest:We perform any action afterTest multiple times without declaration method
	 *
	 *@AfterSuite:We perform any action afterSuite multiple times without declaration(.html tag)
	 *
	 *@BeforeSuite:We perform any action BeforeSuite multiple times without declaration method
	 *
	 *@Test:to declare any method as TesCase
	 */
	@BeforeSuite
	void Beforesuite() {
		System.out.println("Before Suite");
	}
	@org.testng.annotations.AfterSuite
	void AfterSuite() {
		System.out.println("After Suite");
	}
	@org.testng.annotations.BeforeClass
	void BeforeClass() {
		System.out.println("Before class ");
	}
	@AfterClass
	void Afterclass() {
		System.out.println("After class");
	}
	@org.testng.annotations.BeforeClass
	void BeforeTest() {
		System.out.println("Before Test");
	}
	@org.testng.annotations.AfterTest
	void AfterTest() {
		System.out.println("After Test");
	}
	@Test
	void Test1() {
		System.out.println("Test1");
	}
	@Test
    void Test2() {
    	System.out.println("Test2");
    }
}
