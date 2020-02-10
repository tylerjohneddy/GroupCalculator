package calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Testy {
	private Calculator calculator = new Calculator();

	@Test
	public void subtractTest() {
		assertEquals(-5, calculator.subtract(10, 15), 0.002);
		assertEquals(5, calculator.subtract(10, 5), 0.002);
		assertEquals(-105, calculator.subtract(10, 115), 0.002);
		assertEquals(-165, calculator.subtract(10, 175), 0.002);
		assertEquals(-25, calculator.subtract(-10, 15), 0.002);

	}


	@Test
	public void testSqrt() {
		for (int i = 0; i < 100; i++) {
			assertEquals(i, calculator.sqrt(i * i), 0.0001);
		}
	}
}
