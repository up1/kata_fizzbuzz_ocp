package kata.ocp;

public class DefaultRule implements Rule {

	public boolean isHandle(Integer number) {
		return true;
	}

	public String say(Integer number) {
		return number.toString();
	}

}
