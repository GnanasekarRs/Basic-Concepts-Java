//Constructor can be Created same name as className
//Default Constructor can Apply when User's not Declared Constructor
//Need to Create Objects
//After Create Objects no Need of call Constructor Method , it will Automatically Call it

public class aSimpleConstructorProgramInJava {

	String Message;
	aSimpleConstructorProgramInJava()
	{
		Message = "Hello i'm Constructor";
		System.out.println(Message);
	}
	public static void main(String[] args) {
		
		aSimpleConstructorProgramInJava obj = new aSimpleConstructorProgramInJava();

	}
}


