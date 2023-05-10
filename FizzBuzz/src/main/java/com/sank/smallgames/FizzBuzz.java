package com.sank.smallgames;

public class FizzBuzz {

	public String play(Integer number) {
		if (number == null)
			return "Not a Number";
		if (number % 3 == 0 && number % 5 == 0)
			return "FizzBuzz";
		if (number % 3 == 0)
			return "Fizz";
		if (number % 5 == 0)
			return "Buzz";
		return String.valueOf(number);
	}
}
