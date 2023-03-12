package io.javabrains;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;

@DisplayName("when running MathUtilsTest3 ")
class MathUtilsTest3 {
	private MathUtils test;
	TestInfo testInfo;            //present in org.junit.jupiter.api
	TestReporter testReporter;
	
	@BeforeEach
	void init(TestInfo testInfo , TestReporter testReporter)
	{
		this.testInfo = testInfo;
		this.testReporter = testReporter;
		test = new MathUtils(); 
		System.out.println("Running"+testInfo.getDisplayName()+" with tag name"+testInfo.getTags());
		testReporter.publishEntry("Running"+testInfo.getDisplayName()+" with tag name"+testInfo.getTags());
		//testReporter output is gonna go into the junit output.
	}
	@Test
	@DisplayName("Testing Add Method")
	@Tag("Math")
	void testAdd ()
	{
		
		int actual = test.add(5, 7);
		int expected = 12;
		assertEquals(expected, actual,"the add method didnot give expected result");
	}
	
	//write the test case first and then develop the actual logic is called "Test Driven Development methodology".
	@Test
	@Disabled
	@DisplayName("Test Driven Development so test is disabled")
	//@Tag("Circle")
	void testCircle()
	{
		
		assertEquals(314,test.areaofCircle(10), () -> "actual and expected values didonot match!!!");
		//we have put the string in the lamda form bcz this string will only get called when the test fails by assertEquals() method.
		//previously the string is being generated and passed to assertEquals() but executes only when test fails
		//but now even the string will be created when only the test fails.
	}
	
	 @Nested 
	 @Tag("Math")
	class TestSubtraction{
		
		@Test
		@DisplayName("Test for positive no's")
		void testPositive()
		{
			assertEquals(5, test.subtract(10, 5),"addition should return the correct sum!");
		}
		
		@Test
		@DisplayName("Test for Negative no's")
		void testNegative()
		{
			assertEquals(-4,test.subtract(-5, -1));
		}
	}
	
	
	@RepeatedTest(3) //3 is the no of times it has to be repeated
	@DisplayName("Divide Method")
	@Tag("Math")
	void testDivide()
	{
		assertThrows(ArithmeticException.class, () -> test.divide(1, 0), "Wrong exception is thrown");	
	}
	
//	@RepeatedTest(3) //3 is the no of times it has to be repeated
//	void testDivide(RepetitionInfo repinfo)
//	{
//		System.out.println(repinfo.hashCode());
//		assertThrows(ArithmeticException.class, () -> test.divide(1, 0), "Wrong exception is thrown");	
//	}
	
	@Test
	@Tag("Math")
	void testMultiply()
	{
		assertAll(	
						() -> assertEquals(6, test.multiply(2, 3)),                  //assertions are basically functional interfaces
						() -> assertEquals(-4,test.multiply(-2,2))
				);
		
	}
}