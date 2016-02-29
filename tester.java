public class tester implements employee
{// class for tester who eats sandwich
	private int salary = 75;
	private double timeStep8 = 162.99;
	public double totalHoursPerMonth;
	
	public int getSalary()
	{//returns salary
		return salary;	
	}

	public double getTimeStep8()
	{
		return timeStep8;
	}
	
	public double step(double numberOfSandwichesPerMonth, double time)
	{//how long it takes to do this step for every sandwich 
		//convert seconds to hours 
		return (0.000277777778* time*numberOfSandwichesPerMonth);
	}

	public double returnTotalHours(double numberOfSandwichesPerMonth, double time)
	{//returns the total hours worked per month
		totalHoursPerMonth = this.step(numberOfSandwichesPerMonth, time);
		return (totalHoursPerMonth);
	}
	public double calcSalary(int salary, int hours)
	{//calculats yearly salary
		return (salary * hours * 12);
	}

	public boolean testSteps()
	{//tests allthe steps fucn using hardcoded vals
		
		if (this.step(1,1) == 0.000277777778)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean testTotalHours()
	{//tests calcTotalHours using hardcoded values
		if (this.returnTotalHours(1,1) == 0.000277777778)
		{
			return true;
		}
		else
		{
			return false;
		}
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
