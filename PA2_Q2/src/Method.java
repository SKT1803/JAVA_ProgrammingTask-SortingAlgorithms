//-----------------------------------------------------
// Title: Method Class
// Author: Serdar Kemal Topkaya
// ID: 71200082370
// Section: 3
// Assignment: 2
// Description: In this class, our goal is to sort an array with certain initial values 
// by selecting any of the 4 different sorting algorithms (Merge, Quick, Selection, Insertion) 
// After sorting, we print the smallest pairwise absolute difference of this array using the 
// pairwiseDifference method that we wrote with O(n) time complexity.
//-----------------------------------------------------
import java.util.Scanner;

public class Method {
/*
	public static void main(String[] args)
	// --------------------------------------------------------
	// Summary: In this method, to sort an array with certain initial values, 
	// it allows us to sort with four different sort types, namely merge, quick , selection and insertion
	// and to print the smallest pairwise absolute difference of this array, 
	// it calls the pairwiseDifference method.
	// --------------------------------------------------------
	{
         
		Scanner scan = new Scanner(System.in);
		
		// This part for, when we input from user for array values.
		String input = scan.nextLine();
		
		String[] arrToInt = input.split(", ", input.length()-1);
		
		
		Integer[] arr1 = new Integer[arrToInt.length];
		for(int i = 0; i< arr1.length;i++) {
			arr1[i] = Integer.parseInt(arrToInt[i]);
		}
		
		
		Integer[] array = { 113, 23, 1, 109, 4, 102, 7, 105, 100, 107 };
		System.out.println("Enter the sort you want to use:");
       
		do {

			String choosing = scan.nextLine();

			if (choosing.equalsIgnoreCase("selection")) {

				Selection.sort(array);
				System.out.println(pairwiseDifference(array));

				break;
			} else if (choosing.equalsIgnoreCase("insertion")) {

				Insertion.sort(array);
				System.out.println(pairwiseDifference(array));

				break;
			} else if (choosing.equalsIgnoreCase("merge")) {
				Merge.sort(array);
				System.out.println(pairwiseDifference(array));
				break;
			} else if (choosing.equalsIgnoreCase("quick")) {
				Quick.sort(array);
				System.out.println(pairwiseDifference(array));
				break;
			} else {
				System.out.println("Enter a valid sorting algorithm");
				break;
			}

		} while (true);
    
      }
*/
	public Method(String sortOption, Integer[] array) 
	// --------------------------------------------------------
	// Summary: Constructor method of Method class. This method sorts the array it takes 
	// as a parameter with the sort option it takes as a parameter. After that, to print the
	// smallest pairwise absolute difference of this array, it calls the pairwiseDifference method.
	// Precondition: sortOption is a String, arr is an integer array
	// --------------------------------------------------------
	{

		if (sortOption.equalsIgnoreCase("selection")) {

			Selection.sort(array);
			System.out.println(pairwiseDifference(array));

		} else if (sortOption.equalsIgnoreCase("insertion")) {

			Insertion.sort(array);
			System.out.println(pairwiseDifference(array));

		} else if (sortOption.equalsIgnoreCase("merge")) {
			Merge.sort(array);
			System.out.println(pairwiseDifference(array));

		} else if (sortOption.equalsIgnoreCase("quick")) {
			Quick.sort(array);
			System.out.println(pairwiseDifference(array));

		}

	}

	public static String pairwiseDifference(Integer[] array) 
	// --------------------------------------------------------
	// Summary: Takes a sorted array of n integers and prints the smallest pairwise absolute difference 
	// between them along with the corresponding pair of numbers. In order to find the difference,
	// We must write a code that has O(n) time complexity. In this code, first, calculate the difference 
	// of the first two terms in the array, then assign this value to the initialMinDifference. After that,
	// I aim to find the absolute minimum value by comparing the minDifference value that I created as 0 at 
	// the beginning and the initialMindiffence value inside the if else structures.
	// Precondition: arr is an integer array.
	// --------------------------------------------------------
	{

		int size = array.length;
		int minDifference = 0;

		String result = null;

		int initialMinDifference = Math.abs(array[1] - array[0]);

		int a = 0; // When we show the result, it stores the first number. (Example, [2 6], 2 is the first number.)
		int b = 1; // When we show the result, it stores the second number.(Example, [2 6], 6 is the second number.)
		for (int i = 1; i < size - 1; i++) {

			minDifference = Math.abs(array[i] - array[i + 1]);

			if (minDifference < initialMinDifference) {
				result = minDifference + "";
				initialMinDifference = minDifference;
				a = i;
				b = i + 1;

			} else if (minDifference > initialMinDifference) {

				result = initialMinDifference + "";

			} else if (minDifference == initialMinDifference) {

				if ((array[a] + array[b]) < (array[i] + array[i + 1])) {

					result = minDifference + "";

				} else {
					result = minDifference + "";
					a = i;
					b = i + 1;

				}

			}

		}
		return result + " [" + array[a] + " " + array[b] + "]";

	}

}
