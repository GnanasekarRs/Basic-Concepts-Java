//A class cannot implement two interfaces that have methods with same name but different return type.

/**
package InterfaceConcept;
 

interface A
{
	Void method1();
}

interface B
{
	int method1();
}
public class haveMethodsWithSameNameButDifferentReturnType implements A,B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int method1() {                            // --> Getting Error
		// TODO Auto-generated method stub
		return 0;
	}

}
**/