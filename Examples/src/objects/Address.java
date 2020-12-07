package objects;

public class Address {
	// Object properties
	private String cityName;
	private String distictName;
	private String streetName;
	
	// consuct methoths
	// getter 
	// setter
	// other

	public Address(String ctName, String dsName, String sName) {
		this.cityName = ctName;
		this.distictName = dsName;
		this.streetName = sName;
	}
	public Address(Address addr) {
		this(addr.getctName(), addr.getdsName(), addr.getsName());
		
	}
	public String getctName() {
		return this.cityName;
	}
	public String getdsName() {
		return this.distictName;
	}
	public String getsName() {
		return this.streetName;
	}
	public Address setctName(String ctName) {
		this.cityName = ctName;
		return this;
	}
	public Address setdsName(String dsName) {
		this.distictName = dsName;
		return this;
	}
	public Address setsName(String sName) {
		this.streetName = sName;
		return this;
	}
	public String toString() {
		return this.cityName + " " + this.distictName + " " + this.streetName;
	}
	public static void main(String[] args) {
		Address a = new Address("a", "b", "c");
		a.toString();
		System.out.println(a.toString());
	}
}
