package interfaceandwrapper.dayfive;


//An interface is used to define a contract.
//A class that implements this interface must provide an implementation for its abstract methods.
interface Demo{      // Variables declared inside an interface are automatically:public + static + final

	//final static 
	//int a = 10;
	
	//public abstract 
	// Methods in an interface are automatically:public + abstract
	void display();
	
	//void show();
	
}// A class uses the 'implements' keyword to implement an interface.
class Demo_Class implements Demo{
	
	public void display() {   // Since display() is abstract in Demo,we must provide its implementation here.
		// The method must be public because the interface method is public by default.
		
		System.out.println("Implementing the Demo");
	}
	
	
}

public class InterfaceDemo {

	public static void main(String[] args) {
		
		Demo_Class dc = new Demo_Class();
		dc.display();
		

	}

}
