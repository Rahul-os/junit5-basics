package io.junit.baeldung;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

//@TestInstance(TestInstance.Lifecycle.PER_CLASS)   here when we use per_class only one instance willbe created
//so any one of the test case fails according to the order of execution.
public class SeperateInstanceTest { 
	
	private int sum = 1 ;
	
	@Test
	void addingTwoReturnsThree()
	{
		sum += 2;
		assertEquals(3, sum);
	}
	
	@Test 
	
	void addingFiveReturnsSix()
	{
		sum +=5;
		assertEquals(6, sum);
	}
	
	//there is no order in which a test case will be executed. They will be randomly executed by junit.
	//a seperate instance is created for each method.the above example is the proof for that
	//if a seperate instance is not created there either one of the test cases would have failed.

}
