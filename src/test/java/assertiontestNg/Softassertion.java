package assertiontestNg;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassertion {
	
	@Test
	void softAssertion() {
		System.out.println("Test started");
		SoftAssert a = new SoftAssert();
		a.assertEquals(120, 130);
		System.out.println("Test End");
		a.assertAll();
	}
}



/*
 * difference between hard assert and soft assert
 HardAssert stop compiling code if it fails but SoftAssert complete fail also.
 2.we need to import the class for soft assert and create object whereas it is not necessary to create a object for hard assert
 */
