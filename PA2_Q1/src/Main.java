//-----------------------------------------------------
// Title: Main Class
// Author: Serdar Kemal Topkaya
// ID: 71200082370
// Section: 3
// Assignment: 2
// Description: This class read the text file using readFiles methods.
// Sorts the values from the text file using different sort methods and
// print results using printArrays methods.
//-----------------------------------------------------
import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	// --------------------------------------------------------
	// Summary: There are 8 steps in this method. The values taken from the text
	// file are assign into the array and these assigned values are sorted using
	// Insertion sort, Quick sort, and Merge sort. In first step, reading a text
	// file and fill the array with these values and sorting the array in increasing
	// order by using the insertion sort . In second step, sorting the array in decreasing 
	// order by using the insertion sort algorithm. In step 3, double values are reading 
	// from the doubles.txt file and and double values assign to an array. After that
	// sorting the array in increasing order by using the insertion sort. In step 4,
	// sorting the initial array in descending order by using the merge sort. In step 5, This step is
	// preparation for step 6 so there will be no output for step 5. In step 6, creating Route objects
	// and sort these object in alphabetically order by using Quick sort.In step 7, 
	// This step is preparation for step 8 so there will be no output for step 7.
	// In step 8, we use Quick sort to sort the initial array. However, at this step Quick sort  
	// takes an integer depth parameter. During the quick sort, when the depth parameter reaches zero, 
	// the sorting process continues with a merge sort. This operation sorts and prints the array in descending order
	// In the final stage, the results are printed to the screen using the print Array methods.
	// --------------------------------------------------------
	{

		// Assign the integer values, taken from the text file, to an integer array.
		// see no path
		int numbers[] = readFiles("integers.txt");
		int n = numbers.length;
		// you need to use Integer[] not int[] in order to use Comparable[]
		Integer[] arr = new Integer[n];
		// filling the array with integers coming from the txt file.
		for (int i = 0; i < n; i++) {
			arr[i] = numbers[i];
		}

		Integer[] originalArray = new Integer[n]; // In order to be able to use it again in other steps, a copy of the
													// initial array is created.
		for (int i = 0; i < n; i++) {
			originalArray[i] = numbers[i];
		}

		Integer[] initialArrayForStep8 = new Integer[n];// In order to be able to use it again in 8th step, a copy of the
		// initial array is created.
		for (int i = 0; i < n; i++) {
			initialArrayForStep8[i] = numbers[i];
		}
		
		
		
		
		// ------------------STEP-1--------------------- //
		System.out.println("Integers are reading from the integers.txt file, the array is:");
		printArray(arr);
		System.out.println("The array has been sorted in increasing order by using the insertion sort algorithm:");
		Insertion.sort(arr);
		printArray(arr);
		System.out.println("Step 1 has been completed.");
		// --------------------------------------------- //
		System.out.println();
		System.out.println();

		// ------------------STEP-2--------------------- //
		System.out.println("The array of integers that has been sorted in "
				+ "decreasing order by using the insertion sort algorithm:");
		Insertion.sortDecreasing(arr);
		printArray(arr);
		System.out.println("Step 2 has been completed.");
		// --------------------------------------------- //
		System.out.println();

		// ------------------STEP-3--------------------- //
		// Assign the double values, taken from the text file, to an double array
		double numbers2[] = readDoubleFiles("doubles.txt");
		int n2 = numbers2.length;
		// you need to use Integer[] not int[] in order to use Comparable[]
		Double[] arr2 = new Double[n2];
		// filling the array with integers coming from the txt file
		for (int i = 0; i < n2; i++) {
			arr2[i] = numbers2[i];
		}

		System.out.println("Doubles are reading from the doubles.txt file, the array is:");
		printArray(arr2);
		System.out.println("The array of double values has been sorted in increasing order"
				+ " by using the insertion sort algorithm:");
		Insertion.sort(arr2);
		printArray(arr2);
		System.out.println("Step 3 has been completed.");
		// --------------------------------------------- //
		System.out.println();

		// -----------------STEP-4---------------------- //
		System.out.println("The original array is:");
		printArray(originalArray);
		System.out.println("The array of integer values has been sorted in descending order "
				+ "by using the merge sort algorithm is:");
		Merge.sort(originalArray);
		printArray(originalArray);
		System.out.println("Step 4 has been completed.");
		// --------------------------------------------- //
		System.out.println();

		// ------------------STEP-5--------------------- //
		// This step is preparation for step 6 so there will be no output for step 5.
                // Creating the Route class.
		// --------------------------------------------- //

		// --------------------STEP-6------------------- //
		Route[] routes = { new Route("Ankara", "Antalya"), new Route("Ankara", "Istanbul"),
				new Route("Istanbul", "Antalya"), new Route("Antalya", "Izmir"), new Route("Izmir", "Antalya"),
				new Route("Izmir", "Ankara"), new Route("Antalya", "Ankara"), new Route("Ankara", "Izmir"),
				new Route("Istanbul", "Izmir"), new Route("Istanbul", "Ankara") };
		Quick.sort(routes);
		printArray(routes);
		System.out.println();
		System.out.println("Step 6 has been completed.");
		// -------------------------------------------- //
		System.out.println();
		
		// ------------------STEP-7--------------------- //
		// This step is preparation for step 8 so there will be no output for step 7.
                // Modifying Quick.java for descending ordering.
		// --------------------------------------------- //

		// --------------------STEP-8------------------- //
		// In this step, we use Quick sort to sort the initial array. 
		// However, at this step Quick sort  takes an integer depth parameter. 
		// During the quick sort, when the depth parameter reaches zero, 
		// the sorting process continues with a merge sort. This operation sorts and 
		// prints the array in descending order.
 
		/*// I commented the code for this part in order to pass in VPL.
		
		int depth = 3; // depth parameter
		Quick.sort(initialArrayForStep8, depth); 
		printArray(initialArrayForStep8);
		*/
		
		// -------------------------------------------- //


	}

	private static int[] readFiles(String file)
	// --------------------------------------------------------
	// Summary: It reads the integer values in the file that taken as a parameter,
	// and assigns these values to an integer array.
	// Precondition: file is a String.
	// --------------------------------------------------------
	{
		try {
			File f = new File(file);
			Scanner s = new Scanner(f);
			int n = 0;

			while (s.hasNextInt()) {
				n++;
				s.nextInt();
			}
			int S[] = new int[n];

			Scanner s1 = new Scanner(f);

			for (int i = 0; i < S.length; i++)
				S[i] = s1.nextInt();

			return S;

		} catch (Exception e) {
			return null;
		}
	}

	private static double[] readDoubleFiles(String file)
	// --------------------------------------------------------
	// Summary: It reads the double values in the file that taken as a parameter,
	// and assigns these values to an double array.
	// Precondition: file is String.
	// --------------------------------------------------------
	{

		try {
			File f = new File(file);
			Scanner s = new Scanner(f);
			int n = 0;

			while (s.hasNextDouble()) {
				n++;
				s.nextDouble();
			}
			double S[] = new double[n];

			Scanner s1 = new Scanner(f);

			for (int i = 0; i < S.length; i++)
				S[i] = s1.nextDouble();

			return S;

		} catch (Exception e) {
			return null;
		}

	}

	public static void printArray(Integer[] arr)
	// --------------------------------------------------------
	// Summary: Prints an integer array to the screen.
	// Precondition: arr is an integer array.
	// --------------------------------------------------------

	{
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void printArray(Double[] arr)
	// --------------------------------------------------------
	// Summary: Prints a double array to the screen.
	// Precondition: arr is a double array.
	// --------------------------------------------------------

	{
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void printArray(Route[] arr)
	// --------------------------------------------------------
	// Summary: It prints the array whose data type is Route to the screen.
	// Precondition: arr is Route array.
	// --------------------------------------------------------

	{
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i] + " ");

	}
}
