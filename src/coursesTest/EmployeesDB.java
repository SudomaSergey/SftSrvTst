package coursesTest;

import java.io.Serializable;
import java.util.ArrayList;

public class EmployeesDB implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8121997139719086071L;
	private ArrayList<AbstractEmployee> employeesList = new ArrayList<>();

	public ArrayList<AbstractEmployee> getEmployeesList() {
		return employeesList;
	}

	public void setEmployeesList(ArrayList<AbstractEmployee> employeesList) {
		this.employeesList = employeesList;
	}
	
	public void addEmployee(AbstractEmployee employee){
		employeesList.add(employee);
	}
}
