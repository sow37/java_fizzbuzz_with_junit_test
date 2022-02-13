package test;

import org.junit.Assert;
import org.junit.Test;

import fizzbuzz.FizzBuzz;

public class TestMultipleOfThree {
	
	@Test
	public void testIsMultipleOfThree(){
		//this case should be true, because 6 is multiple of 3
		Assert.assertTrue(FizzBuzz.isMultipleOfThree(6));
		
		//this case should be false, because 5 isn't multiple of 3
		//Assert.assertTrue(FizzBuzz.isMultipleOfThree(5));
	}
		
}
