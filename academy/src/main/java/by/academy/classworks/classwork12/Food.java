package by.academy.classworks.classwork12;
//Ќа вход метода prepare() передать экземпл€р анонимного класса, расшир€ющего интерфейс Cookable. 
public class Food {
	public void prepare(Cookable c, String str) {
		c.cook(str);
	}

	public static void main(String[] args) {
		Food food=new Food();
	}
}
