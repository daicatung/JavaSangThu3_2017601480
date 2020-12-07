package objects;

public class EmployerManager extends Manager {

	@Override
	public String getInfo(Person p) {
		// TODO Auto-generated method stub
		return "E:" + p.toString();
	}

}
