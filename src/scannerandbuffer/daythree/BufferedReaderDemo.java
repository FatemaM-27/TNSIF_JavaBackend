package scannerandbuffer.daythree;

import java.io.BufferedReader;  // BufferedReader is used to read text efficiently from an input source
import java.io.InputStreamReader; // InputStreamReader converts the byte input from System.in into characters

public class BufferedReaderDemo {
	public static void main(String[] args) throws Exception {
		
		// System.in represents the standard input (usually the keyboard)
        // InputStreamReader converts the byte stream from System.in into a character stream.
        // BufferedReader allows us to read the input efficiently and provides methods such as readLine().
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter your name: ");
		// readLine() reads the complete line entered by the userand stores it as a String.
		String name = br.readLine();
		
		 // Display the name entered by the user
		System.out.println("Welcome "+name);
		
		

	}

}
