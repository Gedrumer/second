package by.academy.classworks.classwork17;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableTest2 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File dirs = new File("src/io");
		if (!dirs.exists()) {
			dirs.mkdirs();
		}
		File file = new File(dirs, "Product2.txt");
		if (!file.exists()) {
			file.createNewFile();
		}
		Product product = new Product("Wine", 20.5, 5);
		try (FileOutputStream fos = new FileOutputStream(file); ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(product);

		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
		try (FileInputStream fis = new FileInputStream(file); ObjectInputStream ois = new ObjectInputStream(fis)) {
			Product p = (Product) ois.readObject();
			System.out.println(p);

		} catch (IOException | ClassNotFoundException ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}

	}
 
}
