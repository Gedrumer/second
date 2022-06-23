package by.academy.lesson5;

public class Task1 {

	public static void main(String[] args) {
		int index = -1;
		String s = "ƒл€ работы со строками в €зыке Java используютс€ классы String, StringBuilder, StringBuffer.";
		// System.out.println("IndexOf: "+s.indexOf('S'));

		do {
			index = s.indexOf('S', index == -1 ? 0 : index + 1);
			if (index != -1) {
				System.out.println(index);
			}
		} while (index != -1);
	}

}
