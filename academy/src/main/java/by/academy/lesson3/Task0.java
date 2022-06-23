package by.academy.lesson3;

import java.util.Scanner;

public class Task0 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите мес€ц:");
		String str=sc.next();
		str=str.toLowerCase();
		switch (str) {
		case "€нварь":
			System.out.println("ѕервый мес€ц");
			break;
		case "февраль":
			System.out.println("¬торой мес€ц");
			break;
		case "март":
			System.out.println("“ретий мес€ц");
			break;
		case "апрель":
			System.out.println("„етвертый мес€ц");
			break;
		case "май":
			System.out.println("ѕ€тый мес€ц");
			break;
		case "июнь":
			System.out.println("Ўестой мес€ц");
			break;
			default:
				System.out.println("Ёто не мес€ц");
		}
		
		
		sc.close();

	}

}
