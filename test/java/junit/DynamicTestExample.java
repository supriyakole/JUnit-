package junit;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public class DynamicTestExample {
	
	@TestFactory
	public List<DynamicTest> method1() {
		return Arrays.asList( 
				DynamicTest.dynamicTest("Positive Test", ()-> assertTrue(StringFunctions.ispalindrom("madam"))),
				
				DynamicTest.dynamicTest("Negative Test", ()-> assertFalse(StringFunctions.ispalindrom("sayali")))
				
				);

	}

}
