/**
 * 
 */
package flowControlLesson2;

/**
 * @author greg
 *
 */
public class FlowControl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// example 1: boolean opertators
		boolean test1 = false;
		System.out.println("test1:"+test1);
		int val1 = 3;
		int val2 = 2;
		boolean test2 = val1 == val2; // false
		System.out.println("val1 == val2 = "+test2);
		boolean test3 = val1 < val2; // false
		System.out.println("val1 < val2 = "+test3);
		boolean test4 = val1 > val2; // true
		System.out.println("val1 > val2 = "+test4);
		
		// example2: logical operators && || !
		boolean test5 = test2 && test4; // false because test2 is false
		System.out.println("test2 && test4 = "+test5);
		boolean test6 = test2 || test4; // true because test4 is true
		System.out.println("test2 || test4 = "+test6);
		System.out.println("!test1 = " + !test1);
		
		// example3: if-then-else
		if(val1 < val2) // val1 = 3 val2 = 2
		{
			System.out.println("Val1 is less than Val2");
		} // if(val1 != val2)
		else if(val1 > val2)
		{
			System.out.println("Val1 is greater than Val2");
		}
		else
		{
			System.out.println("Val1 is equal to Val2");	
		}
		
		// example4: switch-case
		String name = "Aasdfasdf";
		switch(name)
		{
		case "Greg":
			System.out.println("Your name is awesome!");
			break;
			
		case "Kyle":
			System.out.println("This is name is OK");
			break;
			
		case "Bear":
			System.out.println("This is my dogs name");
			break;
			
		default:
			System.out.println("Your name is blah");
			break;
		}

	}

}
