package staticConcept;

public class multipleStaticBlocks {

	static int Number;
	static String block;
	
	static  // 2 Static Block Declared and 1st static method gets implemented then only static gets implemented ,
	//Hence here value gets replaced in Final call
	{
		System.out.println("Static Method 1");
		Number = 01;
		block = "Static Block 1";
	}
	static
	{
		System.out.println("Static Method 2");
		Number = 02;
		block = "Static Block 2";
	}
	
	public static void main(String[] args) {
		
        System.out.println(Number);
        System.out.println(block);
	}

}
