package kata.ocp;

public class FizzBuzz {

	public String say(Integer number) {
		FizzRule fizzRule = new FizzRule();
		if (fizzRule.isHandle(number)) {
			return fizzRule.say();
		}
		return number.toString();
	}

}
