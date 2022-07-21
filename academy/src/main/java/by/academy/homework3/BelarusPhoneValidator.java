package by.academy.homework3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BelarusPhoneValidator implements Validator {

	@Override
	public boolean validate(String valid) {
		Pattern pattern = Pattern.compile("\\+375");
		Matcher matcher = pattern.matcher(valid);
		if (matcher.lookingAt()) {
			return true;
		} else {
			return false;
		}
	}

}
