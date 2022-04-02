package junit;

import static org.testng.Assert.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
public class AssumptionExample {

	@BeforeAll
	public static void Setup() {
		System.setProperty("ENV", "PROD");
	}
	@Test
	public void test1() {
		assumeTrue("DEV".equals(System.getProperty("ENV")));
		
		assertTrue(StringFunctions.ispalindrom("madam"));
		assertTrue(StringFunctions.ispalindrom("racercar"));
		
		
	}
	
		
	}

