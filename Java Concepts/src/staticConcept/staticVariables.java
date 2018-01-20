package staticConcept;

public class staticVariables {
	
static int j;

    static void display()	
	{
    	int empid;
    	String empName;
		System.out.println(empid = 10);
		System.out.println(empName ="Static Variable");
	}
	public static void main(String[] args) {
		display();
		//staticVariables obj = new staticVariables();
		System.out.println(j=100);
	}

}

//Need to Refer
//we can't declare static variable inside the methods
//if we declare variable in class ,it can't access directly in main Function
//if we declare variable as static ,it can access Directly in main class
//we can access class static variables in both static methods and non static methods too
//we can't access non-static variables in static method but we can declare non static variables inside static method
//we can access non-static variable in non static methods
//we can't access these in non static keywords
//we need static keyword in both methods and Variables so that we can access these in main method without using OBJECT
