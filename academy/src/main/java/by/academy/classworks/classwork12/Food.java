package by.academy.classworks.classwork12;
//�� ���� ������ prepare() �������� ��������� ���������� ������, ������������ ��������� Cookable. 
public class Food {
	public void prepare(Cookable c, String str) {
		c.cook(str);
	}

	public static void main(String[] args) {
		Food food=new Food();
		food.prepare(class Cook implements Cookable{

			@Override
			public void cook(String str) {
				// TODO Auto-generated method stub
				
			}
			
		}; "Hello");
	}
}
