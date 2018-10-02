package edu.handong.csee.pp1.bigdata.lab1_1;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

//(#5) JUnit test case implemented
public class CalculatorTest {

	@Test
	public void testMain() {
		String[] args = {"2", "3"};
		Calculator.main(args);
		// assertEquals compares the result of an method call with the expected result.
		assertEquals(Calculator.getCount(),4);
	}
	
	@Test
	public void testSum() {
		Calculator myCalc = new Calculator();
		assertEquals(myCalc.sum(2, 3),5);
	}
	
	@Test
	public void testSub() {
		Calculator myCalc = new Calculator();
		assertEquals(myCalc.subtract(2, 3),-1);
	}
	
	@Test
	public void testMod() {
		Calculator myCalc = new Calculator();
		assertEquals(myCalc.mod(4, 2),0);
		assertEquals(myCalc.mod(5, 3),2);
	}

	@Test
	public void testMultiply() {
		Calculator myCalc = new Calculator();
		assertEquals(myCalc.multiply(3, 2),6);
	}
	
	//(#3) Divided by 0 is in the code -> handled in the main
	@Test
	
	public void testDivide() {
		Calculator myCalc = new Calculator();
		assertEquals(myCalc.divide(1, 1),1);
	}
}
