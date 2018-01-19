/**

package accessModifiersConcept1;


class privateintilization
{
	private int a,b,c;
	
	 private int addtion(int x,int y)  //when we declare it has Private then we can't access outside of the class
	{
		a=x;
		b=y;
		return c =a+b;
	}
}
public class Privatemodifer {

	public static void main(String[] args) {
		
		privateintilization obj = new privateintilization();
		obj.addtion(50, 40);
		
	
	}

}

**/