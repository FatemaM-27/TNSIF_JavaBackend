package oopsconcept.dayone;

//Single Inheritance
// parent class
class Parent{
	
	void single() {
		System.out.println("This is single inheritance");
	}
}

//Child class inherits the properties and methods of Parent
//'extends' is used to achieve inheritance in Java
class Child extends Parent{
	
	void child() {
		System.out.println("This is child single inheritance");
	}
	
}

class Animals{
	
	String name;
	
	//constructor
	
	Animals(String name){
		this.name = name;
	}
	
	 // Method to display animal name
	void display() {
		System.out.println("Animal name: "+name);
	}
}

class Dog extends Animals {
	
	String breed;
	
	// 'super(name)' calls the constructor of the parent class
    // It passes the name value to Animals constructor
	Dog(String breed, String name){
		super(name);
		
    // 'this.breed' refers to the current class variable
		this.breed = breed;
	}
	
	void show() {
		display();  // Calling the display() method inherited from Animals
		System.out.println("Dog breed: "+breed);
	}
	
}


//Multilevel

//GrandParent is the top-level parent class
class GrandParent{
	void gp() {
		System.out.println("This is grand parent class");
	}
}

class Parent_01 extends GrandParent{
	void p() {
		System.out.println("This is parent class");
	}
}


//Child_01 inherits from Parent_01
//Therefore, Child_01 indirectly gets the method of GrandParent too
class Child_01 extends Parent_01{
	void c() {
		System.out.println("This is child class");
	}
}

//Hierarchical Inheritance

class Fruits {
	
	void sweet() {
		System.out.println("The fruits are sweet");
	}
}

//Apple inherits from Fruits
class Apple extends Fruits {
	
	void red() {
		System.out.println("The apples are sweet");
	}
}

//Mango also inherits from Fruits
//Both Apple and Mango have the same parent: Fruits
class Mango extends Fruits {
	
	void yellow() {
		System.out.println("The mangoes are sweet");
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {
		
		
		Child c = new Child();
		c.child();   // Calling Child's own method
		c.single();  // Calling the inherited method from Parent
		
		Child_01 c1 = new Child_01();
		c1.c();
		c1.gp();
		c1.p();
		
		Apple a = new Apple();
		a.red();
		a.sweet();
		
		Mango m = new Mango();
		m.sweet();
		m.yellow();
		
		
		 // Creating a Dog object
        // "Husky" is passed as breed
        // "Jack" is passed as name
		Dog d = new Dog("Husky","Jack");
		d.show();   // show() internally calls the inherited display() method
		
		

	}

}
