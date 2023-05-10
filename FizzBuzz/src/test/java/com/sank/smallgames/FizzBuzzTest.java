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

}
