package examples2;

import java.util.ArrayList;
import java.util.Collections;

import objects.Address;
import objects.Student;

public class StudentManager_imple implements StudentManager {

	@Override
	public Student[] addStudent(Student[] List, Student p) {
		ArrayList<Student> tmp = new ArrayList<Student>(List.length);
		Collections.addAll(tmp, List);
		tmp.add(p);
		List = tmp.toArray(List);
		return List;
	}

	@Override
	public Student[] editStudent(Student[] List, Student p) {
		// TODO Auto-generated method stub
		ArrayList<Student> tmp = new ArrayList<Student>(List.length);
		Collections.addAll(tmp, List);
		int i = tmp.indexOf(p);
		tmp.add(i,p);	
		List = tmp.toArray(List);
		return List;
	}

	@Override
	public Student[] delStudent(Student[] List, Student p) {
		// TODO Auto-generated method stub
		ArrayList<Student> tmp = new ArrayList<Student>(List.length);
		Collections.addAll(tmp, List);
		tmp.remove(p);
		tmp.trimToSize();
		List = tmp.toArray(List);
		
		return List;
	}

	@Override
	public ArrayList<Student> SearchStudent(Student[] List, String name) {
		// TODO Auto-generated method stub
		ArrayList<Student> tmp = new ArrayList<Student>(List.length);
		for(int i=0; i<List.length; i++) {
			if(List[i].getFirstName().equals(name))
				tmp.add(List[i]);
		}
		return tmp;	
	}

	@Override
	public ArrayList<Student> SearchStudent(Student[] List, Address addr) {
		ArrayList<Student> tmp = new ArrayList<Student>(List.length);
		for(int i=0; i<List.length; i++) {
			if(List[i].getAddress().equals(addr))
				tmp.add(List[i]);
		}
		// TODO Auto-generated method stub
		return tmp;
	}
	public static void main(String[] args) {
		
	}

}
