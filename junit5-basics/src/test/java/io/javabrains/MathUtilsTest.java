package io.javabrains;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilsTest {
	
	@Test
	void testAdd ()
	{
		MathUtils test = new MathUtils();
		int actual = test.add(5, 7);
		int expected = 13;
		assertEquals(expected, actual,"the add method didnot give expected result");
	}
	
	//write the test case first and then develop the actual logic is called "Test Driven Development methodology".
	@Test
	void testCircle()
	{
		MathUtils test = new MathUtils();
		assertEquals(314,test.areaofCircle(10),"actual and expected values didonot match!!!");
	}
	
	//we also can test whether a method is returning the expected Exception or not.
	//the method for that is assertException.
	
	@Test
	void testDivide()
	{
		MathUtils utils = new MathUtils();
		assertThrows(ArithmeticException.class, () -> utils.divide(1, 0), "Wrong exception is thrown");
		//lambda expression is used while calling the method. 
		
	}
	
	//before i.e in junit4 the same testcase has to be written without using lambda expressions as

//	@Test
//	void testDivide()
//	{
//		MathUtils utils = new MathUtils(); 
//		try {
//			utils.divide(10, 0);
//		}
//		catch(ArithmeticException e)
//		{
//			assertEquals(ArithmeticException.class , e);
//		}
//	}
	
}
