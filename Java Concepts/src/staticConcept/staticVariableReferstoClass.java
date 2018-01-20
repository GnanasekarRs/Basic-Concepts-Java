package staticConcept;

public class staticVariableReferstoClass {
	static int empid = 85 ;
    String empName; 

	public static void main(String[] args) {
		
		staticVariableReferstoClass obj1 = new staticVariableReferstoClass();
		staticVariableReferstoClass obj2 = new staticVariableReferstoClass();
		
		obj1.empid = 95;
		obj1.empName = "Sekar";
		 
		obj2.empid = 105;
		obj2.empName = "Gnanas";
		
		System.out.println("obj1-ID" +" "+obj1.empid);
		System.out.println("obj1-Name" +" "+obj1.empName);
		System.out.println("obj2-ID" +" "+obj2.empid);
		System.out.println("obj2-Name" +" "+obj2.empName);				
	}
}
//WHEN WE DECLARE STATIC VARIABLE THEN ITS BELONG TO THAT PARTICULAR CLASS
//eVEN WHEN WE CREATRE OBJECT AND ASSIGN VALUE THEN ITS PURLY WORKS ON CLASS NOT ON OBJECT
//WE CAN'T ACCESS CLASS VARIABLE DIRECTLY IN MAIN CLASS,WE HAVE TO CREATE OBJ TO ACCESS THESE
//WHEN WE DECLARE THE IT IN STATIC THEN WE CAN ACCESS THOSE VARIABLE IN MAIN METHOD AND CLASS MEMBERS


/**

public class staticVariableReferstoClass {
	static int empid = 85 ;
    String empName; 

    static void display()
    {
    	System.out.println("fdjhfjksdh");
    }
	public static void main(String[] args) {
		
		//new staticVariableReferstoClass();  -->No need to create objects
		//staticVariableReferstoClass obj1 = new staticVariableReferstoClass();  -->No need to create Objects for static Methods variable and class
		

		System.out.println(empid);
		System.out.println(staticVariableReferstoClass.empid=105);
		staticVariableReferstoClass.display();
		display();
		
					
	}
}
**/