package coursesTest;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Launcher {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
	
		EmployeesDB employeesDB = new EmployeesDB();	
		EmployeesManagement employeesManagement = new EmployeesManagement(employeesDB);
		insertDemoData(employeesDB);
		employeesManagement.sortEmployeesDescend();
		
		System.out.println(employeesDB.getEmployeesList().size());
		
		for(AbstractEmployee e : employeesDB.getEmployeesList()){
			System.out.println(e.calculateAverageMonthlySalary());
		}
		
		employeesManagement.printFirstFiveEmpls();
		
		//employeesManagement.writeEmplsListToFile();
		
		EmployeesDB tempDB = employeesManagement.readEmplsListFromFile();
		
		employeesManagement.setEmployeesDB(tempDB);
		
		employeesManagement.printFirstFiveEmpls();	
		
		
	}

	private static void insertDemoData(EmployeesDB employeesDB) {
		EmployeeFixedSalary efs1 = new EmployeeFixedSalary();
		efs1.setID(1);
		efs1.setName("Vasya");
		efs1.setFixedMonthlyPayment(100);
		employeesDB.addEmployee(efs1);
		
		EmployeeFixedSalary efs2 = new EmployeeFixedSalary();
		efs2.setID(2);
		efs2.setName("Petya");
		efs2.setFixedMonthlyPayment(200);
		employeesDB.addEmployee(efs2);
				
		EmployeeHourlySalary ehs1 = new EmployeeHourlySalary();
		ehs1.setID(3);
		ehs1.setName("Izya");
		ehs1.setHourlyRate(5);
		employeesDB.addEmployee(ehs1);

		EmployeeHourlySalary ehs2 = new EmployeeHourlySalary();
		ehs2.setID(4);
		ehs2.setName("Kolya");
		ehs2.setHourlyRate(6);
		employeesDB.addEmployee(ehs2);
	}

}
