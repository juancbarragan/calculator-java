package au.com.e_ci.calculator;

import java.math.BigDecimal;

public class Calculator {
	
	/**
	 * This is the entry method to calculate an expression.
	 * 
	 * This is the only javadoc for example purpose only. 
	 * 
	 * @param expression to calculate
	 * @return a BigDecimal containing the result of the expression.
	 */
	public static BigDecimal calculate(String expression) {
		OperationDescriptor operationDescriptor = Parser.parse(expression);
		return operationDescriptor.getOperation().calculate(operationDescriptor.getLeftOperand(),
				operationDescriptor.getRightOperand());
	}

	public static void main(String[] args) {
		if(args.length < 1) {
			throw new RuntimeException("Please provide an expression to calculate");
		}
		
		System.out.println("Calculating " + args[0]);
		System.out.println(calculate(args[0]));
	}
}
