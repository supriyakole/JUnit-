package junit;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class StringFunctionTest {

	@Tag("sanity")
	@DisplayName("Positive Test")
	@Test
	public void test1() {
		assertTrue(StringFunctions.ispalindrom("madam"));
		assertTrue(StringFunctions.ispalindrom("racecar"));
		
	}
	@Tag("sanity")
	@DisplayName("Negative Test")
	@Test
	public void test2() {
		assertFalse(StringFunctions.ispalindrom("sayali"));
	}
	
}
