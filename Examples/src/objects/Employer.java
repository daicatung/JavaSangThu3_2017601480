package objects;

public class Employer extends Person {

	//Định nghĩa hằng
		public static final int NET = 1000000;
		public static final String POSITION = "none";
		//Employ's properties
		private int net;
		private String position;
		
		public Employer() {
			this(Employer.FIRSTNAME, Employer.LASTNAME, Employer.AGE, Employer.ADDRESS, Employer.NET, Employer.POSITION);
			
		}
		
		public Employer(String f_Name, String l_Name, byte Age, Address address, int net, String posi) {
			
			// khoi tao doi tuong cha Person
			super(f_Name, l_Name, Age , address);
			
			//gan gia tri cho con
			
			this.net = net;
			this.position = posi;
		}
	public int getNet() {
			return net;
		}


		@Override
	public String toString() {
		return "Employer [" + super.toString()+ ", net=" + net + ", position=" + position + "]";
	}

		public String getPosition() {
			return position;
		}


		public void setNet(int net) {
			this.net = net;
		}


		public void setPosition(String position) {
			this.position = position;
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address addr = new Address("a", "b", "c");
		Employer s = new Employer("Tung", "Vu Viet", (byte)21, addr, 10000000, "Truong Phong CNTT");
		System.out.println(s);
	}

}
