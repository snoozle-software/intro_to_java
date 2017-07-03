package arraysLesson5;

public class Arrays {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int[] myIntArray = {10, 20, 30, 40, 50};
		
		printArray(myIntArray);
		
		int[] myIntArrayNew = new int[5];
		myIntArrayNew[0] = 11;
		myIntArrayNew[1] = 21;
		myIntArrayNew[2] = 31;
		myIntArrayNew[3] = 41;
		myIntArrayNew[4] = 51;
		
		printArray(myIntArrayNew);

	}

	/**
	 * 
	 * @param myIntArray
	 */
	private static void printArray(int[] myIntArray) {
		for(int ii = 0; ii < myIntArray.length; ii++)
		{
			
			System.out.println("Array["+ii+"] = " + myIntArray[ii]);
			
		}
	}

}
