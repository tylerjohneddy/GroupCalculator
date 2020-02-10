package calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Testy {
	private Calculator calculator = new Calculator();
	
	@Test
	public void testSqrt() {
		for (int i = 0; i < 100; i++) {
			assertEquals(i,calculator.sqrt(i*i),0.0001);
		}
	}
}
