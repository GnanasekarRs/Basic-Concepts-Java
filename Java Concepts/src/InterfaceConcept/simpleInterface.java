package InterfaceConcept;

interface c1
{
	void method1();
}

interface c2 extends c1
{
	void method2();
}
public class simpleInterface implements c2 {

	public static void main(String[] args) {
		
		simpleInterface obj = new simpleInterface();
		obj.method1();
		obj.method2();

	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("Interface Override Method1");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("Interface Override Method2");
	}

}

/** we can't use multiple inheritance (class A extends B,C )
So abstraction can't be take place 100 percentage
So to over come that we using Interface concepts
class implements interface but an interface extends another interface.
**/

/**
 * As mentioned above they are used for full abstraction.
 *  Since methods in interfaces do not have body, they have to be implemented by the class before you can access them.
 *   The class that implements interface must implement all the methods of that interface. -->
 *    Also, java programming language does not allow you to extend more than one class, 
 *    However you can implement more than one interfaces in your class.
 **/
 
/**
 an interface can not implement another interface. -->
 It has to extend the other interface.
 See the below example where we have two interfaces Inf1 and Inf2. 
 Inf2 extends Inf1 so If class implements the Inf2 it has to provide implementation of all the methods of interfaces Inf2 as well as Inf1.
**/