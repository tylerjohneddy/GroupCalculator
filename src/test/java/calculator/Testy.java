package calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Testy {
	private Calculator calculator = new Calculator();

	@Test
	public void subtractTest() {
		Calculator calc = new Calculator();
		assertEquals(-5, calc.subtract(10, 15), 0.002);
		assertEquals(5, calc.subtract(10, 5), 0.002);
		assertEquals(-105, calc.subtract(10, 115), 0.002);
		assertEquals(-165, calc.subtract(10, 175), 0.002);
		assertEquals(-25, calc.subtract(-10, 15), 0.002);

	}

	@Test
	public void testSqrt() {
		for (int i = 0; i < 100; i++) {
			assertEquals(i,calculator.sqrt(i*i),0.0001);
		}
	}
