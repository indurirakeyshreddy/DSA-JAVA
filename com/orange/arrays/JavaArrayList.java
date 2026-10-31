package com.orange.arrays;

import java.util.ArrayList;

public class JavaArrayList {

	public static void main(String[] args) {

		// Create an ArrayList
		ArrayList<Integer> list = new ArrayList<>();

		// Add elements
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(20);

		System.out.println("Original List: " + list);

		// Remove an item at index 0
		list.remove(0);
		System.out.println("After Remove: " + list);

		// Find the index of the first occurrence
		System.out.println("Index of 20: " + list.indexOf(20));

		// Find the last index of an item
		System.out.println("Last Index of 20: " + list.lastIndexOf(20));

		// Check whether an item exists
		System.out.println("Contains 20: " + list.contains(20));

		// Get the number of items
		System.out.println("Size: " + list.size());

		// Convert ArrayList to a regular array
		Integer[] array = list.toArray(new Integer[0]);
		System.out.println("Regular Array:");

		for (int item : array) {
			System.out.println(item);
		}
	}
}