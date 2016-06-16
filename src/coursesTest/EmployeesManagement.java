package coursesTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.Comparator;getEmployeesList(), new EmployeesComparator());
	}
	
	public void printFirstFiveEmpls(){
		for(int i = 0; i < 4; i++){
			System.out.println(employeesDB.getEmployeesList().get(i));
		}
	}
	
	public void writeEmplsListToFile() throws FileNotFoundException, IOException{
		File saveFileForEmplsList = new File("list.txt");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(saveFileForEmplsList));
		objectOutputStream.writeObject(employeesDB);
		objectOutputStream.close();
	}
	
	public EmployeesDB readEmplsListFromFile() throws FileNotFoundException, IOException {
		File readFileForEmplsList = new File("list.txt");
		ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(readFileForEmplsList));
		EmployeesDB readDB = null;
		try{
			readDB = (EmployeesDB) inputStream.readObject();
		}
		catch(Exception e){
			System.out.println("Wrong format of file");
		}
		return readDB;
	}
	
	public EmployeesDB getEmployeesDB() {
		return employeesDB;
	}

	public void setEmployeesDB(EmployeesDB employeesDB) {
		this.employeesDB = employeesDB;
	}
	
	class EmployeesComparator implements Comparator<AbstractEmployee>{

		@Override
		public int compare(AbstractEmployee o1, AbstractEmployee o2) {
			double o1Salary = o1.calculateAverageMonthlySalary();
			double o2Salary = o2.calculateAverageMonthlySalary();
			String o1Name = o1.getName();
			String o2Name = o2.getName();
			
			if(o1Salary == o2Salary){
				int result = o1Name.compareTo(o2Name);
				if(result == 0){
					return 0; 
				}
				else if (result > 0){
					return 1;
				}
				else{
					return -1;
				}
				
			}
			else if(o1Salary > o2Salary){
				return -1;
			}
			else{
				return 1;
			}
		}
		
	}
}

