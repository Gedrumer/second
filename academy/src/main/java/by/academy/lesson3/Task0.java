package by.academy.lesson3;

import java.util.Scanner;

public class Task0 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������� �����:");
		String str=sc.next();
		str=str.toLowerCase();
		switch (str) {
		case "������":
			System.out.println("������ �����");
			break;
		case "�������":
			System.out.println("������ �����");
			break;
		case "����":
			System.out.println("������ �����");
			break;
		case "������":
			System.out.println("��������� �����");
			break;
		case "���":
			System.out.println("����� �����");
			break;
		case "����":
			System.out.println("������ �����");
			break;
			default:
				System.out.println("��� �� �����");
		}
		
		
		sc.close();

	}

}
