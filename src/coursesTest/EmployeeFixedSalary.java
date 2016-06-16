package coursesTest;

public class EmployeeFixedSalary  extends AbstractEmployee{
	
	private int fixedMonthlyPayment;
	

	@Override
	public double calculateAverageMonthlySalary() {
		return fixedMonthlyPayment;
	}

	public int getFixedMonthlyPayment() {
		return fixedMonthlyPayment;
	}

	public void setFixedMonthlyPayment(int fixedMonthlyPayment) {
		this.fixedMonthlyPayment = fixedMonthlyPayment;
	}

	
	
}
