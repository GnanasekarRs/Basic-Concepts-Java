package inheritanceConcept;


class ParentClass1
{
    void ParentMethod()
	{
		System.out.println("Parent Method gets Executed");
	}
   
}

public class singleInheritance extends ParentClass1 {
	public void childMethod()
	{
	System.out.println("Child Methods gets Executed");	
	}                                                   //Methods can't be created inside the main method 
	public static void main(String[] args) {
		
	singleInheritance obj = new singleInheritance();
	obj.childMethod();
	obj.ParentMethod();
	}

}
