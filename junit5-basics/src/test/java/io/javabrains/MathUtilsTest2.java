package io.javabrains;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathUtilsTest2 {
	
	MathUtils test;
	
	@BeforeEach    //before the execution of each test this init() method will be called and new instance will be created.
	void init()
	{
		test = new MathUtils();
	}
	
	@Test
	void testAdd ()
	{
		//MathUtils test = new MathUtils();
		int actual = test.add(6, 7);
		int expected = 13;
		assertEquals(expected, actual,"the add method didnot give expected result");
	}
	
	//write the test case first and then develop the actual logic is called "Test Driven Development methodology".
	@Test
	void testCircle()
	{
		//MathUtils test = new MathUtils();
		assertEquals(314,test.areaofCircle(10),"actual and expected values didonot match!!!");
	}
	
	//we also can test whether a method is returning the expected Exception or not.
	//the method for that is assertException.
	
	@Test
	void testDivide()
	{
		//MathUtils test = new MathUtils();
		assertThrows(ArithmeticException.class, () -> test.divide(1, 0), "Wrong exception is thrown");
		//lambda expression is used while calling the method. 
		
	}
	
	
}