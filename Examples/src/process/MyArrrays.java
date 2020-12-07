package process;

import objects.Person;
import java.util.*;
public class MyArrrays {
	//sinh ngau nhien mang
	public static int[] generateArray(int n) {
		int[] arrInt = new int[n];
		for(int i=0; i < arrInt.length; i++ )
			arrInt[i] =  (int)(Math.random()*2);
		return arrInt;
	}
		
	//sinh ngau nhien mang 2 chieu	
	public static int[][] generateArray(int rows, int cols){
		int[][] arrInt = new int[rows][cols];
		for(int i=0; i < rows; i++)
			for(int j=0; j < cols; j++)
				arrInt[i] = MyArrrays.generateArray(cols);
		return arrInt;
		
	}
	
	//sinh ngau nhien mang doi tuong	
	public static Person[] generatePerson(int n) {		
		// DS ten
		String[] firstName = {
				"aTung001", "bTung002", "cTung003", "dTung004", "eTung005", "fTung006", "gTung007", "hTung008",
				"iTung009", "jTung010", "kTung011", "nTung012", "mTung013", "qTung014", "vTung015", "zTung016",
				"xTung017", "cTung018", "vTung019", "bTung020", "nTung021", "mTung022", "lTung023", "hTung024"
		};
		// DS ho
		String[] lastName = {
			"Vuu", "Tran", "Tong", "Lee", "Manh",
			"Phan", "Khuong", "Tat", "Viet"
		};
		//Sinh ngau nhien 
		Person[] list = new Person[n];
		int index;
		for(int i=0; i < n; i++) {
			//khoi tao bo  nho cho tung phan tu
			list[i] = new Person();
			
			//ngau nhien chi so cua ten
			index = (int)(Math.random()*firstName.length);
			list[i].setFirstName(firstName[index]);
			
			//ngau nhien chi so cua ho
			index = (int)(Math.random()*lastName.length);
			list[i].setLastName(lastName[index]);
			
			//ngau nhien tuoi			
			index = 18 + (int)(Math.random()*5);
			list[i].setAge((byte)index);
		}
		return list;		
	}
	
	//in person
	public static void prinArray(Person[] list) {
		for(Person x:list)
			System.out.println(x);		
		System.out.println();
	}
	//xuat mang 2 chieu 
	public static void printArray(int[][] arrInt) {
		
		for(int [] row: arrInt)
			MyArrrays.printArray(row);
	}
	//xuat mang
	public static void printArray(int[] arrInt) {
		
		for(int i=0; i < arrInt.length; i++)
			System.out.print(arrInt[i] + " ");
		System.out.println();
	}
	
	//xuat mang bang j5
	public static void printArrayj5(int[] arrInt) {		
		for(int v:arrInt)
			System.out.print(v+" ");
		System.out.println();
	}
	
	//sap xep noi bot
	public static int[] sortedArray(int[] arrInt, boolean isINC) {
		//xac dinh huong sap xep
		byte oriented = (byte)(isINC ? 1:-1);
		//sap xep
		int temp;
		for(int i=0; i < arrInt.length - 1; i++) {
			for(int j=i+1; j < arrInt.length; j++) {
				if(arrInt[i]*oriented > arrInt[j]*oriented) {
					temp = arrInt[i];
					arrInt[i] = arrInt[j];
					arrInt[j]  = temp;
				}
			}
		}
		return arrInt;
	}
	
	//sap xep phan doan	
	public static boolean isprime(int n) {
		boolean flag = true;
		if(n<2) flag=false;
		else {
			for(int v=2; v<=(int)Math.sqrt(n); v++) {
				if(n%v==0) { 
					flag=false;
					break;
				}
			}
		}
		return flag;
	}	
	public static int[] fillterArray(int[] arrInt, boolean isINC) {
		arrInt = MyArrrays.sortedArray(arrInt, isINC);		
		//tach nguyen to
		int[] temp1 = new int[arrInt.length];
		int[] temp2 = new int[arrInt.length];
		int t1=0, t2=0;
		for(int value:arrInt) {
			if((isprime(value))) {
				temp1[t1] = value;
				t1++;
			}
			else {
				temp2[t2] = value;
				t2++;
			}			
		}
		//ghep mang
		for(int i=t1; i < temp1.length; i++) {
			temp1[i] = temp2[i-t1];
		}
		return temp1;
	}
	//Tim kiem 
	public static Person[] searchPerson(Person[] list, String name) {
		Person[] result = null;
		//tao bien dem ket qua
		int count = 0;
		for(Person p: list) {			
			if(p.getFirstName().contains(name)) {
				count++;
				
			}
		}
		//khoi tao bo nho
		result = new  Person[count];
		
		//ghi nhan ket qua
		count = 0;
		for(Person p: list) {
			if(p.getFirstName().contains(name)) {
				result[count++] = p;
			}
		}
		return result;
	}
	public static ArrayList<Person> searchPersonV2(Person[] list, String name) {
		ArrayList<Person> results = new ArrayList<>();
		for(Person p: list) {
			if(p.getFirstName().contains(name)) {
				results.add(p);
			}
		}
		return results;
	}
	
	//in array list
	
	public static void PrintPerson(ArrayList<Person> list) {
		for(Person x:list)
			System.out.println(x);
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int[] arrInt = MyArrrays.generateArray(20);
		MyArrrays.printArray(arrInt);
		
		MyArrrays.sortedArray(arrInt, true);
		MyArrrays.printArray(arrInt);
		
		arrInt = MyArrrays.fillterArray(arrInt, true);
		MyArrrays.printArray(arrInt);
		*/
		
		
		//int[][] arrInt = new int[10][20];
		//arrInt = MyArrrays.generateArray(10, 20);
		//MyArrrays.printArray(arrInt);
		
		Person[] list = new Person[48];
		list = MyArrrays.generatePerson(48);
		ArrayList<Person> resluts = MyArrrays.searchPersonV2(list, "tung1");
		System.out.println("--------------------");
		MyArrrays.prinArray(list);
		MyArrrays.PrintPerson(resluts);
		System.out.println("--------------------");

	}

}
