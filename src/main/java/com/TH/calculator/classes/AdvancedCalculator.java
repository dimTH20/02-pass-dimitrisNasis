package com.TH.calculator.classes;

import com.TH.calculator.interfaces.AdvancedOperations;


public class AdvancedCalculator extends BasicCalculator implements AdvancedOperations {
	
	public double square(double number) {
		double result = Math.sqrt(number);
		return result;
	}
	
	
	public double exponentiation(double base, double exponent) {
		double result = Math.pow(base, exponent);
		return result;
	}
	
	
	public double absoluteValue(double number) {
		double result = Math.abs(number);
		return result;
	}
	
	
    public double minimumNumber(double number, double number2) {
		return Math.min(number, number2);
    }
    
    
    public double maximumNumber(double number, double number2) {
		return Math.max(number, number2);
    }

}
