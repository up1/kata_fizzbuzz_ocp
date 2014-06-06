package kata.ocp;

public class BangRule implements Rule {

	public boolean isHandle(Integer number) {
		return number % 7 == 0;
	}

	public String say(Integer number) {
		return "Bang";
	}

}
