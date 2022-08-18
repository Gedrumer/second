package by.academy.classworks.classwork18;

import java.util.function.Function;

public class MetRef {

	public static void main(String[] args) {
		Function<String, String> function = s -> s.toLowerCase();
		System.out.println(function.apply("OCPJP 8"));
		Function<String, String> function1 = String::toLowerCase;
		System.out.println(function1.apply("OCPJP 8"));

	}

}
