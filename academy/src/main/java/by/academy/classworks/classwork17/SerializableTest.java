package by.academy.classworks.classwork17;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File dirs = new File("src/io");
		if (!dirs.exists()) {
			dirs.mkdirs();
		}
		File file = new File(dirs, "Product1.txt");
		if (!file.exists()) {
			file.createNewFile();
		}
		Product product = new Product("Wine", 20.5, 5);
		try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file));
				ObjectOutputStream oos = new ObjectOutputStream(bos)) {
			product.setQuantity(50);
			oos.writeObject("test");
			oos.writeInt(6);
			oos.writeDouble(50.5);
			oos.writeObject(product);

		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
		try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
				ObjectInputStream ois = new ObjectInputStream(bis)) {
			String str = (String) ois.readObject();
			Integer i = ois.readInt();
			Double d = ois.readDouble();
			Product p = (Product) ois.readObject();
			System.out.println(str);
			System.out.println(i);
			System.out.println(d);
			System.out.println(p);

		} catch (IOException | ClassNotFoundException ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}

	}

}
