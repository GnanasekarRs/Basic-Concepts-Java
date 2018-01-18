//Interface can extend any number of interfaces at a time

package InterfaceConcept;

interface A1
{
	void method1();
}

interface A2
{
	void method2();
}

interface A3
{
	void method3();
}

interface A4 extends A1,A2,A3 //interface can extends more than 1 interface
{
	
}
                         //Classes has to implement them instead of extend
class c3 implements A4   //Refer it bcz when we make c1 it consider it has declared one which is present ion other java file
{

	@Override
	public void method1() {
		
		System.out.println("Interface Signature Method1 gets implemented in Normal class not in interface");
		
	}

	@Override
	public void method2() {
		
		System.out.println("Interface Signature Method2 gets implemented in Normal class not in interface");
		
	}

	@Override
	public void method3() {
		
		System.out.println("Interface Signature Method3 gets implemented in Normal class not in interface");
		
	}
	
}


public class interface1 {

	public static void main(String[] args) {
	
		//we can't create object for Interface class
		c3 obj = new c3();
		obj.method1();
		obj.method2();
		obj.method3();
	}

}
