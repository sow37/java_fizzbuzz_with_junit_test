package test;

import org.junit.Assert;
import org.junit.Test;

import fizzbuzz.FizzBuzz;

public class TestMultipleOfFive {
	
	@Test
	public void testIsMultipleOfFive(){
		//this case should be true, because 20 is multiple of 5
		Assert.assertTrue(FizzBuzz.isMultipleOfFive(20));
		
		//this case should be false, because 17 isn't multiple of 5
		//Assert.assertTrue(FizzBuzz.isMultipleOfFive(17));
	}
		
}
