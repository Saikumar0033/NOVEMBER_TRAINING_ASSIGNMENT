package Collections_Q6;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* WAP to store data in hashmap. Keys are the city name and values are the population. 
Now you have to sort the all elements (on the basis of city name ) in hashmap and 
print the detail. */

public class Test {

	// Function to sort map by Key
	public static void sortbykey(Map<String, Integer> map) {
		// TreeMap to store values of HashMap
		TreeMap<String, Integer> sorted = new TreeMap<>();

		// Copying all data from hashMap into TreeMap
		sorted.putAll(map);

		// Printing the TreeMap which is naturally sorted
		for (Map.Entry<String, Integer> entry : sorted.entrySet())
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
	}

	// Driver Code
	public static void main(String args[]) {
		// This map stores unsorted values
		Map<String, Integer> map = new HashMap<>();
		
		// putting values in the Map
		map.put("Pune", 85000);
		map.put("Mumbai", 94000);
		map.put("Hyderabad", 98000);
		map.put("Delhi", 33000);
		map.put("Kerala", 89000);

		// Calling the function to sortbyKey
		sortbykey(map);

	}
}
