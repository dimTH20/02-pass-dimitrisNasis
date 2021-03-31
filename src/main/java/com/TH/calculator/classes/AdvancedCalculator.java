package com.TH.calculator.classes;

import com.TH.calculator.interfaces.AdvancedOperations;


public class AdvancedCalculator extends BasicCalculator implements AdvancedOperations {
	@Override
	public double square(double number) {
		
		double result = Math.sqrt(number);
		
		if (Double.isInfinite(result)) {
			System.out.println("Is division made by zero?");
			return -0.123456789;
		}
		else if (Double.isNaN(result)) {
			System.out.println("Square: NaN is true.");
			return 0.0;
		}
		else
		{
			return result;			
		}
		
	}
	
	@Override
	public double exponentiation(double base, double exponent) {
		
		double result = Math.pow(base, exponent);
		
		if (Double.isInfinite(result)) {
			System.out.println("Is division made by zero?");
			return -0.123456789;
		}
		else if (Double.isNaN(result)) {
			System.out.println("Exponentiation: NaN is true.");
			return 0.0;
		}
		else
		{
			return result;			
		}
	}
	
	@Override
	public double absoluteValue(double number) {
		double result = Math.abs(number);
		
		if (Double.isInfinite(result)) {
			System.out.println("Is division made by zero?");
			return -0.123456789;
		}
		
		else
		{
			return result;			
		}
	}
	
	
    public double minimumNumber(double number, double number2) {
    	
		return Math.min(number, number2);
    }
    
    
    public double maximumNumber(double number, double number2) {
    	
		return Math.max(number, number2);
    }

}
