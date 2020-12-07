package objects;

public class Student extends Person {	
	//Định nghĩa hằng
	public static final String ID = "(2020)0123000000";
	public static final String SPECIALY = "none";
	//Student's properties
	private String id;
	private String specialy;
	//Constuctor method	
	public Student() {
		this(Student.FIRSTNAME, Student.LASTNAME, Student.AGE, Student.ADDRESS, Student.ID, Student.SPECIALY);		
	}
	public Student(String f_Name, String l_Name, byte Age, Address address, String iD, String s_P) {	
		// khoi tao doi tuong cha Person
		super(f_Name, l_Name, Age , address);
		
		//gan gia tri cho con
		
		this.id = iD;
		this.specialy = s_P;
	}
		
	public String getId() {
		return id;
	}

	public String getSpecialy() {
		return specialy;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public void setSpecialy(String specialy) {
		this.specialy = specialy;
	}
	
	
	@Override
	public String toString() {
		return "Student [" +super.toString()+ ", id = " + id + ", specialy=" + specialy + "]";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address addr = new Address("a", "b", "c");
		Student s = new Student("Tung", "Vu Viet", (byte)21, addr, "2017601480", "CNTT");
		//Person s = new Student("Tung", "Vu Viet", (byte)21, addr, "2017601480", "CNTT");
		System.out.println(s);
	}
}
