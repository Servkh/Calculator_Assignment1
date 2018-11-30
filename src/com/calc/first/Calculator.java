package com.calc.first;

@SuppressWarnings("serial")
public class Calculator implements java.io.Serializable  {
	private Double OperandOne;
	private Double OperandTwo;
	private String Operation;
	private Double Results;
	
	
	public Calculator() {
		
	}

	public Double getOperandOne() {
		return OperandOne;
	}



	public void setOperandOne(Double operandOne) {
		this.OperandOne = operandOne;
	}



	public Double getOperandTwo() {
		return OperandTwo;
	}



	public void setOperandTwo(Double operandTwo) {
		this.OperandTwo = operandTwo;
	}



	public String getOperation() {
		if(Operation.equals("+")) {
			this.Results = getOperandOne() + getOperandTwo();
			System.out.println(this.Results);
		}
		else if(Operation.equals("-")) {
			this.Results = getOperandOne() - getOperandTwo();
			System.out.println(this.Results);
		}
		else {
			System.out.println("Operation Faild!");
		}
		
		return Operation;
	}



	public void setOperation(String operation) {
		if(operation == "+" || operation == "-"){
			
			this.Operation = operation;
			System.out.println("Operation Done!");
		}
		else {
			System.out.println("Operatin can not be done, Invalid operation. Please try again!");
		}
	}



	public Double getResults() {
		return Results;
	}



	public void setResults(Double results) {
		this.Results = results;
	}

}
