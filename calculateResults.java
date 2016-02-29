import java.lang.Math.*;


public class calculateResults
{//calculates the results to return from data
	private designer des;
	private implementation imp;
	private tester test;
	private manager man;
	private double numDes;
	private double numImp;
	private double numTest;	
	private double numMan;
	private double numODes;
	private double numOImp;
	private double numOTest;	
	private double numOMan;
	private double moneySpentPerYear;
	private double moneySpent;
	private double offshoreMoneySpentPerYear;
	private double overheadSpentPerYear;
	private double offshoreOverheadPerYear;
	private double numSandwiches;	
	private double numOffshoreSandwiches;
	private double budget;
	private double difference;

	public calculateResults(designer des1, implementation imp1, tester test1, manager man1)
	{//overloaded constructor
		des = des1;
		imp = imp1;
		test = test1;
		man = man1;
	}

	public void runProgram()
	{//runs the entire program based on what we need to output
		System.out.println("Info without defect:");
		this.calcNumSandwichesPerMonth(0.0);
		this.calcNumOffshoreSandwichesPerMonth(0.0);
		
		this.calcNumEmployees();
		this.calcNumOffshoreEmployees();

		
		System.out.println("Number of Designers needed: " + numDes);
		System.out.println("Number of Implementation needed: " + numImp);
		System.out.println("Number of Testers needed: " + numTest); 
		System.out.println("Number of Managers needed: " + numMan);
		System.out.println("Number of offshore Designers needed: " + numODes);
		System.out.println("Number of offshore Implementation needed: " + numOImp);
		System.out.println("Number of offshore Testers needed: " + numOTest); 
		System.out.println("Number of offshore Managers needed: " + numOMan);

		this.calculateMoneySpentPerYear();
		this.calculateOffshoreMoneySpentPerYear();
		moneySpent = moneySpentPerYear + offshoreMoneySpentPerYear + (100000*78.69);
		System.out.println("Amount of money spent in Ruples (including extra 100000 budget): " + moneySpent);

		this.calcBudget();
		this.calcDifference();
	
		this.calculateOverheadPerYear();
		this.calculateOffshoreOverheadPerYear();
		double overhead =overheadSpentPerYear + offshoreOverheadPerYear;
		System.out.println("Amount of overhead spent in Ruples: " + overhead);
		
		
		
		System.out.println("Info with defect:");
		this.calcNumSandwichesPerMonth(0.10);
		this.calcNumOffshoreSandwichesPerMonth(0.30);
		
		this.calcNumEmployees();
		this.calcNumOffshoreEmployees();

		
		System.out.println("Number of Designers needed: " + numDes);
		System.out.println("Number of Implementation needed: " + numImp);
		System.out.println("Number of Testers needed: " + numTest); 
		System.out.println("Number of Managers needed: " + numMan);
		System.out.println("Number of offshore Designers needed: " + numODes);
		System.out.println("Number of offshore Implementation needed: " + numOImp);
		System.out.println("Number of offshore Testers needed: " + numOTest); 
		System.out.println("Number of offshore Managers needed: " + numOMan);

		this.calculateMoneySpentPerYear();
		this.calculateOffshoreMoneySpentPerYear();
		moneySpent = moneySpentPerYear + offshoreMoneySpentPerYear + (100000*78.69);
		System.out.println("Amount of money spent in Ruples (including extra 100000 budget): " + moneySpent);

		this.calcBudget();
		this.calcDifference();
	
		this.calculateOverheadPerYear();
		this.calculateOffshoreOverheadPerYear();
		overhead =overheadSpentPerYear + offshoreOverheadPerYear;
		System.out.println("Amount of overhead spent in Ruples: " + overhead);
	}

	public void calculateMoneySpentPerYear()
	{//add all salaries and convert to rubles
		moneySpentPerYear = ((numDes* des.calcSalary(des.getSalary(), 160)) + (numImp* imp.calcSalary(imp.getSalary(), 160)) + (numTest* test.calcSalary(test.getSalary(), 160)) + (numMan * man.calcSalary(man.getSalary(), 160)))*78.69;
	}
	
	public void calculateOffshoreMoneySpentPerYear()
	{//add all salaries and convert to rubles
		offshoreMoneySpentPerYear = ((numODes* des.calcSalary(des.getSalary()*0.25, 160)) + (numOImp* imp.calcSalary(imp.getSalary()*0.25, 160)) + (numOTest* test.calcSalary(test.getSalary()*0.25, 160)) + (numOMan * man.calcSalary(man.getSalary()*0.25, 160)))*78.69;
	}

	public boolean testMoneySpent()
	{//test calculateMoneySpentPerYear

		return moneySpentPerYear== 5.1746544E8;
	}

