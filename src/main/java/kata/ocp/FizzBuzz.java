package kata.ocp;

import java.util.List;

public class FizzBuzz {

	private List<? extends Rule> rules;

	public FizzBuzz(List<? extends Rule> rules) {
		this.rules = rules;
	}

	public String say(Integer number) {
		for (Rule rule : rules) {
			if (rule.isHandle(number)) {
				return rule.say();
			}
		}
		return number.toString();
	}

}
