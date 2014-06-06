package kata.ocp;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void shouldReturnSameNumber() {
		FizzBuzz fizzBuzz = FizzBuzzFactory.create();
		assertEquals("1", fizzBuzz.say(1));
		assertEquals("2", fizzBuzz.say(2));
	}
	
	@Test
	public void shouldReturnFizzForMultiplyOfThree() {
		FizzBuzz fizzBuzz = FizzBuzzFactory.create();
		assertEquals("Fizz", fizzBuzz.say(3));
		assertEquals("Fizz", fizzBuzz.say(6));
	}

}
