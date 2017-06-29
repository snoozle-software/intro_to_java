package methodsLesson;

/***
 * 
 * @author greg
 * 
 */
import java.util.Random;

public class Methods {

	/***
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		random1();
		random1();
		random1();
		
		int min = 1;
		int max = 10;
		
		random2(min,max);
		random2(min,max);
		
		int rand1 = random3(min, max);
		int rand2 = random3(min, max);
		
		System.out.println("Rand1 = " + rand1);
		System.out.println("Rand2 = " + rand2);

	}
	
	public static int random3(int min, int max)
	{
		Random rand = new Random();
		int randomNum = rand.nextInt(max - min) + min;
		
		return randomNum; 
	}
	
	/***
	 * Description: generates a random number between min and max
	 * @param min
	 * @param max
	 */
	public static void random2(int min, int max)
	{
		Random rand = new Random();
		int randomNum = rand.nextInt(max - min) + min;
		System.out.println("Random number 2 " + randomNum);
	}
	
	/***
	 * A basic random function
	 */
	public static void random1()
	{
		int maxVal = 100;
		Random rand = new Random();
		System.out.println("Random number" + rand.nextInt(maxVal));
	}
	
	

}
