package com.TH.calculator.classes;

import com.TH.calculator.interfaces.AdvancedOperations;


public class AdvancedCalculator extends BasicCalculator implements AdvancedOperations {
	
	public double square(double number) {
		return Math.sqrt(number);
	}
	
	public double exponentiation(double base, double exponent) {
		return Math.pow(base, exponent);
	}
	
	public double absoluteValue(double number) {
		return Math.abs(number);
	}
	
    public double logarithm10(double number) {
        return Math.log10(number);
    }
    
    public double sinus(double number) {
        return Math.sin(number);
    }


}
