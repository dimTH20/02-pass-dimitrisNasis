package com.TH.calculator.Main;

import com.TH.calculator.classes.AdvancedCalculator;
import com.TH.calculator.classes.BasicCalculator;


public class Main {

	public static void main(String[] args) {
		
		BasicCalculator basicCalculator = new BasicCalculator();
		System.out.println(basicCalculator.addition(2.3, 3.5));
		System.out.println(basicCalculator.subtraction(3.5, 2.3));
		System.out.println(basicCalculator.multiplication(2.3, 3.5));
		System.out.println(basicCalculator.division(3.5, 2.3));

		AdvancedCalculator advancedCalculator = new AdvancedCalculator();
		System.out.println(advancedCalculator.square(12.0));
		System.out.println(advancedCalculator.exponentiation(2.0, 4.0));
		System.out.println(advancedCalculator.absoluteValue(-7.2));
		System.out.println(advancedCalculator.logarithm10(20.0));
		System.out.println(advancedCalculator.sinus(27.0));

	}

}
