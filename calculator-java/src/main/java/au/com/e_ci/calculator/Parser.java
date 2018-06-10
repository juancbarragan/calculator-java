package au.com.e_ci.calculator;

import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import au.com.e_ci.calculator.operations.OperationFactory;

public class Parser {
	private static final String REGEX_OPERAND = "(\\d+\\.{0,1}\\d*)";
	private static final String REGEX_OPERATION = "(.{1})";

	public static OperationDescriptor parse(String expression) {

		Pattern pattern = Pattern.compile(REGEX_OPERAND + REGEX_OPERATION + REGEX_OPERAND);

		Matcher matcher = pattern.matcher(removeSpaces(expression));

		if (matcher.matches()) {
			BigDecimal leftOperand = new BigDecimal(matcher.group(1));

			String operation = matcher.group(2);
		
			BigDecimal rightOperand = new BigDecimal(matcher.group(3));
	
			return new OperationDescriptor(leftOperand, rightOperand,
					OperationFactory.getOperationBySymbol(operation.charAt(0)));
		}

		throw new IllegalArgumentException("Expression " + expression + " not valid.");

	}

	private static String removeSpaces(String expression) {
		return expression.replaceAll("\\s+", "");
	}
}
