//-----------------------------------------------------
// Title: Merge Class
// Author: Serdar Kemal Topkaya
// Description: This class sorts the arrays, that taken as parameters, using Merge sort.
//-----------------------------------------------------
public class Merge {
	private static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi)
	// --------------------------------------------------------
	// Summary: Performing the merge operation.
	// Precondition: a is Comparable arrays, aux is Comparable array, lo is an integers, mid is an integer, hi is an integer.
	// --------------------------------------------------------

	{
		for (int k = lo; k <= hi; k++)
			aux[k] = a[k];
		int i = lo, j = mid + 1;
		for (int k = lo; k <= hi; k++) {
			if (i > mid)
				a[k] = aux[j++];
			else if (j > hi)
				a[k] = aux[i++];
			else if (greater(aux[j], aux[i]))
				a[k] = aux[j++];
			else
				a[k] = aux[i++];
		}
	}

	private static void sort(Comparable[] a, Comparable[] aux, int lo, int hi)
	// --------------------------------------------------------
	// Summary: It sorts the array, that taken as parameter.
	// Precondition: a is Comparable arrays, aux is Comparable array, lo is an integers, hi is an integer.
	// --------------------------------------------------------
	{
		if (hi <= lo)
			return;
		int mid = lo + (hi - lo) / 2;
		sort(a, aux, lo, mid);
		sort(a, aux, mid + 1, hi);
		merge(a, aux, lo, mid, hi);
	}

	public static void sort(Comparable[] a)
	// --------------------------------------------------------
	// Summary: It is creating an auxiliary array. Then, It sends the auxiliary array and 
	// the array taken as a parameter to the sort method.
	// Precondition: a is a Comparable array.
	// --------------------------------------------------------
	{
		Comparable[] aux = new Comparable[a.length];
		sort(a, aux, 0, a.length - 1);
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
}
