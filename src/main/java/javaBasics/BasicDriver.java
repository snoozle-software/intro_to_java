/**
 * 
 */
package javaBasics;

/**
 * @author Greg Wagner- Snoozle Learning
 * Created June 23, 2017
 * 
 * This program will read in two number add them to together
 * and right them back out
 */
import java.util.Scanner;

public class BasicDriver {

	/**
	 * @param args
	 * 
	 * Program driver
	 */
	public static void main(String[] args) {
		// initializing the scanner class
		Scanner scanner = new Scanner(System.in);
		
		// Prompt user to read in value
		System.out.println("Enter an integer: ");
		int integer1 = scanner.nextInt();
		
		System.out.println("Enter another integer: ");
		int integer2 = scanner.nextInt();
		
		scanner.close();
		
		int sumValue = integer1 + integer2;
		
		System.out.println("The sum of the values is " + sumValue);
		

	}

}
