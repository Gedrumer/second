package by.academy.classworks.classwork15;

import java.util.HashSet;
import java.util.List;

//�������� ������ union(Set<?>... set) � intersect(Set<?> ... set), 
//����������� �������� ����������� � ����������� ��������.
// ������������� ������ ���� ������� �� �������������� ����������� ����������.
public class Sets {
	public static void main(String[] args) {
		List<String> list1=List.of("a","b","c","d");
		List<String> list2=List.of("d","e","f","c");
		HashSet<String> union=new HashSet<String>(list1);//hashset with list1 elem.
		union.addAll(list2);//add list2 in list1 without dublicate
		for(String s:union) {
			System.out.println(s);
		}
		HashSet<String> intersect=new HashSet<String>(list2);
		intersect.retainAll(list1);//list1 reference of list2 
		System.out.println("-------------");
		for(String s:intersect) {
			System.out.println(s);
		}
	}

}
