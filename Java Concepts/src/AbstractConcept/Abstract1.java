//Abstract class can extend only one class or one abstract class at a time
//we can't create object for abstraction class

package AbstractConcept;

abstract class A
{
	void method1()
	{
		System.out.println("Method-1");
	}
}

abstract class B extends A
{
	void method2()
	{
		System.out.println("Method-2");
	}
	abstract void method3();
}

class c extends B                                // --> A class can extend abstraction class 
{

	@Override
	void method3() {
		System.out.println("Method-3");
		
	}
	
}

abstract class D extends c                       // --> A ABSTRACTION CLASS CAN EXTENDS NORMAL CLASS
{
	void method4()
	{
		System.out.println("Method-4");
	}
}

public class Abstract1 extends c {

	public static void main(String[] args) {
		
		c obj = new c();                          // --> OBJECTS CAN'T BE CREATED FOR ABSTRATION CLASS SO WE CREAETED FOR NORMAL CLASS C
		obj.method1();
		obj.method2();
		obj.method3();

	}

}


