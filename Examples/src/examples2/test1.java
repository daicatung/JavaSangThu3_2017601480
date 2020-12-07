package examples2;
import process.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import objects.Person;
public class test1 {
	// n la so luong sinh vien duoc sinh ra ngau nhien
	public static int n;
	
	//Ham sortByName de sap xep danh sach ten theo anpha va neu ten giong nhau
	//thi sap xep theo tuoi
	public static ArrayList<Person> sortByName(Person[] list){		
		//chuyen mang tinh sang tap hop
		ArrayList<Person> tmp = new ArrayList<Person>(list.length);
		Collections.addAll(tmp, list);	
		//sap xep theo ten		
		Collections.sort(tmp, new ByName1());
		Collections.sort(tmp, new ByName());
		return tmp;
		
	}
	// Sinh Ngau nhien 1 danh sach sinh vien va luu vao file ABCD.txt
	// Luu dinh danh file theo cach van ban
	public static void textOutputFile() throws IOException{
		FileWriter OutFileWriter = new FileWriter("ABCD.txt");
		PrintWriter out = new PrintWriter(OutFileWriter);	
		// n la so luong random cua sinh vien nam trong khoang 30-50
		do {
			n = (int)(Math.random()*100);
		}while(n<=30 || n>=50);
		
		out.println("STT\t\t" + "Ho Ten \t\t\t" + " Tuoi");
		Person[] list = new Person[n];
		list = MyArrrays.generatePerson(n);
		ArrayList<Person> tmp = new ArrayList<Person>();
		tmp = MyCollections.sortByName(list);
		int i=0;
		for(Person x:tmp) {
			out.println(i + "\t" + x);
			i++;
		}		
		//out.println();
		out.print("Tong So Sinh Vien:" + n+ "(danh sach bat dau tu 0)");
		out.close();
	}
	//Doc danh sach SinhVien Tu file ABCD.txt ra man hinh
	//Theo dinh dang van ban
	public static void textInputFile() throws IOException{
		FileReader InFileReader = new FileReader("ABCD.txt");
		BufferedReader in = new BufferedReader(InFileReader);
		String tmpStr;
		for(int i=0; i<=n+1; i++) {
			tmpStr = in.readLine();
			System.out.println(tmpStr);
		}
		in.close();
	}
	
	// Sinh Ngau nhien 1 danh sach sinh vien va luu vao file abcd.bin
	// Luu dinh danh file theo cach nhi phan
	public static void binaryOutPutFile() throws Exception{	
		FileOutputStream outfile  = new FileOutputStream("abcd.bin");
		DataOutputStream out = new DataOutputStream(outfile);
		out.writeInt(2); // so luong ban ghi tro giúp doc
		for(int i=0; i<2; i++) {
			do {
				n = (int)(Math.random()*100);
			}while(n<=30 || n>=50);
			
			out.writeUTF("STT\t\t" + "Ho Ten \t\t\t" + " Tuoi");
			Person[] list = new Person[n];
			list = MyArrrays.generatePerson(n);
			ArrayList<Person> tmp = new ArrayList<Person>();
			tmp = MyCollections.sortByName(list);
			int j=0;
			for(Person x:tmp) {
				out.writeUTF(j + "\t" + x);
				j++;
			}		
			//out.println();
			out.writeUTF("Tong So Sinh Vien:" + n + "danh sach bat dau tu 0");
		}
		out.close();
	}
	
	//Doc danh sach SinhVien Tu file abc.bin ra man hinh
	//Theo dinh dang nhi phan
	public static void binaryInPutFile() throws Exception{
		FileInputStream inFile  = new FileInputStream("abcd.bin");
		DataInputStream in  = new DataInputStream(inFile);		
		int resCount;
		String aStr;		
		resCount = in.readInt();
		for(int i=0; i<resCount; i++) {
			for(int j=0; j<=n+1; j++) {
				aStr = in.readUTF();
				System.out.println(aStr);
			}
		}		
		in.close();
	}
	public static void main(String[] args) {
		//test  in/out file voi cach van ban
		try {
			test1.textOutputFile();
			test1.textInputFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//test  in/out file voi cach nhi phan
//		try {
//		//cho phep dau du lieu o trong file abc.bin
//		System.out.print("\nnhap in file voi kieu binary\n");
//		test1.binaryOutPutFile();
//		test1.binaryInPutFile();
//	} catch (Exception e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	}
}
class ByName1 implements Comparator<Person>{
	@Override
	public int compare(Person p1, Person p2) {
		// TODO Auto-generated method stub
		return p1.getFirstName().compareToIgnoreCase(p2.getFirstName());	
		}
	
}
class ByName implements Comparator<Person> {
	@Override
	public int compare(Person p1, Person p2) {
		// TODO Auto-generated method stub
		if(p1.getage() > p2.getage() && p1.getFirstName().equals(p2.getFirstName()))
			return p1.getFirstName().compareToIgnoreCase(p2.getFirstName());
		return 0;
	}

}
