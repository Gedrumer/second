package by.academy.finaltest.task1;

public class Task1 {
	static int countCompression(String str) {
		char last = str.charAt(0);
		int size = 0;
		int count = 1;
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == last) {
				count++;
			} else {
				last = str.charAt(i);
				size += 1 + String.valueOf(count).length();
				count = 0;
			}
		}
		size += 1 + String.valueOf(count).length();
		return size;
	}

	static String compress(String str) {
		int size = countCompression(str);
		if (size >= str.length()) {
			return str;
		}

		StringBuffer buff = new StringBuffer();
		char last = str.charAt(0);
		int count = 1;
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == last) {
				count++;
			} else {
				buff.append(last);
				buff.append(count);
				last = str.charAt(i);
				count = 1;
			}
		}
		buff.append(last);
		buff.append(count);
		return buff.toString();
	}

	public static void main(String[] args) {
		System.out.println(compress("aaabbbcccaaa"));

	}

}
