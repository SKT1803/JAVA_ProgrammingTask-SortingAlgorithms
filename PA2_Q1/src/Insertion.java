//-----------------------------------------------------
// Title: Insertion Class
// Author: Serdar Kemal Topkaya
// ID: 71200082370
// Section: 3
// Assignment: 2
// Description: This class sorts the arrays, that taken as parameters, using Insertion sort.
//-----------------------------------------------------
public class Insertion {

	public static void sort(Comparable[] a)
	// --------------------------------------------------------
	// Summary: It sorts the array, that taken as parameter, in increasing order.
	// Precondition: a is a Comparable array.
	// --------------------------------------------------------
	{
		int N = a.length;
		for (int i = 0; i < N; i++)
			for (int j = i; j > 0; j--)
				if (less(a[j], a[j - 1]))
					exch(a, j, j - 1);
				else
					break;
	}

	public static void sortDecreasing(Comparable[] a)
	// --------------------------------------------------------
	// Summary: It sorts the array, that taken as parameter, in decreasing order.
	// Precondition: a is a Comparable array.
	// --------------------------------------------------------
	{
		int N = a.length;
		for (int i = 0; i < N; i++)
			for (int j = i; j > 0; j--)
				if (greater(a[j], a[j - 1]))
					exch(a, j, j - 1);
				else
					break;
	}

	private static boolean less(Comparable v, Comparable w)
	// --------------------------------------------------------
	// Summary: In order to sort the array in increasing order,
	// this method is used.
	// Precondition: v is a Comparable objects, w is a Comparable objects.
	// --------------------------------------------------------
	{
		return v.compareTo(w) < 0;
	}

	private static boolean greater(Comparable v, Comparable w)
	// --------------------------------------------------------
	// Summary: In order to sort the array in decreasing order,
	// this method is used.
	// Precondition: v is a Comparable objects, w is a Comparable objects.
	// --------------------------------------------------------
	{
		return v.compareTo(w) > 0;
	}

	private static void exch(Comparable[] a, int i, int j)
	// --------------------------------------------------------
	// Summary: It swaps two values in the array in order to sort the array.
	// Precondition: a is an Comparable array, i is an integer, j is a integer.
	// --------------------------------------------------------
	{
		Comparable swap = a[i];
		a[i] = a[j];
		a[j] = swap;
	}

}
