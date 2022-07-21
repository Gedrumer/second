package by.academy.classworks.classwork12;

//9.	Написать класс Калькулятор (необобщенный), 
//который содержит обобщенные статические методы - sum, multiply, divide, subtraction. 
//Параметры этих методов  - два числа разного типа, над которыми должна быть произведена операция.
public class Calculator {

	public static <T extends Number, V extends Number> double sum(T t, V v) {
		double sum = v.doubleValue() + t.doubleValue();
		return sum;

	}

	public static <T extends Number, V extends Number> double multiply(T t, V v) {
		double multiply = v.doubleValue() * t.doubleValue();
		return multiply;

	}

	public static <T extends Number, V extends Number> double divide(T t, V v) {
		double divide = v.doubleValue() / t.doubleValue();
		return divide;
	}

	public static <T extends Number, V extends Number> double subtraction(T t, V v) {
		double subtraction = v.doubleValue() - t.doubleValue();
		return subtraction;
	}

}
