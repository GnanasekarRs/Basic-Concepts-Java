package staticConcept;

//As you can see that both the static variables were intialized before we accessed them in the main method.

public class singleStaticBlock {
	
	static int empID;
	static String empName;
	
	static
	{
		empID = 100;
		empName = "Sekar";
	}

	public static void main(String[] args) {
		
		System.out.println(empID);
		System.out.println(empName);
	
	}

}
