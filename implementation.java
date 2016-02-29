public class implementation implements employee
{//class for implementation which makes the sandwich
	private int salary = 125;
	private double timeStep3 = 23.34;
	private double timeStep4 = 22.15;
	private double timeStep5 = 5.36;
	private double timeStep6 = 5.38;
	private double timeStep7 = 3.02;	
	public double totalHoursPerMonth;
	
	public int getSalary()
	{//returns salary
		return salary;	
	}

	public double getTimeStep3()
	{
		return timeStep3;
	}
	public double getTimeStep4()
	{
		return timeStep4;
	}
	public double getTimeStep5()
	{
		return timeStep5;
	}
	public double getTimeStep6()
	{
		return timeStep6;
	}
	public double getTimeStep7()
	{
		return timeStep7;
	}
	
	public double step(double numberOfSandwichesPerMonth, double time)
	{//how long it takes to do this step for every sandwich 
		//convert seconds to hours 
		return (0.000277777778* time*numberOfSandwichesPerMonth);
	}

	
	public double returnTotalHours(double numSandwiches, double time3, double time4,double time5, double time6,double time7)
	{//calculates total hours worked per month
		totalHoursPerMonth = this.step(numSandwiches, time3) + this.step(numSandwiches, time4) + this.step(numSandwiches, time5) + this.step(numSandwiches, time6) + this.step(numSandwiches, time7);
		return(totalHoursPerMonth);
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
		if (this.returnTotalHours(0,0,0,0,0,0) == 0.0)
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
