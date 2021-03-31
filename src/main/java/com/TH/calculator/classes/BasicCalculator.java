package com.TH.calculator.classes;

import com.TH.calculator.interfaces.BasicOperations;


public class BasicCalculator implements BasicOperations {
	
	public int addition(int firstNumber, int secondNumber) {
		return firstNumber + secondNumber;
	}
	
	public int subtraction(int firstNumber, int secondNumber) {
		return firstNumber - secondNumber;
	}
	
	public int multiplication(int firstNumber, int secondNumber) {
		return firstNumber * secondNumber;
	}
	
	@Override
	public double division(double firstNumber, double secondNumber) {
		
		double result = firstNumber / secondNumber;
		
		if (Double.isInfinite(result)) {
			System.out.println("Is division made by zero?");
			return -0.123456789;
		}
		else
		{
			return result;			
		}
		
	}

	
}
