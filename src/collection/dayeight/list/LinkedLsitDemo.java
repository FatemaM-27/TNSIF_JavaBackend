package collection.dayeight.list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedLsitDemo {

	public static void main(String[] args) {
        // Creating a LinkedList that stores only Integer values.
		LinkedList<Integer> ll = new LinkedList<Integer>();
        // add() adds elements to the end of the LinkedList.
		ll.add(10);
		ll.add(20);
		ll.add(40);
        // addFirst() adds an element at the beginning.
		ll.addFirst(5);
		ll.add(2, 60);
        // addLast() adds an element at the end.
		ll.addLast(25);
		ll.add(30);

		System.out.println("Number List is " + ll);
        // getFirst() returns the first element.
		System.out.println("First Element is " + ll.getFirst());      
		// getLast() returns the last element.
		System.out.println("Last Element is " + ll.getLast());

		ll.removeFirst();        // removeFirst() removes the first element.

		ll.removeLast();        // removeLast() removes the last element.


		System.out.println("Number List after removing first and last element is " + ll);
        // listIterator() starts the iterator at the beginning.
		ListIterator<Integer> li = ll.listIterator();
        // hasNext() checks whether another element exists.
		while (li.hasNext())
            // next() moves forward and returns the next element.
			System.out.print(li.next() + "\t");

        // Start the ListIterator at the END of the list.
		li = ll.listIterator(ll.size());
		// hasPrevious() checks whether an element exists before the current position.
		while (li.hasPrevious()) {
            // previous() moves backward and returns the element.
			int n = li.previous();
			System.out.print(n + "\t");
			if (n == 20)
				// add() inserts a new element at the iterator's current position.
	            // When n is 20, 99999 is added.
				li.add(99999);
			if (n == 60)
				 // set() replaces the element that was returned by the most recent next() or previous() call.
	            // When n is 60, 60 is replaced with 5555.
				li.set(5555);
		}
		
		System.out.println("Number List is " + ll);

        // sort() arranges the elements in ascending order.
		Collections.sort(ll);
		System.out.println("Number List in Ascending order is " + ll);
		 // reverse() reverses the list.
        // After sorting, this gives descending order
		Collections.reverse(ll);
		System.out.println("Number List in Descending order is " + ll);

	}
}
