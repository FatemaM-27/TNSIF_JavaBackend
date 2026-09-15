package nonaccessmodifier.dayfour;

public class StaticDemo {
	static int count; //static variable
	  // Only ONE copy of this variable is created for the entire class.
	int data; 
    // Instance variable
    // Every object of the class gets its own copy of this variable.
	
	
	static { //static block
	    // It executes automatically when the class is loaded,before the main() method starts.
		count = 25;
		
		// This is NOT allowed here because data is an instance variable.
        // A static block cannot directly access a non-static variable.
		//data = 10;
		System.out.println("This is static count");
		
	}
	
	
	static void display() {
		
		 // Static method
	    // It belongs to the class rather than to an individual object.
		System.out.println("The static variable count is: "+count);
		 // A static method can directly access static variables.
	}
	

	public static void main(String[] args) {
		
		System.out.println("This is main method");
		
		// Calling the static method directly.
        // No object is required because display() is static.
		display();
		

	}
}

// the static block runs first because Java initializes the class before executing main().