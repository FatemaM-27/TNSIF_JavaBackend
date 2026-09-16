package collection.dayeight.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ArrayDequeDemo {
	public static void main(String[] args) {
		
		// Deque = Double Ended Queue.
	    // It allows elements to be added and removed from both the front and the rear.
	    // Deque is an interface and ArrayDeque is its implementation.
		Deque<String> arrayDeque = new ArrayDeque<String>();
		arrayDeque.add("A");
		arrayDeque.add("B");
		arrayDeque.add("C");

		// offerFirst-adds elements at the front of the ArrayDeque
		arrayDeque.offer("F");

		// ArrayDeque does NOT allow null elements.
	    // Uncommenting the following line will cause an exception.
		// arrayDeque.add(null);
		
		arrayDeque.offerFirst("D");
		// offerLast inserts the element at the last of ArrayDeque
		arrayDeque.offerLast("E");

		Iterator<String> itr = arrayDeque.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("After poll");
		

	    // poll() removes and returns the first element from the Deque.
		String s = arrayDeque.poll();
		System.out.println("Poll Item is:" + s);

		 // Enhanced for loop can also be used to traverse through the Deque.
		for (String item : arrayDeque) {
			System.out.println(item);
		}
	}

}
