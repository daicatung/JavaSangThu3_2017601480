package examples2;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

import objects.Address;
import objects.Student;

public class ProcessStudent {

	public static void main(String[] args) {
		System.out.println("Cau 2,ý a ------------------------------------------");
		Student[] List = new Student[0];
		StudentManager_imple a = new StudentManager_imple();
				
		Address addr = new Address("a", "b", "c");
		Student p = new Student("Tung", "Vu Viet", (byte)21, addr, "2017601480", "CNTT");
		Student q = new Student("Tung1", "Vu Viet", (byte)21, addr, "2017601480", "CNTT");
		
		List = a.addStudent(List, p);
		List = a.addStudent(List, q);
		System.out.println("Mang Student Sau khi them Student p vào:");
		for(Student x:List)
			System.out.println(x);
		
		System.out.println("\nMang Student Sau khi edit Student p vào:");
		List = a.editStudent(List, q);
		for(Student x:List)
			System.out.println(x);
		
		System.out.println("\nMang Student Sau khi xoa Student h di:");
		//List = a.delStudent(List, p);
		for(Student x:List)
			System.out.println(x);	
		
		String name = "Tung1";
		System.out.println("\nKet qua tim kiem theo ten " + name);
		ArrayList<Student> List2 = new ArrayList<Student>();
		List2 = a.SearchStudent(List, name);
		for(Student x:List2)
			System.out.println(x);	
		
		System.out.println("\nKet qua tim kiem theo dia chi " + addr);
		ArrayList<Student> List3 = new ArrayList<Student>();
		List3 = a.SearchStudent(List, addr);
		for(Student x:List3)
			System.out.println(x);
		
		System.out.println("\nCau 2,ý b ------------------------------------------");
		System.out.println("Mang Student ban dau:");
		ArrayList<Student> Cau2b = new ArrayList<Student>(List.length);
		Collections.addAll(Cau2b, List);
		for(Student x:Cau2b)
			System.out.println(x);
		StudentManagerFile_imple b = new StudentManagerFile_imple();
		File f = new File("example2.txt");
		b.addStudent(Cau2b, f);
		System.out.println("Mang Student sau khi them student tu file f:");
		for(Student x:Cau2b)
			System.out.println(x);
		b.editStudent(Cau2b, f);
		System.out.println("Mang Student sau khi edit student tu file f:");
		for(Student x:Cau2b)
			System.out.println(x);
		b.delStudent(Cau2b, f);
		System.out.println("Mang Student sau khi xoa student tu file f:");
		for(Student x:Cau2b)
			System.out.println(x);
		
	}
}
