package process;
import java.util.*;
import objects.*;;
public class MyCollections {

	public static ArrayList<Person> sortByAge(Person[] list){
		
		//chuyen mang tinh sang tap hop
		
		ArrayList<Person> tmp = new ArrayList<Person>(list.length);
		Collections.addAll(tmp, list);
		
		//sap xep theo tuoi
		
		Collections.sort(tmp);		
		return tmp;		
	}
	
	public static ArrayList<Person> sortByName(Person[] list){
		
		//chuyen mang tinh sang tap hop
		
		ArrayList<Person> tmp = new ArrayList<Person>(list.length);
		Collections.addAll(tmp, list);	
		//sap xep theo ten		
		Collections.sort(tmp, new ByName1());
		Collections.sort(tmp, new ByName());
		return tmp;
		
	}
	public static void main(String[] args) {
		
		//Sinh danh sach
		Person[] list = new Person[10];
		list = MyArrrays.generatePerson(10);
		ArrayList<Person> tmp = new ArrayList<Person>();
		tmp = MyCollections.sortByName(list);
		System.out.println(tmp + "\n");
		MyArrrays.PrintPerson(tmp);
	}

}
class ByName1 implements Comparator<Person>{

	@Override
	public int compare(Person p1, Person p2) {
		// TODO Auto-generated method stub
		return p1.getFirstName().compareToIgnoreCase(p2.getFirstName());	
		}
	
}