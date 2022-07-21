package by.academy.homework3;

import java.util.Scanner;

public class User extends Regex {
	private String name;
	private double money;
	private String dateOfBirth;
	private String phone;
	private String email;
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

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhone() {
		return phone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
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
		System.out.println("Buyer name: " + getName());
		System.out.println("Buyer money: " + getMoney());
		System.out.println("Buyer date of birth: " + getDateOfBirth());
		System.out.println("Buyer phone number: " + getPhone());
		System.out.println("Buyer email: " + getEmail());
	}

	public void outputUserSeller() {
		System.out.println("Seller name: " + getName());
		System.out.println("Seller money: " + getMoney());

	}

}
