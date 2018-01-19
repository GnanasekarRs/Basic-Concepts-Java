package accessModifiersConcept1;

//Here we used package accessModifiersConcept2;
//here we used protected method int display(int a,int b)
//so we can't access outside of the package hence we need extends that protected method or class then we can access those methods by creating objects

 public class protectedAccessModifierConcept
{
	protected int display(int a,int b)
	{
		
		return a*b;
		
	}
}



