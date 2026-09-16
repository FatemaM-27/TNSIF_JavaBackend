package collection.dayeight.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {
	public static void main(String[] args) {

		List list1 = new ArrayList();// creates empty raw ArrayList (allows heterogeneous elements)
		System.out.println("Size : "+list1.size());
		System.out.println("Is list empty? "+list1.isEmpty());
		list1.add(10);
		list1.add(20);
		list1.add(true);
		list1.add(false);
		list1.add(20);
		list1.add("Hello");
		list1.add(56.78);
		list1.add(20);
		list1.add('A');
		
	    // add(index, element) inserts an element at the specified index.
		list1.add(5, "Hi");
		// ArrayList allows duplicate elements.
		list1.add(20);
		System.out.println("List is "+list1);

		// contains() checks whether a particular element exists in the list.
		System.out.println("Is list conatins 15? "+list1.contains(15));

        // remove(Object) removes the specified object.
        // Here, it removes the first occurrence of false.
		list1.remove(false);
		System.out.println("List is "+list1);

		// remove(index) removes the element at the specified index.
		/*
		 * System.out.println(list1.remove(20)); //4 - index System.out.println(list1);
		 */
		
		
		  // get(index) returns the element at the specified index.
		System.out.println("Element at 5 location is : "+list1.get(5));
		

        // lastIndexOf(20) returns the index of the LAST occurrence of 20.
        // That index is then passed to remove().
		System.out.println("Element removed : "+list1.remove(list1.lastIndexOf(20))); // remove 20 (last occurrence)
		   // indexOf(20) returns the index of the FIRST occurrence of 20.
        // That index is then passed to remove().
		System.out.println("Element removed : "+list1.remove(list1.indexOf(20))); // remove 20 (first occurrence)
		System.out.println("List is "+list1);


        /*
         * Collections.sort(list1);
         *
         * This will cause ClassCastException at runtime
         * because list1 contains different types of objects
         * such as Integer, Boolean, String, Character, etc.
         *
         * Sorting requires compatible/comparable elements.
         */


		
		/*
		 * Collections.sort(list1);//RTE - ClassCastException
		 * System.out.println("List is "+list1);
		 */
		 
	     // clear() removes ALL elements from the list.
		list1.clear();
		System.out.println("List is "+list1);

		// Using Generics creates a type-safe,homogeneous list.
        // This list can contain ONLY String values.
		// Using Generic we can create Homogeneous List
		List<String> names = new ArrayList<String>();
		names.add("Amit");
		names.add("Sumit");
		names.add("Ankit");
		names.add("Rohit");
		names.add("Likshit");
		

        // This would cause a compile-time error because the list accepts only String values.
		//names.add(10); //CTE - Generic are type safety
		
		System.out.println("Name List is "+names);
        // reverse() reverses the order of elements.
		Collections.reverse(names);
		System.out.println("Reverse Name List is "+names);

        // contains() checks whether "Ankit" exists.
		System.out.println("Is \'Ankit\' contains in name list? "+names.contains("Ankit"));

		System.out.println("Name List Before Sorting is "+names);
		
	     // sort() sorts the Strings in ascending order.
        // For Strings, this is alphabetical order.
		Collections.sort(names);
		System.out.println("Sorting in Ascending order " + names);
		   // Reverse the sorted list to get descending order.
		Collections.reverse(names);
		System.out.println("Sorting in Descending order " + names);

		// Traversing a list
		System.out.println("--------------- Traversing a list ---------------");
		Iterator<String> i = names.iterator();
		while (i.hasNext()) {
			String nm = i.next();
			System.out.println(nm);
            // Iterator's remove() safely removes the current element while traversing.		
			if (nm.equals("Ankit"))
				i.remove();
		}
	
		System.out.println("Name list is "+names);
		System.out.println("--------------- Traversing a list in backward manner ---------------");
		
        // listIterator(names.size()) starts the ListIterator at the END of the list.
		ListIterator<String> li=names.listIterator(names.size());
		
        // hasPrevious() checks whether an element exists before the current position.
		while(li.hasPrevious())
		{
			String nm = li.previous();
			System.out.println(nm);			
		}

	}

}
