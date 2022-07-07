package by.academy.deal;

public class Main {

	public static void main(String[] args) {
		Product prod=new Product();
		Cheese ch=new Cheese();
		prod.setQuantity(20);
		System.out.println(prod.discount());
		ch.setRichness(10);
		System.out.println(ch.discount());
	}

}
