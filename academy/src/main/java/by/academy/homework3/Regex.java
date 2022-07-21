package by.academy.homework3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	private String date;

	public Regex() {
		super();
	}

	public Regex(String date) {
		super();
		this.date = date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDate() {
		return date;
	}

	public boolean verificationA(String date) {
		Pattern pattern = Pattern.compile("\\d{2}\\/\\d{2}\\/\\d{4}");
		Matcher matcher = pattern.matcher(date);
		if (matcher.find()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean verificationB(String date) {
		Pattern pattern = Pattern.compile("\\d{2}\\-\\d{2}\\-\\d{4}");
		Matcher matcher = pattern.matcher(date);
		if (matcher.find()) {
			return true;
		} else {
			return false;
		}
	}
}