	public boolean testOverheadSpent()
	{//test overhead with and without defect
		if (moneySpentPerYear== 5.1746544E8)
		{
			return overheadSpentPerYear == 1.2936636E8;
		}
		else
		{
			return overheadSpentPerYear == 1.4353056E8;
		}
	}
	
	public void calculateOverheadPerYear()
	{//add all salaries overhead and convert to rubles
		overheadSpentPerYear = ((numDes* des.calcSalary(des.getSalary(), 40)) + (numImp* imp.calcSalary(imp.getSalary(), 40)) + (numTest* test.calcSalary(test.getSalary(), 40)) + (numMan * man.calcSalary(man.getSalary(), 40)))*78.69;
	}

	public void calculateOffshoreOverheadPerYear()
	{//add all salaries and convert to rubles
		offshoreOverheadPerYear = ((numODes* des.calcSalary(des.getSalary()*0.25, 40)) + (numOImp* imp.calcSalary(imp.getSalary()*0.25, 40)) + (numOTest* test.calcSalary(test.getSalary()*0.25, 40)) + (numOMan * man.calcSalary(man.getSalary()*0.25, 40)))*78.69;
	}

	public void calcNumEmployees()
	{//calculates the number of employees needed to make the necesary sandwiches based off how long it takes for that person to do their steps
		numDes = Math.ceil(des.returnTotalHours(numSandwiches, des.getTimeStep1(), des.getTimeStep2())/120);
		numImp = Math.ceil(imp.returnTotalHours(numSandwiches, imp.getTimeStep3(),imp.getTimeStep4(), imp.getTimeStep5(), imp.getTimeStep6(),imp.getTimeStep7())/120);
		numTest = Math.ceil(test.returnTotalHours(numSandwiches, test.getTimeStep8())/120);
		numMan = Math.ceil((numDes + numImp + numTest)/30.0);
	}
	public void calcNumOffshoreEmployees()
	{//calculates the number of employees needed to make the necesary sandwiches based off how long it takes for that person to do their steps
		numODes = Math.ceil(des.returnTotalHours(numOffshoreSandwiches, des.getTimeStep1(), des.getTimeStep2())/120);
		numOImp = Math.ceil(imp.returnTotalHours(numOffshoreSandwiches, imp.getTimeStep3(),imp.getTimeStep4(), imp.getTimeStep5(), imp.getTimeStep6(),imp.getTimeStep7())/120);
		numOTest = Math.ceil(test.returnTotalHours(numOffshoreSandwiches, test.getTimeStep8())/120);
		numOMan = Math.ceil((numODes + numOImp + numOTest)/30.0);
	}

	public void calcNumSandwichesPerMonth( double defect)
	{//calculates the number of sandwiches to make per month
		numSandwiches = (500000 + (250000 * 0.75) + (250000 * 0.25))/12.0;
		if (defect > 0.0)
		{// if there is a defect factor that in
			numSandwiches += numSandwiches*defect;
		}
	}

	public void calcNumOffshoreSandwichesPerMonth( double defect)
	{//calculates the number of sandwiches to make per month
		numOffshoreSandwiches = ((250000 * 0.75) + (250000 * 0.25))/12.0;
		if (defect > 0.0)
		{// if there is a defect factor that in
			numOffshoreSandwiches += numOffshoreSandwiches*defect;
		}
	}
	

	public void calcBudget()
	{//converts budget to ruples
		budget =  1000000*78.69;
	}

	public void calcDifference()
	{//calculates whether you are under or over budget
		if (budget > moneySpent)
		{
			difference = budget - moneySpent;
			System.out.println("The company is " + difference + " Ruples under budget");
		}
		else
		{
			difference = moneySpent - budget;
			System.out.println("The company is " + difference + " Ruples over budget");
		}
	}
	
	
	public void calcTest1()
	{//test for output values of first round of simulation with no defect
		System.out.println();
		System.out.println("Testing number of employees!");
		this.testValues(this.numDes, 2.0, "number of designers");
		this.testValues(this.numImp, 7.0, "number of implementers");
		this.testValues(this.numTest, 24.0, "number of testers");
		this.testValues(this.numMan, 2.0, "number of managers");	
		System.out.println();		
	}
	
	public void calcTest2()
	{//test for output values of second round of sim with defect
		System.out.println();
		System.out.println("Testing number of employees!");
		this.testValues(this.numDes, 3.0, "number of designers");
		this.testValues(this.numImp, 8.0, "number of implementers");
		this.testValues(this.numTest, 26.0, "number of testers");
		this.testValues(this.numMan, 2.0, "number of managers");
		System.out.println();
	}
	
	public void testValues(double testValue, double expectedValue, String testName)
	{//test to see if values are what you expect them to be
		if(testValue == expectedValue)
		{
			System.out.println("Test passed for " + testName);
		}
		else
		{
			System.out.println("Test failed. :( Expected: " + expectedValue + " but got " + testValue + " instead.");
		}
	}
}
