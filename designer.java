public class designer implements employee
{//class for designer: gets ingredients for sandwich
	public int salary = 100;
	private double timeStep1 = 10.74;
	private double timeStep2 = 2.89;	
	public double totalHoursPerMonth;

	
	public int getSalary()
	{//returns salary
		return salary;	
	}
	public double getTimeStep1()
	{
		return timeStep1;
	}
	public double getTimeStep2()
	{
		return timeStep2;
	}	

	public double step(double numberOfSandwichesPerMonth, double time)
	{//how long it takes to do this step for every sandwich 
		//convert seconds to hours 
		return (0.000277777778* time*numberOfSandwichesPerMonth);
	}

	public double returnTotalHours(double numberOfSandwichesPerMonth, double time,double time2)
	{//returns the total hours worked per month
		totalHoursPerMonth = this.step(numberOfSandwichesPerMonth, time)+ this.step(numberOfSandwichesPerMonth, time2);
		return (totalHoursPerMonth);
	}

	public double calcSalary(double salary, int hours)
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
		if (this.returnTotalHours(0,0,0) == 0.0)
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
