package scannerandbuffer.daythree;

import java.util.Scanner;

public class ScannerDemo {
public static void main(String[] args) {
		
	// Create a Scanner object to take input from the keyboard.
    // System.in represents the standard input (keyboard).
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter college name: ");
		 // nextLine() reads the complete line entered by the user.
        // It can read spaces as well.
		String name = sc.nextLine();
		
		System.out.println("Enter counselling code: ");
		 // nextInt() reads an integer value from the user.
		int code = sc.nextInt();
		
		System.out.println("The college name is: "+ name + " and the counselling code is: "+code);
 
		// Closes the Scanner and releases the input resource.
        // It is good practice to close the Scanner when it is no longer needed.
        // However, closing it also closes System.in.
		sc.close();
	}

}
