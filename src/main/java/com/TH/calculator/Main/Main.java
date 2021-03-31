package com.TH.calculator.Main;

import com.TH.calculator.classes.AdvancedCalculator;
import com.TH.calculator.classes.BasicCalculator;


public class Main {

	public static void main(String[] args) {
		
		BasicCalculator basicCalculator = new BasicCalculator();
		System.out.println(basicCalculator.addition(2, 3));
		System.out.println(basicCalculator.subtraction(3, 2));
		System.out.println(basicCalculator.multiplication(20, 3));
		System.out.println(basicCalculator.division(30, 2));

		AdvancedCalculator advancedCalculator = new AdvancedCalculator();
		System.out.println(advancedCalculator.square(12.0));
		System.out.println(advancedCalculator.exponentiation(2.0, 4.0));
		System.out.println(advancedCalculator.absoluteValue(-7.2));
		System.out.println(advancedCalculator.minimumNumber(20.0, 10.0));
		System.out.println(advancedCalculator.maximumNumber(27.0, 12.0));

	}

}
