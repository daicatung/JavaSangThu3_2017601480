package examples2;

import java.io.File;
import java.util.ArrayList;

import objects.Student;

public interface StudentManagerFile {
	public ArrayList<Student> addStudent(ArrayList<Student> p, File f);
	public ArrayList<Student> editStudent(ArrayList<Student> p, File f);
	public ArrayList<Student> delStudent(ArrayList<Student> p, File f);
}
