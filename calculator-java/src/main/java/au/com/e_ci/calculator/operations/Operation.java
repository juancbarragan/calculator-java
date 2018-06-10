package au.com.e_ci.calculator.operations;

import java.math.BigDecimal;

public interface Operation {
	public BigDecimal calculate(BigDecimal leftOperand, BigDecimal rightOperand);
}
