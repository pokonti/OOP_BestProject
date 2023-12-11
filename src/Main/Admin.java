package Main;

import java.util.Vector;
import Staff.Employee;


public class Admin extends Employee{
	DataSingleton s = DataSingleton.getInstance();
	
	public Admin() {
		super();
	}
	
	public Admin(int id, String surname, String name, String corparateEmail, String password, double salary) {
		super(id, surname, name, corparateEmail, password, salary);
		
	}
	
	public void addUser(String userType) throws Exception {
		s.addUser(userType);
	}
	
	public Vector<User> getUsers() throws Exception {
		return s.getUsers();
	}
	
	public void removeUser(User u) {
		s.removeUser(u);
	}

	
	
	
	
}
