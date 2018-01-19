package AbstractConcept;

abstract class Base{
	   /* These two are abstract methods, the child class
	    * must implement these methods
	    */
	   public abstract int sumOfTwo(int n1, int n2);
	   public abstract int sumOfThree(int n1, int n2, int n3);
	   public abstract void printName();
		
	}



	//Regular class extends abstract class
	class Derived1 extends Base{

	   /* If I don't provide the implementation of these two methods, the
	    * program will throw compilation error.
	    */
	   public int sumOfTwo(int num1, int num2){
		return num1+num2;
	   }
	   public int sumOfThree(int num1, int num2, int num3){
		return num1+num2+num3;
	   }
	   
	   public void printName()
	   {
		   System.out.println("Derived1 is my name");
	   }
	   
	   public void Add()
	   {
		   
	   }
	}
	
	class Derived2 extends Base {

		@Override
		public int sumOfTwo(int n1, int n2) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int sumOfThree(int n1, int n2, int n3) {
			// TODO Auto-generated method stub
			return 0;
		}
	   public void printName()
	   {
		   System.out.println("Derived2 is my name");
	   }
	   
	   public void Subtract()
	   {
		   
	   }
		
	}
	
	class AbstractionExample {
		public static void Main()
		{
			Derived1 d1 = new Derived1();
			Derived2 d2 = new Derived2();
			Print(d1);
			Print(d2);
		}
		
		public static void Print(Base obj)
		{
			obj.printName();
		}
		
	}
	
	
	