package by.academy.classworks.classwork12;

public class UserStatic {
	static String login = "Ivan";
	static String password = "123456789asd";
	final String nick = "IV";

	public static class Query {
		public void printToLog() {
			System.out.println("User with login:" + login + " and password:" + password + ". Sent request. ");
		}
	}

	public static void main(String[] args) {
		UserStatic.Query query = new UserStatic.Query();
		query.printToLog();
	}

}
