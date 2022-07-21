package by.academy.classworks.classwork12;
//6. а)

import java.io.Serializable;

import by.academy.classworks.classwork8.Animal;

//Создать обобщенный
//класс стремя параметрами (T, V, K). 
//Класс содержит три переменные типа (T, V, K), конструктор, принимающий на вход параметры типа (T, V, K), методы возвращающие значения трех переменных.
//Создать метод, выводящий на консоль имена классов для трех переменных класса.
//б) Наложить ограничения на параметры типа: T должен реализовать интерфейс Comparable (классы-оболочки, String), V должен реализовать интерфейс Serializable и расширять класс Animal, K должен расширять класс Number.

public class Task6<T extends Comparable, V extends Animal & Serializable, K extends Number> {
	private T tVariable;
	private V vVariable;
	private K kVariable;
	public Task6(T tVariable,V vVariable,K kVariable) {
		super();
		this.kVariable=kVariable;
		this.tVariable=tVariable;
		this.vVariable=vVariable;
		
	}
	public void printTVariable() {
		System.out.println(tVariable.getClass());
	}
	public void printVVariable() {
		System.out.println(vVariable.getClass());
	}
	public void printKVariable() {
		System.out.println(kVariable.getClass());
	}
	public T gettVariable() {
		return tVariable;
	}

	public void settVariable(T tVariable) {
		this.tVariable = tVariable;
	}

	public V getvVariable() {
		return vVariable;
	}

	public void setvVariable(V vVariable) {
		this.vVariable = vVariable;
	}

	public K getkVariable() {
		return kVariable;
	}

	public void setkVariable(K kVariable) {
		this.kVariable = kVariable;
	}

}
