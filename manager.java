public class manager implements employee
{//class for manager position
	private int salary=150;
	public int getSalary()
	{
		return salary;
	}

	public double calcSalary(int salary, int hours)
	{//calculats yearly salary
		return (salary * hours * 12);
	}
	public boolean testSalary()
	{//tests calc salary function by using hard coded values

		if (this.calcSalary(0,0) ==0)
		{
			return true;
		}
		else
		{
			return false;
		}

	}
}
