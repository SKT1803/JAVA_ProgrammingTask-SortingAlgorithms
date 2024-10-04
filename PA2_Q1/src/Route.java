//-----------------------------------------------------
// Title: Route Class
// Author: Serdar Kemal Topkaya
// Description: In this class, sorting the Route objects with 
// respect to source and destination by using Comparable interface.
//-----------------------------------------------------
public class Route implements Comparable<Route> {

	public String source;
	public String destination;

	public Route(String source, String destination)
	// --------------------------------------------------------
	// Summary: Constructor of Route class.
	// Precondition: source is a String, destination is a String.
	// Postcondition: The value of the source and destination are set.
	// --------------------------------------------------------
	{
		this.source = source;
		this.destination = destination;
	}

	@Override
	public int compareTo(Route o)
	// --------------------------------------------------------
	// Summary: It compares two Route objects using the compareTo method.
        // It compares the sources of the objects first, then placing them in alphabetical order. 
	// If the sources have the same value, it compares the destinations of the objects, placing 
	// them alphabetically again.
	// Precondition: o is a Route object.
	// --------------------------------------------------------
	{

		int valueForCompare = this.source.compareTo(o.source);
		if (valueForCompare < 0)
			return -1;
		else if (valueForCompare > 0)
			return 1;
		else if (valueForCompare == 0) {
			int compareInt2 = this.destination.compareTo(o.destination);
			if (compareInt2 < 0)
				return -1;
			else if (compareInt2 > 0)
				return 1;
			else
				return 0;
		}

		return 0;
	}

	@Override
	public String toString()
	// --------------------------------------------------------
	// Summary: It allows to display any Route object in the specified format.
        // Example,   Ankara Istanbul
	// --------------------------------------------------------
	{
		return source + " " + destination;

	}

}
