package au.com.e_ci.calculator.operations.impl;

import java.math.BigDecimal;

import au.com.e_ci.calculator.operations.Operation;

public class Multiplication implements Operation{

	public BigDecimal calculate(BigDecimal leftOperand, BigDecimal rightOperand) {
		return leftOperand.multiply(rightOperand);
	}

	

}
