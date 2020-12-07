package objects;
import java.util.*;
public interface CTT extends CTX, TPGD, GPS{
	public ArrayList<Person> countPerson();
	public ArrayList<Person> countPerson(Person[] list);
	public ArrayList<Person> countPerson(Person similar);
	public ArrayList<Person> countPerson(Address address);
	public ArrayList<Person> countPerson(byte age);
}
