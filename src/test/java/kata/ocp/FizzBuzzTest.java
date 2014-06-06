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
	
	@Test
	public void shouldReturnBuzzForMultiplyOfFive() {
		FizzBuzz fizzBuzz = FizzBuzzFactory.create();
		assertEquals("Buzz", fizzBuzz.say(5));
		assertEquals("Buzz", fizzBuzz.say(10));
	}
	
	@Test
	public void shouldReturnFizzBuzzForMultiplyOfThreeAndFive() {
		FizzBuzz fizzBuzz = FizzBuzzFactory.create();
		assertEquals("FizzBuzz", fizzBuzz.say(15));
		assertEquals("FizzBuzz", fizzBuzz.say(30));
	}

}
