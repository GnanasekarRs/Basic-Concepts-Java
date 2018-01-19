package AbstractConcept;

abstract class parentClass  //abstract must be Present
{
	public abstract void sound(); // abstract can have abstract methods with signature and non abstract methods with body
}                                 //But non abstract class can't have any abstract methods inside its class
                                  //Extends Needed
public class simpleAbstractLion extends parentClass {

	public static void main(String[] args) {
		simpleAbstractLion obj = new simpleAbstractLion();
		obj.sound();
	}

	@Override
	public void sound() {
		System.out.println("Lion will Roar");
		
	}

}
//Lets say we have a class Animal that has a method sound() and the subclasses(see inheritance) of it like Dog, Lion, Horse, Cat etc.
//Since the animal sound differs from one animal to another, there is no point to implement this method in parent class.
//This is because every child class must override this method to give its own implementation details, like Lion class will say “Roar” in this method and Dog class will say “Woof”.
//So when we know that all the animal child classes will and should override this method, then there is no point to implement this method in parent class.
//Thus, making this method abstract would be the good choice as by making this method abstract 
//we force all the sub classes to implement this method( otherwise you will get compilation error), also we need not to give any implementation to this method in parent class.
//Since the Animal class has an abstract method, you must need to declare this class abstract.
//Now each animal must have a sound, by making this method abstract we made it compulsory to the child class to give implementation details to this method.
//This way we ensures that every animal has a sound.


//Note 2: Abstract class cannot be instantiated which means you cannot create the object of it. 
//To use this class, you need to create another class that extends this this class and provides the implementation of abstract methods, 
//then you can use the object of that child class to call non-abstract methods of parent class as well as implemented methods(those that were abstract in parent but implemented in child class).


/**
Key Points:

An abstract class has no use until unless it is extended by some other class.
If you declare an abstract method in a class then you must declare the class abstract as well. 
you can’t have abstract method in a concrete class.
It’s vice versa is not always true: If a class is not having any abstract method then also it can be marked as abstract.
It can have non-abstract method (concrete) as well.
I have covered the rules and examples of abstract methods in a separate tutorial, You can find the guide here: Abstract method in Java
For now lets just see some basics and example of abstract method.
1) Abstract method has no body.
2) Always end the declaration with a semicolon(;).
3) It must be overridden. An abstract class must be extended and in a same way abstract method must be overridden.
4) A class has to be declared abstract to have abstract methods.
**/