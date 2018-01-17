// we can't access 	 System.out.println(empID+" "+empName); in PSVM Refer Needed.
//Max use this Keyword in Constructor Method Refer Needed.

public class parameterizedConstructor {
int empID;
String empName;

public parameterizedConstructor(int ID ,String Name)
{
	empID = ID;
	empName = Name;
}
 public void display()
 {
	 System.out.println(empID+" "+empName);
 }
	public static void main(String[] args) {

		parameterizedConstructor obj = new parameterizedConstructor(100,"Ram");   //Passing Parameters to constructor
		obj.display();
	}

}


