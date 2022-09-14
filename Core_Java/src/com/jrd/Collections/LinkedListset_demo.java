package com.jrd.Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListset_demo { // linkedlist demo not set

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		// add elements to the linked list
		ll.add("A");
		ll.add("B");
		ll.add("C");
		ll.add("D");
		ll.add("E");
		ll.addLast("Z");
		ll.addFirst("A");
		ll.add(1, "A1");

		System.out.println("original contents of ll :" + ll);

		// remove elements from the linked list
		ll.remove("f");
		ll.remove(2);

		System.out.println("contents of ll after deletion :" + ll);

		// remove first and last elements

		ll.removeFirst();
		ll.removeLast();

		System.out.println("ll after deleting first and last" + ll);

		// get and set value
		Object val = ll.get(0);
		ll.set(0, (String) val + " Changed");

		System.out.println("ll after change :" + ll);
	}

}