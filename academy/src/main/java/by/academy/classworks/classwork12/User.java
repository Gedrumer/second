package by.academy.classworks.classwork12;
//1. ������� ����� User,���������� private ���������� login,password.
//������� ���������� ����� Query � ������ User.����� Query �������� ����� printToLog(),������� ������������� �� 
//������� ��������� � ��� ��� ������������ � ����� �� ������� � ������� sent request.
//����� User,�������� ����� createQuery(),� ������� ��������� ������ ������ Query � ���������� ����� printToLog().
//� ������ main():������� ��������� ������ User � ������� ����� createQuery();������� ��������� ������ Query �
//������� ����� printToLog()��������� ����������� user.new Query();
//������� ��������� ������ Query � ������� ����� printToLog()��������� ����������� new User().new Query();
public class User {
	private String login="Ivan";
	private String password="123456789asd";
	final String nick="IV";
	 public class Query{
		 public void printToLog() {
			 System.out.println("User with login:"+login+" and password:"+password+". Sent request. ");
		 }
	 }
		class Nick {
			public void printNick() {
				System.out.println("Nickname is: " + nick);
			}
		}
		public void createNick() {
			Nick nick=new Nick();
			nick.printNick();
		}
		
	
	 public void  createQuery() {
		 Query query=new Query();
		 query.printToLog();
	 }
	 public User() {
		 super();
	 }
	 public User(String login,String password) {
		 super();
		 this.login=login;
		 this.password=password;
	 }
	
}
