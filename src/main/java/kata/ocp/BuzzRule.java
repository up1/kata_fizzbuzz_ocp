package kata.ocp;

public class BuzzRule implements Rule {

	public boolean isHandle(Integer number) {
		return number % 5 == 0;
	}

	public String say(Integer number) {
		return "Buzz";
	}

}
