package kata.ocp;

public class FizzRule implements Rule {

	public boolean isHandle(Integer number) {
		return number % 3 == 0;
	}

	public String say() {
		return "Fizz";
	}

}
