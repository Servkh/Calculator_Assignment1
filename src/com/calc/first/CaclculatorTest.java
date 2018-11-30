package com.calc.first;

public class CaclculatorTest {

	public static void main(String[] args) {
		Calculator cal = new Calculator(); {
			cal.setOperandOne(10.5);
			cal.setOperation("+");
			cal.setOperandTwo(5.2);
			cal.getOperation();
			cal.getResults();
		}
	}

}
