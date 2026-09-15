package oopsconcept.dayone;

abstract class Shape{ //general class cannot make an object only using this specific class. 
	abstract void draw(); //declaration; every shape must implement this method.
	
	//abstract methods,normal methods,variables,constructors
	void sketch() {}
}


class Circle extends Shape{  //circle is the subclass and inherits properties from the Shape
	void draw() {
		System.out.println("Drawing a Circle..");
	}
}
class Rectangle extends Shape{
	void draw() {
		System.out.println("This is a rectangle");
	}
}

public class AbstractionDemo {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.draw(); //calling the method using object reference
		
		Shape s = new Circle(); //treated as Shape class 
		s.draw();
		
		Shape s1= new Rectangle();
		s1.draw();
	}
}


