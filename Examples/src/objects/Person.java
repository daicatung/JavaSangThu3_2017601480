package objects;

public class Person  implements Comparable<Person> {

	// classes' variables
	public static int count = 0;
	public static final String FIRSTNAME = "No FirstName";
	public static final String LASTNAME = "No LastName";
	public static final byte AGE=0;
	public static final Address ADDRESS = new Address("a", "b", "c");
	// object's properties(fields)
	private String firstName;
	private String lastName;
	private byte age; // -128-127
	private  Address addRess;
	// Constructor methods
	public Person() {
		// Đặc biệt loại 1;
		// firstName = "No FirstName";
		// lastName = "No LastName";
		// age = 0;
		this("no firstname", "no lastname", (byte) 0, Person.ADDRESS);
	}

	public Person(byte age) {
		// firstName = "No FirstName";
		// lastName = "No LastName";
		// this.age = age;
		this("no firstname", "no lastname", age, Person.ADDRESS);
	}

	public Person(String firstName, String lastName, byte a, Address address) {
		// Đặc biệt loại 2;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = a;
		this.addRess = new Address(address);
		
		//Tăng biến đếm đối tượng
		Person.count++;
		
	}
	public static int getCountPerson (){
		
		return Person.count;
	}

	// Getter methods

	public String getFirstName() {

		return this.firstName;
	}

	public String getLastName() {

		return this.lastName;
	}

	public byte getage() {

		return this.age;
	}
	public Address getAddress() {
		return this.addRess;
	}

	// Setter methods

	public Person setFirstName(String firstName) {
		this.firstName = firstName;
		return this;

	}

	public Person setLastName(String lastName) {
		this.lastName = lastName;
		return this;

	}

	public Person setAge(byte age) {
		this.age = age;
		return this;

	}
	public Person setAddress(String ctName, String dsName, String sName) {
		this.addRess = new Address(ctName, dsName, sName);
		return this;
	}
	// Other methods
	public String toString() {
		return this.lastName + " " + this.firstName + "\t\t\t" + age;
	}

	public static void main(String[] args) {

		//Address addr = new Address("a", "b", "c");
		
		Person p1 = new Person();
		Person p2 = new Person((byte) 20);
	    //Person p3 = new Person("Tung", "Vu Viet", (byte) 20);

		  System.out.println(p1);
		  System.out.println(p2.toString());
		 // System.out.println(p3);
		  p1.setFirstName("Tung").setLastName("Vu Viet").setAge((byte)20);
		  System.out.println(p1);
		  System.out.println("Số đối tượng sinh ra trong bộ nhớ:"+ Person.getCountPerson());

	}

	@Override
	public int compareTo(Person p) {
		// TODO Auto-generated method stub
		
		if(this.age > p.getage()) {
			return 1;
		}
		else if(this.age < p.getage()) {
			return -1;
		}
		else {
			return 0;
		}

	}

}
