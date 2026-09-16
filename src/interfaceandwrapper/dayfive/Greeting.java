package interfaceandwrapper.dayfive;

public class Greeting {

	public static void main(String[] args) {
	    // Creating an implementation of the functional interface GreetingsDemo using a lambda expression.
	    // () means the greet() method takes NO parameters.
		
		GreetingsDemo gd = () -> {
			

	        // Code that will execute when greet() is called
			System.out.println("Hello All! Welcome to the session.");
		};
		
		
		   // Calling the greet() method.
	    // This executes the code written inside the lambda expression.
		gd.greet();
		
	}

}
