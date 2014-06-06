package kata.ocp;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void shouldReturnSameNumber() {
		FizzBuzz fizzBuzz = FizzBuzzFactory.create();
		assertEquals("1", fizzBuzz.say(1));
		assertEquals("2", fizzBuzz.say(1));
	}

}
