package by.academy.classworks.classwork12;
//5.	—оздать интерфейс Cookable, содержащий метод void cook(String str). 
//—оздать класс Food, содержащий метод public void prepare(Cookable c, String str) { c.cook(str);} 
//—оздать экземпл€р класса Food и вызвать его метод prepare(). 
//Ќа вход метода prepare() передать экземпл€р анонимного класса, расшир€ющего интерфейс Cookable. 
public interface Cookable {
	public void cook(String str);

}
