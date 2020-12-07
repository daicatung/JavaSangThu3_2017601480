package process;
import objects.*;

import java.util.Comparator;

public class ByName implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
		// TODO Auto-generated method stub
		if(p1.getage() > p2.getage() && p1.getFirstName().equals(p2.getFirstName()))
			return p1.getFirstName().compareToIgnoreCase(p2.getFirstName());
		return 0;
	}

}
