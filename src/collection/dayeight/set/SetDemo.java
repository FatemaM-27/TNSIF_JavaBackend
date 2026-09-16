package collection.dayeight.set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
	 public static void main(String[] args) {

	        Set<Integer> set = new HashSet<>();

	        // Set stores unique elements.
	        // Duplicate values are not allowed.
	        
	        // Adding elements to the Set.
	        set.add(10);
	        set.add(20);
	        set.add(30);
	        

	        // 20 is already present, so this duplicate will NOT be added again.
	        set.add(20);

	        System.out.println(set);
	        // contains() checks whether a particular element is present in the Set.
	        System.out.println(set.contains(20));

	        // remove() removes the specified element.
	        set.remove(10);

	        // size() returns the number of elements currently present in the Set.

	        System.out.println(set.size());
	        // clear() removes all elements from the Set.
	        set.clear();


	        // isEmpty() checks whether the Set contains any elements or not.
	        System.out.println(set.isEmpty());
	    }

}
