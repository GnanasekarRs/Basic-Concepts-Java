package InterfaceConcept;

interface A
{
	int x=10;
}

interface B
{
	int x=100;
}

public class VariableNamesConflicts implements A,B { 	

	public static void main(String[] args) {
		
 // System.out.println(x); --> this through Error because of ambiguity
		System.out.println(A.x);
		System.out.println(B.x);
	}

}
/* reference to x is ambiguous both variables are x
 * so we are using interface name to resolve the 
 * variable
 */
