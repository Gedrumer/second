package by.academy.lesson5;

public class Task2 {

	public static void main(String[] args) {
		String str = "I like Java!!!";

		System.out.println(str.charAt(10));
		System.out.println(str.endsWith("!!!"));//endsWith заканчивается на !!!
		System.out.println(str.startsWith("I like"));//startsWith начинается с I like
		System.out.println(str.contains("Java")); //contains содержит ли 
		System.out.println(str.lastIndexOf("Java")); // lastIndexOf() найти позицию в строке 
		System.out.println(str.replace("a","o"));//replace поменять символы
		System.out.println(str.toLowerCase());//toLowerCase к нижнему регистру
		System.out.println(str.toUpperCase());//toUpperCase к верхнему регистру
		System.out.println(str.substring(7,11));//substring вырезать строку от ... до....
	}

}
