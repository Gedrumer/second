package by.academy.classworks.classwork18;

import java.util.function.Predicate;

public class Lambda2 {
	public static void main(String[] args) {
		Predicate<String> p = str -> str.contains("A");
		System.out.println(p.test(""));

		Predicate<String> p1 = str -> str != null;
		System.out.println(p1.test(""));
	}

}
