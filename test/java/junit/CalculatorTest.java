package junit;

import static org.testng.AssertJUnit.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

	@Test
	public void addTest1() {
		assertEquals(9,Calculator.add(4, 5));
	}
}
