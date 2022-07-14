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
	int newLength=(int) (prod.length==0?1:prod.length*1.5);//����������� ����� ������
	Product[] newProd=new Product[newLength];//�������������� ����� ������
	System.arraycopy(prod, 0, newProd, 0, prod.length);//�������� ��� �������� �� ������� ������� � �����
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
	}//���������� �� �������

	public void removeProduct() {
		
	}//���� ���� - ������ �� �������,���� ������ ��� ����� ������� -����� �� �������,���� ������ ������������ ����� ������� ����� 1 == productsrize-1=null;size--
}//System.arraycopy(prod, index, newProd, index-1, prod.length);
