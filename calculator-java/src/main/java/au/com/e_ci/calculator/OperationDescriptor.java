package au.com.e_ci.calculator;

import java.math.BigDecimal;

import au.com.e_ci.calculator.operations.Operation;

public class OperationDescriptor {
	private BigDecimal leftOperand;
	private BigDecimal rightOperand;
	private Operation operation;

	public OperationDescriptor(BigDecimal leftOperand, BigDecimal rightOperand, Operation operation) {
		super();
		this.leftOperand = leftOperand;
		this.rightOperand = rightOperand;
		this.operation = operation;
	}

	public BigDecimal getLeftOperand() {
		return leftOperand;
	}

	public void setLeftOperand(BigDecimal leftOperand) {
		this.leftOperand = leftOperand;
	}

	public BigDecimal getRightOperand() {
		return rightOperand;
	}

	public void setRightOperand(BigDecimal rightOperand) {
		this.rightOperand = rightOperand;
	}

	public Operation getOperation() {
		return operation;
	}

	public void setOperation(Operation operation) {
		this.operation = operation;
	}

}
