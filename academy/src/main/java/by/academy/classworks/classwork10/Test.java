package by.academy.classworks.classwork10;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test {

	public static void main(String[] args) {
		LocalDateTime time = LocalDateTime.now();

		System.out.println(time.getYear() + "/" + time.getMonthValue() + "/" + time.getDayOfMonth() + " time: "
				+ time.getHour() + ":" + time.getMinute() + ":" + time.getSecond());
		DateTimeFormatter form=DateTimeFormatter.ofPattern("yyyy, MM, dd HH:mm:ss");
		System.out.println(time.format(form));
//		Printable[] arr=new Printable[5];
//		arr[0]=new Book("M");
//		arr[1]=new Magazine("S");
//		arr[2]=new Book("T");
//		arr[3]=new Magazine("R");
//		arr[4]=new Book("Y");
//		for(var e:arr) {
//			e.print();
//		}
//		Magazine.printMagazines(arr);
	}

}
