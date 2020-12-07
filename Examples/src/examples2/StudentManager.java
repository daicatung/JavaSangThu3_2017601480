package examples2;

import java.util.ArrayList;

import objects.Address;
import objects.Student;

public interface StudentManager {
	public Student[] addStudent(Student[] List, Student p);
	public Student[] editStudent(Student[] List, Student p);
	public Student[] delStudent(Student[] List, Student p);
	public ArrayList<Student> SearchStudent(Student[] List, String name);
	public ArrayList<Student> SearchStudent(Student[] List, Address addr);
}
