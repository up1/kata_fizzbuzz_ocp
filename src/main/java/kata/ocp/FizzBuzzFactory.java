package kata.ocp;

import java.util.Arrays;

public class FizzBuzzFactory {

	public static FizzBuzz create() {
		return new FizzBuzz( Arrays.asList(new BuzzRule(), new FizzRule(), new DefaultRule()) );
	}

}
