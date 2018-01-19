package accessModifiersConcept1;

public class c {

	public static void main(String[] args) {

		//Here we try to access Default access modifier class in the same package
		addtionOperation obj = new addtionOperation();
		System.out.println(obj.addtion(50, 10));

	}

}
