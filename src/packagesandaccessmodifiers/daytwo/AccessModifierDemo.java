package packagesandaccessmodifiers.daytwo;

public class AccessModifierDemo {
	  // Can be accessed from anywhere in the program
	public int publicVar = 10;
	
	// Can be accessed only inside this class
	private int privateVar = 20; //instance variable
	 
	
	// Can be accessed within the same package
    // and also by subclasses in other packages
	protected int protectedVar = 30;
	
	 // No access modifier is written.
    // Can be accessed only within the same package.
	int defaultVar = 40;

	public static void main(String[] args) {
		
		AccessModifierDemo amd = new AccessModifierDemo();
		System.out.println(amd.publicVar); // Accessible because it can be accessed from anywhere
		System.out.println(amd.privateVar);  // Accessible here because main() is inside the same class
		System.out.println(amd.protectedVar);  // Accessible because we are inside the same class
		System.out.println(amd.defaultVar);    // Accessible because we are inside the same class
			
		
	}

}
