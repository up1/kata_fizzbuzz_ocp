package kata.ocp;

import java.util.Arrays;

public class FizzBuzzFactory {

	public static FizzBuzz create() {
		return new FizzBuzz(Arrays.asList(
				new FizzBangRule(),
				new BangRule(),
				new FizzBuzzRule(),
				new BuzzRule(), 
				new FizzRule(),
				new DefaultRule()));
	}

}
