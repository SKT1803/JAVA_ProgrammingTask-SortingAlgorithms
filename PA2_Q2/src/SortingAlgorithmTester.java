//-----------------------------------------------------
// Title: SortingAlgorithmTester Class
// Author: Serdar Kemal Topkaya
// Description: In this class, we create three arrays of three different types.(Random, increasing, decreasing)
// After that, we are making experimental run time analysis of these arrays in the four different settings 
// where in each setting we are going to use different sorting algorithms (Selection, Insertion, Merge, Quick)
// and different array sizes.
//-----------------------------------------------------

import java.util.Random;
import java.util.Scanner;

public class SortingAlgorithmTester {

	public static void main(String[] args)
	// --------------------------------------------------------
	// Summary: In this method, we create a random array using the seed value we get from the user.
	// Next, we sort this random array using merge sort to get an increasing type of array. 
	// After that, we use the reverseArray method to get a decreasing type array. After obtaining the arrays, 
	// we call the timeCalculator method to making run time analysis of these arrays in five different input 
	// values and four different sorts.
	// --------------------------------------------------------
	{

		int[] sizes = { 250, 1000, 4000, 16000, 64000 }; // sizes of array

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a seed to create random generated values : ");

		int seed = scan.nextInt();
		System.out.print("Seed : " + seed);
		scan.nextLine();
		System.out.println();

		Random rnd = new Random(seed); // creating Random object
		for (int j = 0; j < sizes.length; j++) 
		// in this for, we try the 5 different input sizes.	
		{

			System.out.print("Input size: " + sizes[j]);
			System.out.println();
			System.out.println();

			Integer[] arrayRandom = new Integer[sizes[j]];
			for (int i = 0; i < arrayRandom.length; i++) 
				// Creating random integer array with respect to given seed.
			{
				arrayRandom[i] = rnd.nextInt(); 
			}

			Merge.sort(arrayRandom); // To create ascending array, random array is sorted in increasing order.
			Integer[] arrayAscending = arrayRandom; // Ascending array

			Integer[] arrayDescending = reverseArray(arrayAscending); // To create descending array, ascending array is reversed.

			String[] sortOptions = {"selection", "insertion", "merge", "quick"}; // Options that we will use to calculate time. 
			
			
			for(int i = 0; i< sortOptions.length; i++) {
				
			System.out.println("Sort option: " +sortOptions[i]);
			System.out.println("Random");
			timeCalculator(sortOptions[i], arrayRandom);
			System.out.println("Ascending");
			timeCalculator(sortOptions[i], arrayAscending);
			System.out.println("Descending");
			timeCalculator(sortOptions[i], arrayDescending);
			System.out.println();
		    }	
		}

	}

	public static Integer[] reverseArray(Integer[] arr)
	// --------------------------------------------------------
	// Summary: It reverses and returns the array taken as a parameter.
	// Precondition: arr is an Integer array.
	// --------------------------------------------------------
	{

		Integer[] arrayDescending = new Integer[arr.length];
		int k = 0;
		for (int i = arr.length - 1; i >= 0; i--) {

			arrayDescending[k] = arr[i];
			k++;
		}

		return arrayDescending;

	}

	public static void timeCalculator(String option, Integer[] arr)
	// --------------------------------------------------------
	// Summary: In this method, while sorting the array which taken as a parameter, 
	// with the sort option, which taken as a parameter, we create 3 arrays and we calculate the elapsed time 
	// while this sorting process takes places. We call the Constructor method of 
	// Method class to sort the array with desired sorting algorithm and prints the 
	// smallest pairwise absolute difference between them along with the corresponding pair of numbers.
	// Precondition: option is a String, arr is an Integer array.
	// --------------------------------------------------------
	{

		Long[] times = new Long[3];
		for (int j = 0; j < 3; j++) {
			Long t1 = System.currentTimeMillis();
			Method m = new Method(option, arr);
			Long t2 = System.currentTimeMillis();
			times[j] = t2 - t1;
		}
		//System.out.println("Time: " + times[1]); // In here, print the elapsed time, but in the VPL expected output
		                                            // does not have elapsed time, so I commented this part.

	}

}
