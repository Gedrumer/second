package by.academy.classworks.classwork12;

import java.io.Serializable;

import by.academy.classworks.classwork8.Animal;

public class Cat extends Animal implements Serializable{
	private static final long serialVersionUID = 1L;
	String color="RED";
	public void mew() {
		System.out.println("MEW!!");
	}
		public void eat() {
			System.out.println("EAT!!");
		}

}
