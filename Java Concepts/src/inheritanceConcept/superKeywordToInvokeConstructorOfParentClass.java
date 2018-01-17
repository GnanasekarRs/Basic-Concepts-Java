package inheritanceConcept;

class A
{
	A()
	{
		System.out.println("Parent Class");
	}
}
public class superKeywordToInvokeConstructorOfParentClass extends A {

	superKeywordToInvokeConstructorOfParentClass()
	{
		System.out.println("Child class");
	}
	
	superKeywordToInvokeConstructorOfParentClass(String Name)
	{
		String Name1;
		Name1 = Name;
		System.out.println(Name1);
		
	}
	public static void main(String[] args) {
	
		superKeywordToInvokeConstructorOfParentClass obj1 = new superKeywordToInvokeConstructorOfParentClass();
		superKeywordToInvokeConstructorOfParentClass obj2 = new superKeywordToInvokeConstructorOfParentClass("Passing argument");
	
	}
}
//PArent constructor get automatically Invokes,its automatically assign super keyword in parent Constructor 
//we can't see it but it will first call when child constructor gets called 