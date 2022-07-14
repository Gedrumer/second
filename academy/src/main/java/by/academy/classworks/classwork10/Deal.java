package by.academy.classworks.classwork10;

import java.time.LocalDate;

public class Deal {

	private LocalDate today = LocalDate.now();
	private User buyer;
	private User seller;
	private Product[] prod;
	private int index = 0;

	public Deal() {
		super();
		this.prod = new Product[10];
	}

	public Deal(User seller, User buyer, Product[] prod) {
		super();
		getDate();
		this.seller = seller;
		this.buyer = buyer;
		this.prod = prod;
		this.index = prod.length;
	}

	public User getSeller() {
		return seller;
	}

	public User getBuyer() {
		return buyer;
	}

	public Product[] getProducts() {
		return prod;
	}

	public void cheque() {
		System.out.println("Time now: " + getDate());
	}

	public LocalDate getDate() {
		return today;
	}

	public double getSum() {
		double s = 0;
		for (Product p : prod) {
			s += p.getProductPrice();
		}
		return s;
	}
	private void grow() {
	int newLength=(int) (prod.length==0?1:prod.length*1.5);//увеличивает новый массив
	Product[] newProd=new Product[newLength];//инициалищирует новый массив
	System.arraycopy(prod, 0, newProd, 0, prod.length);//копирует все элементы из старого массива в новый
	prod=newProd;
	}
	public void addProduct(Product prods) {
		if (index == prod.length) {
			grow();
		}
		prod[index++] = prods;
		
	}

	public Product getProduct(int productIndex) {
		return prod[productIndex];
	}//ограничить по размеру

	public void removeProduct() {
		
	}//если нуля - вышели за пределы,если больше или равен размеры -вышел за пределы,если индекс пользователя равен размеру минус 1 == productsrize-1=null;size--
}//System.arraycopy(prod, index, newProd, index-1, prod.length);
