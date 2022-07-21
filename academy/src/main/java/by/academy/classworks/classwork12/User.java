package by.academy.classworks.classwork12;
//1. —оздать класс User,содержащий private переменные login,password.
//—оздать внутренний класс Query в классе User. ласс Query содержит метод printToLog(),который распечатывает на 
//консоль сообщение о том что пользователь с таким то логином и паролем sent request.
// ласс User,содержит метод createQuery(),в котором создаетс€ объект класса Query и вызываетс€ метод printToLog().
//¬ методе main():создать экземпл€р класса User и вызвать метод createQuery();создать экземпл€р класса Query и
//вызвать метод printToLog()использу€ конструкцию user.new Query();
//создать экземпл€р класса Query и вызвать метод printToLog()использу€ конструкцию new User().new Query();
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
