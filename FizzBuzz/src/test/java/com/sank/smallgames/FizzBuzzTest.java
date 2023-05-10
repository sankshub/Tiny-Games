package com.sank.smallgames;

import org.junit.Assert;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

	private FizzBuzz fizzBuzz;

	@Before
	public void setup() {
		fizzBuzz = new FizzBuzz();
	}

	@Test
	public void testAllwaysReturnsString() {
		Assert.assertEquals("1", fizzBuzz.play(1));
	}
	
	@Test
	public void testFizz() {
		Assert.assertEquals("Fizz", fizzBuzz.play(3));
	}

	@Test
	public void testFizzDivisiableBy3() {
		Assert.assertEquals("Fizz", fizzBuzz.play(6));
	}
	
	@Test
	public void testBuzz() {
		Assert.assertEquals("Buzz", fizzBuzz.play(5));
	}

	@Test
	public void testBuzzDivisiableBy5() {
		Assert.assertEquals("Buzz", fizzBuzz.play(20));
	}
	
	@Test
	public void testFizzBuzz() {
		Assert.assertEquals("FizzBuzz", fizzBuzz.play(15));
	}
}
