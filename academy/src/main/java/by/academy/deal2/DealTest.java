package by.academy.homework3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class DealTest {

	public static void main(String[] args) {
		Product[] shoppingCart = new Product[20];
		Scanner scan = new Scanner(System.in);
		EmailValidator email = new EmailValidator();
		Regex reg = new Regex();
		BelarusPhoneValidator valid = new BelarusPhoneValidator();
		User seller = new User();
		User buyer = new User();
		Product[] productList = new Product[9];
		Cheese cheese1 = new Cheese("Russian Cheese", 10.62, 20, 50.2);
		Cheese cheese2 = new Cheese("Mozzarella Cheese", 14.25, 20, 17);
		Cheese cheese3 = new Cheese("Parmesan Cheese", 25.99, 20, 29);
		Wine wine1 = new Wine("Wine Cabernet Sauvignon", 16.53, 20, "Red", 5);
		Wine wine2 = new Wine("Wine Pinot Noir", 18.89, 20, "Red", 6);
		Wine wine3 = new Wine("Wine Bosio Gavi", 20.35, 20, "White", 8);
		Bread bread1 = new Bread("Bread Ciabatta", 2.44, 20, "White");
		Bread bread2 = new Bread("Bread Toast bread", 1.86, 20, "Grey");
		Bread bread3 = new Bread("Bread Borodino bread", 2.06, 20, "Black");
		productList[0] = cheese1;
		productList[1] = cheese2;
		productList[2] = cheese3;
		productList[3] = wine1;
		productList[4] = wine2;
		productList[5] = wine3;
		productList[6] = bread1;
		productList[7] = bread2;
		productList[8] = bread3;
		buyer.inputUserBuyer();
		seller.inputUserSeller();
		while (true) {
			System.out.println("Enter phone:");
			String phone = scan.nextLine();
			if (valid.validate(phone) == true) {
				buyer.setPhone(phone);
				break;
			} else {
				System.out.println("Phone entered incorrectly.");
			}
		}
		while (true) {
			System.out.println("Enter date of birth: ");
			String dateOfBirth = scan.nextLine();
			if (reg.verificationA(dateOfBirth) == true ) {
				DateTimeFormatter formatterDTa=DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.US);
				LocalDate time=LocalDate.parse(dateOfBirth, formatterDTa);	
				System.out.println("Day:"+time.getDayOfMonth());
				System.out.println("Month:"+time.getMonth());
				System.out.println("Year:"+time.getYear());
				buyer.setDateOfBirth(dateOfBirth);
				break;
			} 
			if(reg.verificationB(dateOfBirth) == true) {
				DateTimeFormatter formatterDTa=DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.US);
				LocalDate time=LocalDate.parse(dateOfBirth, formatterDTa);	
				System.out.println("Day:"+time.getDayOfMonth());
				System.out.println("Month:"+time.getMonth());
				System.out.println("Year:"+time.getYear());
				buyer.setDateOfBirth(dateOfBirth);
				break;
			}
			else {
				System.out.println("Date entered incorrectly.");
			}
		}
		while (true) {
			System.out.println("Enter email: ");
			String mail = scan.nextLine();
			if (email.validate(mail) == true) {
				buyer.setEmail(mail);
				break;
			} else {
				System.out.println("Email entered incorrectly.");
			}
		}
		Deal deal = new Deal(seller, buyer, shoppingCart);
		int index = 0;
		while (true) {

			for (int i = 0; i < productList.length; i++) {
				System.out.println("Grocery list:");
				System.out.println(
						i + 1 + ":" + productList[i].getTitle() + "\n----price: " + productList[i].getPrice() + "$");
			}
			System.out.println("Select a product from the list by its number.");
			System.out.println("Enter 0 if you want to see shopping cart and complete the selection.");
			int answ = scan.nextInt();
			if (answ > 0) {
				System.out.println("Enter quantity:");
				double quant = scan.nextDouble();
				productList[answ - 1].setQuantity(quant);
				shoppingCart[index] = productList[answ - 1];
				index++;
			}

			if (answ == 0) {
				System.out.println("Your shopping cart:");
				for (int i = 0; i < index; i++) {
					System.out.println(shoppingCart[i].getTitle() + "\nQuantity:" + shoppingCart[i].getQuantity()
							+ ". Unit price:" + shoppingCart[i].getPrice());

				}
				break;
			}

		}
		while (true) {
			System.out.println("Do you want to remove an item from your shopping cart? \n1:Yes/2:No");
			int answ2 = scan.nextInt();
			if (answ2 == 1) {
				for (int i = 0; i < index; i++) {
					System.out.println((i + 1) + ":" + deal.getProduct(i).getTitle());
				}
				index--;
				System.out.println("Enter the number of the product you want to delete:");
				int answ3 = scan.nextInt();
				deal.removeProduct(answ3);
			}
			if (answ2 == 2) {

				break;
			}
		}
		deal.doDeal();
		deal.cheque();
		System.out.println(deal.toString());
		scan.close();
	}
}
