package au.com.e_ci.calculator;
import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import au.com.e_ci.calculator.OperationDescriptor;
import au.com.e_ci.calculator.Parser;
import au.com.e_ci.calculator.operations.impl.Addition;
import au.com.e_ci.calculator.operations.impl.Division;
import au.com.e_ci.calculator.operations.impl.Multiplication;
import au.com.e_ci.calculator.operations.impl.Substraction;

public class ParserTest {

	@Test
	public void testParseSingleDigitNoSpaces() {

		OperationDescriptor operationDescriptor = Parser.parse("3+4");

		Assert.assertEquals(BigDecimal.valueOf(3), operationDescriptor.getLeftOperand());
		Assert.assertEquals(BigDecimal.valueOf(4), operationDescriptor.getRightOperand());
		Assert.assertTrue(operationDescriptor.getOperation() instanceof Addition);
	}
	
	@Test
	public void testParseSingleDigitWithSpaces() {

		OperationDescriptor operationDescriptor = Parser.parse(" 3  + 4 ");

		Assert.assertEquals(BigDecimal.valueOf(3), operationDescriptor.getLeftOperand());
		Assert.assertEquals(BigDecimal.valueOf(4), operationDescriptor.getRightOperand());
		Assert.assertTrue(operationDescriptor.getOperation() instanceof Addition);
	}
	
	@Test
	public void testParseMultipleDigit() {

		OperationDescriptor operationDescriptor = Parser.parse("321 + 324");

		Assert.assertEquals(BigDecimal.valueOf(321), operationDescriptor.getLeftOperand());
		Assert.assertEquals(BigDecimal.valueOf(324), operationDescriptor.getRightOperand());
		Assert.assertTrue(operationDescriptor.getOperation() instanceof Addition);
	}
	
	@Test
	public void testWithDecimals() {

		OperationDescriptor operationDescriptor = Parser.parse("32.2 + 3.24");

		Assert.assertEquals(BigDecimal.valueOf(32.2), operationDescriptor.getLeftOperand());
		Assert.assertEquals(BigDecimal.valueOf(3.24), operationDescriptor.getRightOperand());
		Assert.assertTrue(operationDescriptor.getOperation() instanceof Addition);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testParseCharactersLeftSide() {
		Parser.parse("32d + 324");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testParseCharactersRightSide() {
		Parser.parse("32 + 3d24");
	}
	
	@Test
	public void testSubstraction() {
		OperationDescriptor operationDescriptor = Parser.parse("553 - 4324");

		Assert.assertEquals(BigDecimal.valueOf(553), operationDescriptor.getLeftOperand());
		Assert.assertEquals(BigDecimal.valueOf(4324), operationDescriptor.getRightOperand());
		Assert.assertTrue(operationDescriptor.getOperation() instanceof Substraction);
	}
	
	@Test
	public void testMultiplication() {
		OperationDescriptor operationDescriptor = Parser.parse("553 * 4324");

		Assert.assertEquals(BigDecimal.valueOf(553), operationDescriptor.getLeftOperand());
		Assert.assertEquals(BigDecimal.valueOf(4324), operationDescriptor.getRightOperand());
		Assert.assertTrue(operationDescriptor.getOperation() instanceof Multiplication);
	}
	
	@Test
	public void testDivision() {
		OperationDescriptor operationDescriptor = Parser.parse("553 / 4324");

		Assert.assertEquals(BigDecimal.valueOf(553), operationDescriptor.getLeftOperand());
		Assert.assertEquals(BigDecimal.valueOf(4324), operationDescriptor.getRightOperand());
		Assert.assertTrue(operationDescriptor.getOperation() instanceof Division);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void testParseOtherOperation() {
		Parser.parse("32 % 34");
	}
}
