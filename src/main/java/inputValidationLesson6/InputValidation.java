package inputValidationLesson6;

import java.util.Scanner;
import java.util.InputMismatchException;

public class InputValidation {

	/**
	 * Description: weekly wage calculator
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		try
		{
			float minWage = 10.00f; // AZ min wage
			float maxWage = 18.50f;
			float wage = 0.0f;
			do{
				System.out.print("Enter your wage: ");
				wage = scanner.nextFloat();
				if((wage < minWage) || (wage > maxWage))
				{
					System.out.println("Invalid wage. Try again");
				}
			}while((wage < minWage) || (wage > maxWage));
			
			float minHours = 0.00f;
			float maxHours = 40.00f;
			float hours = 0.0f;
			do{
				System.out.print("Enter your hours: ");
				hours = scanner.nextFloat();
				if((hours < minHours) || (hours > maxHours))
				{
					System.out.println("Invalid hours. Try again");
				}
			}while((hours < minHours) || (hours > maxHours));
			String payString = String.format("Your weekly pay is $%.2f",
					hours * wage);
			System.out.println(payString);
		}
		catch(InputMismatchException e)
		{
			System.out.println("Totally invalid input values." + 
		                        "Closing program");
		}
		
		scanner.close();
		
		
		
	}

}
