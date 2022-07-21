package by.academy.homework3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator implements Validator {

	@Override
	public boolean validate(String valid) {
		Pattern pattern = Pattern.compile("^([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}$");
		Matcher matcher = pattern.matcher(valid);
		if (matcher.lookingAt()) {
			return true;
		} else {
			return false;
		}

	}

}
