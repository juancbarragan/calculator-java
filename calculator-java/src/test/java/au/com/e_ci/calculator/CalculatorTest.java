package au.com.e_ci.calculator;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

import au.com.e_ci.calculator.Calculator;

public class CalculatorTest {

	@Test
	public void testCalculator() {
		assertEquals(new BigDecimal(3 + 5), Calculator.calculate("3+5"));
		assertEquals(new BigDecimal(3 * 5), Calculator.calculate("3*5"));
		assertEquals(new BigDecimal(3 - 5), Calculator.calculate("3-5"));
		assertEquals(BigDecimal.valueOf(3).divide(BigDecimal.valueOf(5)), Calculator.calculate("3/5"));

		assertEquals(BigDecimal.valueOf(32.3).multiply(BigDecimal.valueOf(54.7)), Calculator.calculate("32.3 * 54.7"));

	}
}
