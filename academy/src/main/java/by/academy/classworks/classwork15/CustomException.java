package by.academy.classworks.classwork15;

public class CustomException extends Exception {

	private static final long serialVersionUID = 1L;
	private int detail;
	public CustomException(int detail,String message) {
		super(message);
		this.detail=detail;
	}
	@Override
	public String toString() {
		return "CustomException [detail=" + detail + "]"+" {message:"+getMessage()+"}";
	}
	

}
