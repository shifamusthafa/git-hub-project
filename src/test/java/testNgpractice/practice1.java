package testNgpractice;


import org.testng.annotations.Test;

public class practice1 {

	@Test (priority=5)
	
	void test1() {
		System.out.println("System login");
		
	}
	@Test(priority=3)
	void logout() {
		System.out.println("System logout");
	}
  @Test(priority=1)
	void AddtoCart() {
		System.out.println("Adding the product");
		
	}
  @Test(priority=6)
	void search() {
		System.out.println("Searching the product");
	}
	
}
/*
 * TestNG by default execute the test method based on the alphabetical order.
 * TestNg execute the test method name starting with capital,letter first
 if there are any other method in small letter.
 *  @Test (priority= number)controls the order of the execution.
 *  Once priority is given alphabet order or capital/small letter are considered
 *  priority can be in random numbers no(no consecutive order).
 *  We can disable the test case by commenting out @ Test annotations
 * if you dont provide any priority the priority will be 0 by default
 * we can make negative priority also
 * if the priority is same then it executes by alphabetical order
 * TestNG executes test method only if they have @test annotations only
 * */
































