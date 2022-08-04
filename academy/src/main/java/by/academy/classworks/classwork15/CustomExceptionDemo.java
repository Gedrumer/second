package by.academy.classworks.classwork15;

public class CustomExceptionDemo {
	public static void main(String[] args) {
	try {
		compute(1);
		compute(20);
	}catch(CustomException e) {
		System.out.println("Catch Exception:"+e);
	}
	}

	private static void compute(int i) throws CustomException {
		throw new CustomException(2,"EXCEPTION");
		
	}
	

}
