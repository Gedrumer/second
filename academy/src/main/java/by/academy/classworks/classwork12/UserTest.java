package by.academy.classworks.classwork12;
//� ������ main():������� ��������� ������ User � ������� ����� createQuery();������� ��������� ������ Query �
//������� ����� printToLog()��������� ����������� user.new Query();
//������� ��������� ������ Query � ������� ����� printToLog()��������� ����������� new User().new Query();
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
