package coursesTest;

import java.io.Serializable;

public abstract class AbstractEmployee implements Serializable{	
	
	private int ID;
	private String name;
	
	public abstract double calculateAverageMonthlySalary();	
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return ID + " " + name + " " + calculateAverageMonthlySalary(); 
	}
}
