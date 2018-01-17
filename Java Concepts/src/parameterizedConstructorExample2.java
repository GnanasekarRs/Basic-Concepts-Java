public class parameterizedConstructorExample2 {

	private int var;   // We can't access this Variable outside of this class
	public parameterizedConstructorExample2()
	{
		var = 10;
	}
	
	public parameterizedConstructorExample2(int num)
	{
		var = num;
	}
	
	public int getValue()
	{
	return var;	
	}
	
	public static void main(String[] args) {
		
		parameterizedConstructorExample2 obj = new parameterizedConstructorExample2();
		System.out.println(obj.getValue());
		parameterizedConstructorExample2 obj2 = new parameterizedConstructorExample2(100);
		System.out.println(obj2.getValue());
		
	/*  Method2   
	    o/p:
     	10 10  
    */
	/*	parameterizedConstructorExample2 obj2 = new parameterizedConstructorExample2();
		System.out.println(obj2.getValue());
		parameterizedConstructorExample2 obj = new parameterizedConstructorExample2(100);
		System.out.println(obj2.getValue());
	*/

	}

}



/*
 * What if you implement only parameterized constructor in class
class Example3
{
      private int var;
      public Example3(int num)
      {
             var=num;
      }
      public int getValue()
      {
              return var;
      }
      public static void main(String args[])
      {
              Example3 myobj = new Example3();
              System.out.println("value of var is: "+myobj.getValue());
      }
}
Output: 
It will throw a compilation error. 

The reason is, the statement Example3 myobj = new Example3() is invoking a default constructor which we don’t have in our program. 
when you don’t implement any constructor in your class, compiler inserts the default constructor into your code, 
however when you implement any constructor (in above example I have implemented parameterized constructor with int parameter), 
then you don’t receive the default constructor by compiler into your code.

*/
