package io.javabrains;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;




class JunitAnnotations {
	
	MathUtils utils;
	
	@BeforeEach
	void init()
	{
		utils = new MathUtils();
	}
	
	@BeforeAll
	
	  static void someMessage()
	  //if the above method is not declared as static we will get the below error msg.
	  //@BeforeAll method must be static unless the test class is  annotated with @TestInstance(Lifecycle.PER_CLASS)
	{
		System.out.println("this method will be called once before all teh methods");
	}
	
	@Test
	void checkAdd()
	{
		assertEquals(4, utils.add(3, 1));
		
	}
	
	@Test
	void checkSubtraction()
	{
		assertEquals(5, utils.subtract(10, 5));
	}
	@AfterEach
	void showStatusOfMethod()
	{
		System.out.println("Method is tested successfully!!!");
	}
	
}