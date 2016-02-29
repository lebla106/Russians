public interface employee
{//interface all employees inherit from
	//member variables 
	public int salary = 0;
	public double totalHoursPerMonth = 0;

	//method signatures
	public int getSalary();

	public double calcSalary(double salary, int hours);

	public boolean testSalary();
	
	
}
