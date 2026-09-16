package exceptionhandling.daysix;

import java.util.Scanner;

//Custom exception class.
//We extend Exception to create our own checked exception.
@SuppressWarnings("serial")
class InsufficientBalanceException extends Exception {

	  // Constructor receives the error message and passes it to the parent Exception class.
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class ATM {
	
	 // This method can throw our custom exception,so we declare it using the 'throws' keyword.

    static void withdraw(double balance, double amount)
            throws InsufficientBalanceException {
    	  // Check whether the withdrawal amount is valid.
        if (amount <= 0) {
        	  // IllegalArgumentException is a built-in Java exception
            throw new IllegalArgumentException("Invalid withdrawal amount");
        }
        // Check whether the requested amount is greater than the available balance.
        if (amount > balance) {
        	//Throw our custom exception
            throw new InsufficientBalanceException(
                    "Insufficient balance!"
            );
        }
//Executes when there's no exception
        System.out.println("Withdrawal successful!");
        System.out.println("Remaining Balance: ₹" + (balance - amount));
    }

    public static void main(String[] args) {
//Take input from the user
        Scanner sc = new Scanner(System.in);
//Initial amount balance
        double balance = 5000;
        // try block contains code that might cause an exception.
        try {
            System.out.print("Enter withdrawal amount: ");
            // Read the withdrawal amount.
            double amount = sc.nextDouble();
            // Call the withdraw() method.
            withdraw(balance, amount);
            // Handles our custom InsufficientBalanceException.
        } catch (InsufficientBalanceException e) {
        	
            // getMessage() returns the message passedwhen the exception was created.
            System.out.println("Error: " + e.getMessage());
           
            // Handles invalid withdrawal amounts such as zero or negative values.
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());


            // Handles any other unexpected exception, such as entering text instead of a number.
        } catch (Exception e) {
            System.out.println("Invalid input!");
            
           // finally always executes whether an exception occurs or not.
        } finally {
            System.out.println("Thank you for using the ATM.");
            sc.close();
        }
    }
}
