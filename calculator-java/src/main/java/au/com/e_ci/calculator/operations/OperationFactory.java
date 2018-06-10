package au.com.e_ci.calculator.operations;

import au.com.e_ci.calculator.operations.impl.Addition;
import au.com.e_ci.calculator.operations.impl.Division;
import au.com.e_ci.calculator.operations.impl.Multiplication;
import au.com.e_ci.calculator.operations.impl.Substraction;

public class OperationFactory {
	public static Operation getOperationBySymbol(char symbol) {
		switch (symbol) {
		case '+':
			return new Addition();
		case '-':
			return new Substraction();
		case '*':
			return new Multiplication();
		case '/':
			return new Division();
		}
		throw new UnsupportedOperationException("Operation '" + symbol + "' not supported");

	}
}
