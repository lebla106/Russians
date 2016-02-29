public class runSim
{//main class that instantiates everything and runs the simulation
	public static void main(String []args)
	{
		designer des = new designer();
		implementation imp = new implementation();
		tester test = new tester();
		manager man = new manager();

		calculateResults calc = new calculateResults(des, imp, test, man);
		calc.runProgram();
		
	}
}
