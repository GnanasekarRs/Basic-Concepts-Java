package packageConcept;



 public class packageWorks {         //Need to be in Public Refer
	 public int add(int a, int b)    //Need to be in Public
		{
			return a+b;
		}

	public static void main(String[] args) {
		
		packageWorks obj = new packageWorks();
		System.out.println(obj.add(10, 20));
	
	}

}
