//-----------------------------------------------------
// Title: Quick Class
// Author: Serdar Kemal Topkaya
// ID: 71200082370
// Section: 3
// Assignment: 2
// Description: This class sorts the arrays, that taken as parameters, using Quick sort.
//-----------------------------------------------------

public class Quick {
	private static int partition(Comparable[] a, int lo, int hi)
	// --------------------------------------------------------
	// Summary: It partitions the array taken as a parameter.
	// Precondition: a is a Comparable array, lo is an integers, hi is an integer.
	// --------------------------------------------------------
	{
		int i = lo, j = hi + 1;
		while (true) {
			while (less(a[++i], a[lo]))
				if (i == hi)
					break;
			while (less(a[lo], a[--j]))
				if (j == lo)
					break;
			if (i >= j)
				break;
			exch(a, i, j);
		}
		exch(a, lo, j);
		return j;

	}

	public static void sort(Comparable[] a)
	// --------------------------------------------------------
	// Summary: It shuffles the array that taken as a parameter.
	// Precondition: a is a Comparable array.    
	// --------------------------------------------------------
	{
		StdRandom.shuffle(a);
		sort(a, 0, a.length - 1);
	}

	private static void sort(Comparable[] a, int lo, int hi)
	// --------------------------------------------------------
	// Summary: It sorts the array, that taken as parameter.
	// Precondition: a is a Comparable array, lo is an integers, hi is an integer.
	// --------------------------------------------------------
	{
		if (hi <= lo)
			return;
		int j = partition(a, lo, hi);
		sort(a, lo, j - 1);
		sort(a, j + 1, hi);
	}
	
	public static void sort(Comparable[] a, int depth)
	// --------------------------------------------------------
	// Summary: Same method as other sorts, we take integer depth parameter to solve step 8.
	// Precondition: a is a Comparable array, depth is an integer.    
	// --------------------------------------------------------
	{
		StdRandom.shuffle(a);
		sort(a, 0, a.length - 1, depth);
	}

	private static void sort(Comparable[] a, int lo, int hi,int depth)
	// --------------------------------------------------------
	// Summary: Same method as other sorts, we take integer depth parameter to solve step 8.
	// Calling the Merge Sort on its current subarray if the level of recursion has reached depth. (depth = 0).
	// Precondition: a is a Comparable array, lo is an integers, hi is an integer, depth is an integer.
	// --------------------------------------------------------
	{
		if (hi <= lo)
			return;
		int j = partition(a, lo, hi);
		if (depth == 0) {
			//System.out.println("sorting with Merge.");
			Merge.sort(a);
		}
		else{
			depth--;
			sort(a, lo, j - 1, depth);		
			sort(a, j + 1, hi, depth);
			
		}
	}
	
	

	private static boolean less(Comparable v, Comparable w)
	// --------------------------------------------------------
	// Summary: In order to sort the array in increasing order,
	// this method is used.
	// Precondition: v is a Comparable array, w is a Comparable array.
	// --------------------------------------------------------
	{
		return v.compareTo(w) < 0; // for step 7, to modifying Quick.java for descending ordering '<' replaces with  '>'.
	}

	private static void exch(Comparable[] a, int i, int j)
	// --------------------------------------------------------
	// Summary: It swaps two values in the array in order to sort the array.
	// Precondition: a is an Comparable array, i is an integer, j is an integer.
	// --------------------------------------------------------
	{
		Comparable swap = a[i];
		a[i] = a[j];
		a[j] = swap;
	}

}