package task1;
//1.	������� ����������� ����� ������� ��������� �� ���� ��� ���������: login, password � confirmPassword.  
//���� login �� ������������� ���� �����������, ���������� ��������� WrongLoginException. 
//Password ������ ��������� ������ ��������� �����, ����� � ���� �������������. 
//����� password ������ ���� ������ 20 ��������. ����� password � confirmPassword ������ ���� �����.
//���� password �� ������������� ���� �����������, ���������� ��������� WrongPasswordException.  
//WrongPasswordException � WrongLoginException - ���������������� ������ ���������� � ����� �������������� � ���� ��
//���������, ������ ��������� ��������� ���������� � �������� ��� � ����������� ������ Exception. 
//��������� ���������� ���������� ������ ������. ���������� multi-catch block. ����� ���������� true, ���� �������� �����
//��� false � ������ ������. (������� � �����)
public class Task1Demo {
	public static boolean checkData(String login, String password,String confirmPassword) throws WrongLoginException, WrongPasswordException{
		if(login==null) {
			throw new WrongLoginException("Login null");
		}
		if(!login.matches("[a-zA-Z0-9_]{1,20}")) {
			throw new WrongLoginException("Login didn't validate");
			
		}
		if(password==null) {
			throw new WrongPasswordException("Password null");
		}
		if(!password.matches("[a-zA-Z0-9_]{1,20}")) {
			throw new WrongPasswordException("Password didn't validate");
		}
		return true;
	}

	public static void main(String[] args) {
			boolean isValid=validate("login","qwerty","qwerty");
			System.out.println(isValid);

	}
	public static boolean validate(String login, String password,String confirmPassword) {
		try {
			checkData("+++","qwerty","qwerty");
		} catch (WrongLoginException | WrongPasswordException e) {
			System.out.println(e.getMessage());
			return false;
		}
		return true;
		
	}

}
