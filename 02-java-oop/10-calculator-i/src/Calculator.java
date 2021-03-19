
public class Calculator implements java.io.Serializable {
	private double operandOne;
	private double operandTwo;
	private String operation;
	private double result;

	// constructor

	public Calculator() {

	}
	
	// Methods of a calculator

	public void performOperation(double operandOne, String operation, double operandTwo) {
		if (operation == "+") {
			this.result = operandOne + operandTwo;
		} else if (operation == "-") {
			this.result = operandOne - operandTwo;
		} else {
			System.out.println("You may add or subtract only.");
		}
	}

	public void getResult() {
		System.out.println(this.result);
	}
	
	// getters and setters

	public double getOperandOne() {
		return operandOne;
	}

	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}

	public double getOperandTwo() {
		return operandTwo;
	}

	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}


}
