package staticConcept;

public class staticBlock {

	public static void block()
	{
		System.out.println("This Static Block");
	}
	public static void main(String[] args) {
		
		block();
		
		//or
       //staticBlock.block():
	}

}

// if you make a member static, you can access it without object
//Here we have a static method myMethod(), we can call this method without any object because when we make a member static it becomes class level.
//If we remove the static keyword and make it non-static then
//we must need to create an object of the class in order to call it.