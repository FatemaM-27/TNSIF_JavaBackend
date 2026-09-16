package interfaceandwrapper.dayfive;

public class WrapperClassDemo {
public static void main(String[] args) {
	 // Autoboxing:
    // Converting a primitive value into its corresponding wrapper class object.
    // int → Integer
		 
		int a = 10;
		
		Integer b = a;
		
		System.out.println(b);
		
		 // Unboxing:
	    // Converting a wrapper class object into its corresponding primitive value.
	    // Integer → int
		
		Integer c = 20;
		
		int d = c;  // Java automatically converts Integer to int
		
		System.out.println(d);

	}

}
