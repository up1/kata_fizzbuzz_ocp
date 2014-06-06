package kata.ocp;

public class FizzBuzzRule implements Rule {

	public boolean isHandle(Integer number) {
		return ( number % 3 ==0 ) && (number % 5 == 0);
	}

	public String say(Integer number) {
		return "FizzBuzz";
	}

}
