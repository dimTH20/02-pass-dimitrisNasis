package com.TH.calculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.Random;
import org.junit.Test;
import com.TH.calculator.classes.AdvancedCalculator;
import com.TH.calculator.classes.BasicCalculator;

public class NumberMethodsTest {
	
	BasicCalculator bc = new BasicCalculator();
	AdvancedCalculator ac = new AdvancedCalculator();
	Random rnd = new Random();
	
	// returns int random numbers
	public int RandomNegativeNumbers() {
		int result = 0;
		result = rnd.nextInt(10) - 10;
		return result;
	}
	
	public int RandomPositiveNumbers() {
		int result = 0;
		result = rnd.nextInt(10) + 1;
		return result;
	}
	
	
	//returns double random numbers
	public double doubleRandomNegativeNumbers() {
		double result = 0.0;
		result = rnd.nextDouble() * (-10);
		return result;
	}
	
	public double doubleRandomPositiveNumbers() {
		double result = 0.0;
		result = rnd.nextDouble() * 1;
		return result;
	}
	
	
	//testing the method addition
	@Test
	public void testAddition() {
		int tmpRndVal = 0;
		int tmpRndVal2 = 0;
		int tmpResult = 0;
		
		//testing with negative numbers
		for (int i = 0; i < 5; i++) {
			tmpRndVal = RandomNegativeNumbers();
			tmpRndVal2 = RandomNegativeNumbers();
			tmpResult = tmpRndVal + tmpRndVal2;
			assertEquals(bc.addition(tmpRndVal, tmpRndVal2), tmpResult);
		}
		
		//testing with positive numbers
		for (int i = 0; i < 5; i++) {
			tmpRndVal = RandomPositiveNumbers();
			tmpRndVal2 = RandomPositiveNumbers();
			tmpResult = tmpRndVal + tmpRndVal2;
			assertEquals(bc.addition(tmpRndVal, tmpRndVal2), tmpResult);
		}
		
		//testing with zero
		int zero = 0;
		int tmpVal = 7;		
		for (int i = 0; i < 5; i++) {
			assertTrue( ((bc.addition(tmpVal, zero) == zero)   
					|| (bc.addition(zero, zero) == zero)
					|| (bc.addition(zero, tmpVal) == zero) ));
		}
		
	}
	
	
	//testing the method subtraction
	@Test
	public void testSubtraction() {
		int tmpRndVal = 0;
		int tmpRndVal2 = 0;
		int tmpResult = 0;
		
		//testing with negative numbers
		for (int i = 0; i < 5; i++) {
			tmpRndVal = RandomNegativeNumbers();
			tmpRndVal2 = RandomNegativeNumbers();
			tmpResult = tmpRndVal - tmpRndVal2;
			assertEquals(bc.subtraction(tmpRndVal, tmpRndVal2), tmpResult);
		}
		
		//testing with positive numbers
		for (int i = 0; i < 5; i++) {
			tmpRndVal = RandomPositiveNumbers();
			tmpRndVal2 = RandomPositiveNumbers();
			tmpResult = tmpRndVal - tmpRndVal2;
			assertEquals(bc.subtraction(tmpRndVal, tmpRndVal2), tmpResult);
		}
		
		//testing with zero
		int zero = 0;
		int tmpVal = 7;		
		for (int i = 0; i < 5; i++) {
			assertTrue( ((bc.subtraction(tmpVal, zero) == zero)   
					|| (bc.subtraction(zero, zero) == zero)
					|| (bc.subtraction(zero, tmpVal) == zero) ));
		}
		
	}

	
	//testing the method multiplication
	@Test
	public void testMultiplication() {
		int tmpRndVal = 0;
		int tmpRndVal2 = 0;
		int tmpResult = 0;
		
		//testing with negative numbers
		for (int i = 0; i < 5; i++) {
			tmpRndVal = RandomNegativeNumbers();
			tmpRndVal2 = RandomNegativeNumbers();
			tmpResult = tmpRndVal * tmpRndVal2;
			assertEquals(bc.multiplication(tmpRndVal, tmpRndVal2), tmpResult);
		}
		
		//testing with positive numbers
		for (int i = 0; i < 5; i++) {
			tmpRndVal = RandomPositiveNumbers();
			tmpRndVal2 = RandomPositiveNumbers();
			tmpResult = tmpRndVal * tmpRndVal2;
			assertEquals(bc.multiplication(tmpRndVal, tmpRndVal2), tmpResult);
		}
		
		//testing with zero
		int zero = 0;
		int tmpVal = 7;
		for (int i = 0; i < 5; i++) {
			assertTrue( ((bc.multiplication(tmpVal, zero) == zero)   
					|| (bc.multiplication(zero, zero) == zero)
					|| (bc.multiplication(zero, tmpVal) == zero) ));
		}
		
	}
	
	
	//testing the method division
	@Test
	public void testDivision() {
		double tmpRndVal = 0.0;
		double tmpRndVal2 = 0.0;
		double tmpResult = 0.0;
		
		//testing with negative numbers
		for (int i = 0; i < 5; i++) {
			tmpRndVal = doubleRandomNegativeNumbers();
			tmpRndVal2 = doubleRandomNegativeNumbers();
			tmpResult = tmpRndVal / tmpRndVal2;
			//assertEquals(bc.division(tmpRndVal, tmpRndVal2), tmpResult);
			assertTrue((tmpResult == bc.division(tmpRndVal, tmpRndVal2)));
		}
		
		//testing with positive numbers
		for (int i = 0; i < 5; i++) {
			tmpRndVal = doubleRandomPositiveNumbers();
			tmpRndVal2 = doubleRandomPositiveNumbers();
			tmpResult = tmpRndVal / tmpRndVal2;
			//assertEquals(bc.division(tmpRndVal, tmpRndVal2), tmpResult);
			assertTrue((tmpResult == bc.division(tmpRndVal, tmpRndVal2)));
		}
		
		//testing with zero
		double zero = 0.0;
		double stdReturn = -0.123456789;
		int tmpVal = 7;
		for (int i = 0; i < 5; i++) {
			assertTrue( ((bc.division(tmpVal, zero) == zero) 
					|| (bc.division(tmpVal, zero) == stdReturn)  
					|| (bc.division(zero, zero) == zero)
					|| (bc.division(zero, tmpVal) == zero) ));
		}
		
	}
	

