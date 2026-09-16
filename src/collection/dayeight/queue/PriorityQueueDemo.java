package collection.dayeight.queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
	public static void main(String args[]) {
		

	    // Queue is an interface.
	    // PriorityQueue is one implementation of Queue
	    // Here, the Queue stores String values.
		Queue<String> pq = new PriorityQueue<>();

		 // Adding elements to the PriorityQueue.
		pq.add("Core Java");
		pq.add("React");
		pq.add("HTML");
		pq.add("Angular");

	    // Displays the Queue.
	    // NOTE: The complete Queue is NOT guaranteed to be displayed in priority order.
		System.out.println(pq);
		
		 // remove() removes the specified element.
		pq.remove("Angular");

		System.out.println("After Remove " + pq);


	    // poll() removes AND returns the element with the highest priority.
		// For Strings, PriorityQueue normally uses natural ordering (alphabetical order).
		System.out.println("Poll Method " + pq.poll());

		System.out.println("Final Queue " + pq);


	    // iterator() is used to traverse through the elements of the Queue.
		Iterator<String> iterator = pq.iterator();

		while (iterator.hasNext()) {
	        // next() gets the next element.
			System.out.println(iterator.next() + " ");
		}

		// Printing the top element of
		// the PriorityQueue
		System.out.println(pq.peek());

		// Printing the top element and removing it
		// from the PriorityQueue container
		System.out.println(pq.poll());

		// Printing the top element again
		System.out.println(pq.peek());
	}


}
