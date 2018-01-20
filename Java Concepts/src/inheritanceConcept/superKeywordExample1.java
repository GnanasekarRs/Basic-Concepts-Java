package inheritanceConcept;

class keyword
{
	int num =100;
}
public class superKeywordExample1 extends keyword{

	int num =110;
	void display()
	{
		System.out.println(num);
		System.out.println(super.num);
	}
	public static void main(String[] args) {
		
		superKeywordExample1 obj1 = new superKeywordExample1();
		obj1.display();
	}
}
//Super keyword is used to call Variable of Parent class 
// we can't create methods in PSVM 
//we have to create methods above PSVM