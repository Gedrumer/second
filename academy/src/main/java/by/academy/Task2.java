package by.academy;

public class Task2 {

	public static void main(String[] args) {
		int s = 370000;
		int sec;
		int m;
		int min;
		int h;
		float d;
		float w;
		sec = s % 60;
		m = (s - sec) / 60;
		min = m % 60;
		h = (m - min) / 60;
		d=h/24;
		w=d/7;
		System.out.println(w+" недель "+d+" дней "+h+" часов "+m+" минут "+s+"секунд");
		System.out.println(d);
	}

}
