package kata.ocp;

public class FizzBuzzBangRule implements Rule {

	public boolean isHandle(Integer number) {
		return (number % 3 == 0) && (number % 5 == 0) && (number % 7 == 0);
	}

	public String say(Integer number) {
		return "FizzBuzzBang";
	}

}
