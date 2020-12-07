package examples2;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

import objects.Student;

public class StudentManagerFile_imple implements StudentManagerFile {

	@Override
	public ArrayList<Student> addStudent(ArrayList<Student> p, File f) {
		try {
			FileReader InFileReader = new FileReader(f);
			BufferedReader in = new BufferedReader(InFileReader);
			Student tmp = new Student();
			String fname, lname;
			String ctName, dsName, sName;  
			String strage, spec;
			int age;
			String id;
			fname = in.readLine();
			lname = in.readLine();
			strage = in.readLine();
			age = Integer.parseInt(strage);
			ctName = in.readLine();
			dsName = in.readLine();
			sName  = in.readLine();
			id = in.readLine();
			spec = in.readLine();
			tmp.setFirstName(fname).setLastName(lname).setAge((byte)age).setAddress(ctName, dsName, sName);
			tmp.setId(id);
			tmp.setSpecialy(spec);
			p.add(tmp);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return p;
	}

	@Override
	public ArrayList<Student> editStudent(ArrayList<Student> p, File f) {
		try {
			FileReader InFileReader = new FileReader(f);
			BufferedReader in = new BufferedReader(InFileReader);
			Student tmp = new Student();
			String fname, lname;
			String ctName, dsName, sName;  
			String strage, spec;
			int age;
			String id;
			fname = in.readLine();
			lname = in.readLine();
			strage = in.readLine();
			age = Integer.parseInt(strage);
			ctName = in.readLine();
			dsName = in.readLine();
			sName  = in.readLine();
			id = in.readLine();
			spec = in.readLine();
			tmp.setFirstName(fname).setLastName(lname).setAge((byte)age).setAddress(ctName, dsName, sName);
			tmp.setId(id);
			tmp.setSpecialy(spec);
			Student [] tmp1 = new Student[p.size()];
			tmp1 = p.toArray(tmp1);
			int index1 = 0;
			for(int i = 0; i<p.size(); i++) {
				if(tmp1[i].getFirstName().equals(tmp.getFirstName())) {
					index1 = i;
					break;
				}
			}
			Collections.addAll(p, tmp);
			p.add(index1, tmp);
			p.trimToSize();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return p;
	}

	@Override
	public ArrayList<Student> delStudent(ArrayList<Student> p, File f) {
		try {
			FileReader InFileReader = new FileReader(f);
			BufferedReader in = new BufferedReader(InFileReader);
			Student tmp = new Student();
			String fname, lname;
			String ctName, dsName, sName;  
			String strage, spec;
			int age;
			String id;
			fname = in.readLine();
			lname = in.readLine();
			strage = in.readLine();
			age = Integer.parseInt(strage);
			ctName = in.readLine();
			dsName = in.readLine();
			sName  = in.readLine();
			id = in.readLine();
			spec = in.readLine();
			tmp.setFirstName(fname).setLastName(lname).setAge((byte)age).setAddress(ctName, dsName, sName);
			tmp.setId(id);
			tmp.setSpecialy(spec);
			Student [] tmp1 = new Student[p.size()];
			tmp1 = p.toArray(tmp1);
			int index1 = 0;
			for(int i = 0; i<p.size(); i++) {
				if(tmp1[i].getFirstName().equals(tmp.getFirstName())) {
					index1 = i;
					break;
				}
			}
			Collections.addAll(p, tmp);
			p.remove(index1);
			p.trimToSize();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return p;
	}

}
