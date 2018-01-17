package inheritanceConcept;

class Parentclass
{


	Parentclass()
		{
			System.out.println("Call 1st Constructor class");
		}
	Parentclass(String Message)
		{
			System.out.println("Call 2nd parameterized Constructor class");
		}
	
	
}
public class Parameterizedsupercalltoinvokeparameterizedconstructorofparentclass extends Parentclass{

	Parameterizedsupercalltoinvokeparameterizedconstructorofparentclass()
	{
		super("Calling Parameterized Parent Constructor");
		System.out.println("Child class Constructor");
	}
	
	 static void display()
	{
		System.out.println("Project Success");
	}
	public static void main(String[] args) {
	
		Parameterizedsupercalltoinvokeparameterizedconstructorofparentclass obj = new Parameterizedsupercalltoinvokeparameterizedconstructorofparentclass();
		display();

	}

}
//if method declare in static then no need to create obj to access that
//use super keyword and pass parameter to identify the parameterized parent constructor	