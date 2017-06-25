package javaBasics;

public class Repetitions {

	public static void main(String[] args) {
		
		// pre-condition loop
		int counter = 0;
		System.out.println("While Loop");
		while(counter < 25)
		{
			System.out.println(counter);
			counter += 5; // counter = counter + 5;
		}
		
		// post-condition loop
		counter = 5;
		System.out.println("Do loop");
		do
		{
			System.out.println(counter);
			counter += 5; // counter = counter + 5;
		}while(counter < 30);

		// iterative loop
		System.out.println("For loop");
		for(int ii = 0; ii<20; ii++)
		{
			System.out.println(ii);
		}
		
	}

}
