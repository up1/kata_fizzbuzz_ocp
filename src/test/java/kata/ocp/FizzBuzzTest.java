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
	
	@Test
	public void shouldReturnBangForMultiplyOfSeven() {
		FizzBuzz fizzBuzz = FizzBuzzFactory.create();
		assertEquals("Bang", fizzBuzz.say(7));
		assertEquals("Bang", fizzBuzz.say(14));
	}
	
	@Test
	public void shouldReturnFizzBangForMultiplyOfThreeAndSeven() {
		FizzBuzz fizzBuzz = FizzBuzzFactory.create();
		assertEquals("FizzBang", fizzBuzz.say(3*7));
	}
	
	@Test
	public void shouldReturnBuzzBangForMultiplyOfFiveAndSeven() {
		FizzBuzz fizzBuzz = FizzBuzzFactory.create();
		assertEquals("BuzzBang", fizzBuzz.say(5*7));
	}

}
