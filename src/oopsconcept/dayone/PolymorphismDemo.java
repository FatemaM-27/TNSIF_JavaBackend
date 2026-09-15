package oopsconcept.dayone;


//Method Overloading - compile-time polymorphism

//Method overloading means having multiple methods
//with the SAME method name but DIFFERENT parameters.
class MathOp{
	
	public int add(int a, int b) {
		return a + b;
	}
	
    // add() has the same name but takes a float and an int

	public float add(float a, int b) {
		return a + b;
	}
}


//Method Overriding -runtime polymorphism
class Animal{
	 // This method will be overridden by the child class
	void sound() {
		System.out.println("The sound is not declared");
	}
}


class Cat extends Animal{
	
	// Cat provides its own implementation of the sound() method
	 // The method has the same name and same parameters
	public void sound() {
		System.out.println("The cat is meowing.......");
	}
}


public class PolymorphismDemo {
	
	

	public static void main(String[] args) {
		
		MathOp mo = new MathOp();
		System.out.println(mo.add(10, 20));
		System.out.println(mo.add(25.5f, 10));
		
		Cat c = new Cat();
		c.sound();
		

	}

}
