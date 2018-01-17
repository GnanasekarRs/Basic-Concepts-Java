
public class copyConstrucor {
	private String Message;

	copyConstrucor(String w)
	{
		Message = w;

	}
	copyConstrucor(copyConstrucor je) // Refer Needed
	{
		Message = je.Message;
	}
	 
	void getValue()
	{
		System.out.println(Message);
	}
	
	public static void main(String args[])
	{
		copyConstrucor obj = new copyConstrucor("Copy Constructor");
		copyConstrucor obj2 = new copyConstrucor(obj);    //Passing obj as Parameter
		obj.getValue();
		obj2.getValue();
	}
}
