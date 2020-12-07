package process;
import java.io.*;
public class Persons implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	@Override
	public String toString() {
		return "Object " + idPerson + "\n";
	}
	public static int numPerson = 0;
	int idPerson;
	Persons next;
	public Persons() {		
		numPerson++;
		this.idPerson = numPerson;
		if(numPerson <= 10) {
			this.next = new Persons();
		}
		else {
			next=null;
		}
	}
	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("file0.txt"));
			Persons p = new Persons();
			out.writeObject(p);
			out.close();
			
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("file0.txt"));
			Persons p1 = (Persons) in.readObject();
			in.close();
			while((p1.next) != null) {
				System.out.println(p1);
				p1=p1.next;
			}
		}catch (IOException ex) {
			// TODO: handle exception
			ex.printStackTrace();
		}catch (ClassCastException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
