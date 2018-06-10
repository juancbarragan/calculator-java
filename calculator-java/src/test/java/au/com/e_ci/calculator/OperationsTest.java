package au.com.e_ci.calculator;
import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

import au.com.e_ci.calculator.operations.impl.Addition;
import au.com.e_ci.calculator.operations.impl.Division;
import au.com.e_ci.calculator.operations.impl.Multiplication;
import au.com.e_ci.calculator.operations.impl.Substraction;

public class OperationsTest {
	@Test
	public void testAddition() {
		BigDecimal result =  new Addition().calculate(BigDecimal.valueOf(123), BigDecimal.valueOf(321));
		assertEquals(BigDecimal.valueOf(123).add(BigDecimal.valueOf(321)), result);
		
	}
	
	@Test
	public void testSubstraction() {
		BigDecimal result =  new Substraction().calculate(BigDecimal.valueOf(123), BigDecimal.valueOf(321));
		assertEquals(BigDecimal.valueOf(123).subtract(BigDecimal.valueOf(321)), result);
		
	}
	
	@Test
	public void testDivision() {
		BigDecimal result =  new Division().calculate(BigDecimal.valueOf(25), BigDecimal.valueOf(2));
		assertEquals(BigDecimal.valueOf(25).divide(BigDecimal.valueOf(2)), result);
		
	}
	
	@Test
	public void testMultiplication() {
		BigDecimal result =  new Multiplication().calculate(BigDecimal.valueOf(123), BigDecimal.valueOf(321));
		assertEquals(BigDecimal.valueOf(123).multiply(BigDecimal.valueOf(321)), result);
		
	}
}
