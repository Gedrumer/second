package by.academy.classworks.classwork12;
//5.	������� ��������� Cookable, ���������� ����� void cook(String str). 
//������� ����� Food, ���������� ����� public void prepare(Cookable c, String str) { c.cook(str);} 
//������� ��������� ������ Food � ������� ��� ����� prepare(). 
//�� ���� ������ prepare() �������� ��������� ���������� ������, ������������ ��������� Cookable. 
public interface Cookable {
	public void cook(String str);

}
