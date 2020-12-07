package objects;

public class TestManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address addr = new Address("a", "b", "c");
		Person s = new Student("Tung", "Vu Viet", (byte)21, addr, "2017601480", "CNTT");
		//Person s = new Student("Tung", "Vu Viet", (byte)21, addr, "2017601480", "CNTT");
		System.out.println(s.toString());
		
		Person e = new Employer("Tung", "Vu Viet", (byte)21, addr, 12_000_000, "Truong Phong CNTT");
		System.out.println(e.toString());
		
		Manager sm = new StudentManager();
		Manager em = new EmployerManager();
		
		System.out.println(sm.getInfo(s));
		System.out.println(em.getInfo(e));
	}

}
