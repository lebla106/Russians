public interface employee
{//interface all employees inherit from
	//member variables 
	private int salary = 0;
	public double totalHoursPerMonth = 0;

	//method signatures
	public int getSalary();

	public double calcSalary(int salary, int hours);

	public boolean testSalary();
	
	
}
