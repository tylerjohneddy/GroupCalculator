package calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
<<<<<<< HEAD

public class Testy {
	@Test
	public void subtractTest() {
		Calculator calc = new Calculator();
		assertEquals(-5, calc.subtract(10, 15), 0.002);
		assertEquals(5, calc.subtract(10, 5), 0.002);
		assertEquals(-105, calc.subtract(10, 115), 0.002);
		assertEquals(-165, calc.subtract(10, 175), 0.002);
		assertEquals(-25, calc.subtract(-10, 15), 0.002);

	}
=======
>>>>>>> 5578bbc431793fcde5dfef35626321609f70ffe9

public class Testy {
	private Calculator calculator = new Calculator();
	
	@Test
	public void testSqrt() {
		for (int i = 0; i < 100; i++) {
			assertEquals(i,calculator.sqrt(i*i),0.0001);
		}
	}
}
