package com.orange.stacks;

import java.util.LinkedList;

public class CustomStackWithLinkedList {
	private LinkedList<Integer> items = new LinkedList<>();

	public static void main(String[] args) {
		var stack = new CustomStackWithLinkedList();

		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);

		System.out.println("full stack: " + stack);
		System.out.println("peek: " + stack.peek());
		System.out.println("after peek: " + stack);
		System.out.println("pop: " + stack.pop());
		System.out.println("after pop: " + stack);
	}

	public void push(int item) {
		items.addLast(item);
	}

	public int pop() {
		if (items.isEmpty())
			throw new IllegalStateException();
		return items.removeLast();
	}

	public int peek() {
		if (items.isEmpty())
			throw new IllegalStateException();
		return items.getLast();
	}

	@Override
	public String toString() {
		return items.toString();
	}

}