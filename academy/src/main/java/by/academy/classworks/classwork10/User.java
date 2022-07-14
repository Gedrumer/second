package by.academy.classworks.classwork10;


import java.util.Scanner;
public class User {
	private String name;
	private double money;
	Scanner scan = new Scanner(System.in);

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public double getMoney() {
		return money;
	}

	public void inputUserBuyer() {
		System.out.println("Enter buyer name: ");
		String buyerName = scan.nextLine();
		System.out.println("Enter buyer money: ");
		String buyerMoney = scan.nextLine();
		setName(buyerName);
		setMoney(Double.valueOf(buyerMoney));

	}

	public void inputUserSeller() {
		System.out.println("Enter seller name: ");
		String sellerName = scan.nextLine();
		System.out.println("Enter seller money: ");
		String sellerMoney = scan.nextLine();
		setName(sellerName);
		setMoney(Double.valueOf(sellerMoney));
	}

	public void outputUserBuyer() {
		System.out.println(getName());
		System.out.println(getMoney());

	}

	public void outputUserSeller() {
		System.out.println(getName());
		System.out.println(getMoney());

	}

}
