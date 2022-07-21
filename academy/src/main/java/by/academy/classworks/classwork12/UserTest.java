package by.academy.classworks.classwork12;
//¬ методе main():создать экземпл€р класса User и вызвать метод createQuery();создать экземпл€р класса Query и
//вызвать метод printToLog()использу€ конструкцию user.new Query();
//создать экземпл€р класса Query и вызвать метод printToLog()использу€ конструкцию new User().new Query();
public class UserTest {

	public static void main(String[] args) {
		User user= new User("Peter","987654");
		user.createQuery();
		User.Query query=user.new Query();
		query.printToLog();
		User.Query query1=new User().new Query();//regular inner class 
		query1.printToLog();
		User.Nick nick=new User().new Nick();//local class 
		nick.printNick();
	}

}
