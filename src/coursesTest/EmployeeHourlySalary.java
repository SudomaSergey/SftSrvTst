package coursesTest;

public class EmployeeHourlySalary extends AbstractEmployee{
	
	private int hourlyRate;
	private int workingTimePerDay = 8;
	private double workingDaysPerMonth = 20.8; 
	
	
	@Override
	public double calculateAverageMonthlySalary() {
		return workingDaysPerMonth * workingTimePerDay * hourlyRate;
	}
	
	
	public int getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public int getWorkingTimePerDay() {
		return workingTimePerDay;
	}

	public void setWorkingTimePerDay(int workingTimePerDay) {
		this.workingTimePerDay = workingTimePerDay;
	}

	public double getWorkingDaysPerMonth() {
		return workingDaysPerMonth;
	}

	public void setWorkingDaysPerMonth(double workingDaysPerMonth) {
		this.workingDaysPerMonth = workingDaysPerMonth;
	}
	
	

}
