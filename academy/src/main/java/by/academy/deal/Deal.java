package by.academy.deal;

public class Deal {
	// user seller, user buyer, product[], LocalDateTime
	// methods: 1)full price 2)deal
	String[] productname;
	String LocalDateTime;

	public void setProductName(String productname) {
		this.productname = productname.split(" ");

	}

	public String[] getProductName() {
		return productname;
	}
	public int deal(User seller,User buyer) {
		
				
		return 0;
		
		
	}
	public int fullPrice(Product price,Product product,Product quantity,Product isTax) {
		int fullPrice = 0;
		
		return fullPrice;
		
	}

}