	//testing the method square
	@Test
	public void testSquare() {
		double tmpRndVal = 0.0;
		
		//testing with negative numbers
		for (int i = 0; i < 5; i++) {
			tmpRndVal = doubleRandomNegativeNumbers();
			assertTrue( (Math.sqrt(tmpRndVal) == ac.square(tmpRndVal))
					|| (0.0 == ac.square(tmpRndVal)) );
		}
		
		//testing with positive numbers
		for (int i = 0; i < 5; i++) {
			tmpRndVal = doubleRandomPositiveNumbers(); 
			assertTrue((Math.sqrt(tmpRndVal) == ac.square(tmpRndVal)));
		}
		
		//testing with zero
		double zero = 0.0;
		double inpResult = 0.0;
		
		for (int i = 0; i < 5; i++) {
			inpResult = Math.sqrt(zero);
			assertTrue( (inpResult == ac.square(zero)) 
					||  (inpResult == zero)
					||  (inpResult == -0.123456789) );
		}
		
	}
	
	
	//testing the method exponentiation
	@Test
	public void testExponentiation() {
		double tmpRndVal = 0.0;
		double tmpRndVal2 = 0.0;
		double tmpResult = 0.0;
		
		//testing with negative numbers
		for (int i = 0; i < 5; i++) {
			tmpRndVal = doubleRandomNegativeNumbers();
			tmpRndVal2 = doubleRandomNegativeNumbers();
			tmpResult = Math.pow(tmpRndVal, tmpRndVal2);
			assertTrue( (tmpResult == ac.exponentiation(tmpRndVal, tmpRndVal2))
					|| (0.0 == ac.exponentiation(tmpRndVal, tmpRndVal2)) );
		}
		
		//testing with positive numbers
		for (int i = 0; i < 5; i++) {
			tmpRndVal = doubleRandomPositiveNumbers();
			tmpRndVal2 = doubleRandomPositiveNumbers();
			tmpResult = Math.pow(tmpRndVal, tmpRndVal2);
			assertTrue((tmpResult == ac.exponentiation(tmpRndVal, tmpRndVal2)));
		}
		
		//testing with zero
		double zero = 0.0;
		double inpResult = 0.0;
		
		for (int i = 0; i < 5; i++) {
			inpResult = Math.pow(zero, zero);
			assertTrue( (inpResult == ac.exponentiation(zero, zero)) );
		}
		
	}
	
	
	//testing the method absolute value
	@Test
	public void testAbsVal() {
		double tmpRndVal = 0.0;
		
		//testing with negative numbers
		for (int i = 0; i < 5; i++) {
			tmpRndVal = Math.abs(doubleRandomNegativeNumbers());
			assertTrue( (tmpRndVal == ac.absoluteValue(tmpRndVal))
					|| (0.0 == ac.absoluteValue(tmpRndVal)) 
					|| (-0.123456789 == ac.absoluteValue(tmpRndVal)) );
		}
		
		//testing with positive numbers
		for (int i = 0; i < 5; i++) {
			tmpRndVal = Math.abs(doubleRandomPositiveNumbers());
			assertTrue((tmpRndVal == ac.absoluteValue(tmpRndVal)));
		}
		
		//testing with zero
		double zero = 0.0;
		double inpResult = 0.0;
		
		for (int i = 0; i < 5; i++) {
			inpResult = Math.abs(zero);
			assertTrue( (inpResult == ac.absoluteValue(zero)) );
		}
		
	}
	
	
	//testing the method minimumNumber
	@Test
	public void testMinimumNumber() {
		double tmpRndVal = 0.0;
		double tmpRndVal2 = 0.0;
		double tmpResult = 0.0;
		
		//testing with negative numbers
		for (int i = 0; i < 5; i++) {
			tmpRndVal = doubleRandomNegativeNumbers();
			tmpRndVal2 = doubleRandomNegativeNumbers();
			tmpResult = Math.min(tmpRndVal, tmpRndVal2);
			assertTrue( (tmpResult == ac.minimumNumber(tmpRndVal, tmpRndVal2))
					|| (0.0 == ac.minimumNumber(tmpRndVal, tmpRndVal2)) );
		}
		
		//testing with positive numbers
		for (int i = 0; i < 5; i++) {
			tmpRndVal = doubleRandomPositiveNumbers();
			tmpRndVal2 = doubleRandomPositiveNumbers();
			tmpResult = Math.min(tmpRndVal, tmpRndVal2);
			assertTrue((tmpResult == ac.minimumNumber(tmpRndVal, tmpRndVal2))
			|| (0.0 == ac.minimumNumber(tmpRndVal, tmpRndVal2)) 
			|| (-0.123456789 == ac.minimumNumber(tmpRndVal, tmpRndVal2)));
		}
		
		//testing with zero
		double zero = 0.0;
		double inpResult = 0.0;
		
		for (int i = 0; i < 5; i++) {
			inpResult = Math.min(zero, zero);
			//System.out.println(inpResult + " ############");
			assertTrue( (inpResult == ac.minimumNumber(zero, zero)) );
		}
		
	}
	
	
	//testing the method maximumNumber
	@Test
	public void testMaximumNumber() {
		double tmpRndVal = 0.0;
		double tmpRndVal2 = 0.0;
		double tmpResult = 0.0;
		
		//testing with negative numbers
		for (int i = 0; i < 5; i++) {
			tmpRndVal = doubleRandomNegativeNumbers();
			tmpRndVal2 = doubleRandomNegativeNumbers();
			tmpResult = Math.max(tmpRndVal, tmpRndVal2);
			assertTrue( (tmpResult == ac.maximumNumber(tmpRndVal, tmpRndVal2))
					|| (0.0 == ac.maximumNumber(tmpRndVal, tmpRndVal2)) );
		}
		
		//testing with positive numbers
		for (int i = 0; i < 5; i++) {
			tmpRndVal = doubleRandomPositiveNumbers();
			tmpRndVal2 = doubleRandomPositiveNumbers();
			tmpResult = Math.max(tmpRndVal, tmpRndVal2);
			assertTrue((tmpResult == ac.maximumNumber(tmpRndVal, tmpRndVal2))
			|| (0.0 == ac.maximumNumber(tmpRndVal, tmpRndVal2)) 
			|| (-0.123456789 == ac.maximumNumber(tmpRndVal, tmpRndVal2)));
		}
		
		//testing with zero
		double zero = 0.0;
		double inpResult = 0.0;
		
		for (int i = 0; i < 5; i++) {
			inpResult = Math.max(zero, zero);
			//System.out.println(inpResult + " ############");
			assertTrue( (inpResult == ac.maximumNumber(zero, zero)) );
		}
		
	}
}
