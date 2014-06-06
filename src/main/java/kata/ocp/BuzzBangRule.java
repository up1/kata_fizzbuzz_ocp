package kata.ocp;

public class BuzzBangRule implements Rule {

	public boolean isHandle(Integer number) {
		return (number % 5 == 0) && (number % 7 == 0);
	}

	public String say(Integer number) {
		return "BuzzBang";
	}

}
