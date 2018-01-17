class parentConstructor  //Refer Need when we Write Public its Throws Error
{
	parentConstructor()
	{
		System.out.println("Parent Constructor class");
	}
	
	void display()
	{
		System.out.println("Concepts");
	}
}
public class superConstructor extends parentConstructor  //When we Extend Parent class ,
                                                         //then we create a obj of child class then parent Constructor automatically gets invoked
                                                         //1st before Child Constructor get Invokes
{
	
	superConstructor()
	{
		System.out.println("Child Constructor Class");
	}

	public static void main(String[] args) {
		
		superConstructor obj = new superConstructor();
		//obj.display();

	}

}
