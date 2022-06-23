package by.academy.lesson5;

public class Task3 {

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		StringBuilder builder1 = new StringBuilder();
		StringBuilder builder2 = new StringBuilder();
		builder.append("3+56=59");
		builder1.append("3-56=-53");
		builder2.append("3*56=168");
		System.out.println(builder);
		System.out.println(builder1);
		System.out.println(builder2);
		builder.deleteCharAt(4);
		builder.insert(4,"равно");
		System.out.println(builder);
		builder1.replace(4, 5,"равно");
		System.out.println(builder1);
	}
	

}
