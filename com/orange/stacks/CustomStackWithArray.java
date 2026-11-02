package com.orange.stacks;

import java.util.Arrays;

public class CustomStackWithArray {
	private int[] items = new int[5];
	private int count;

	public static void main(String[] args) {
		var stack = new CustomStackWithArray();
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
		if (count == items.length)
			throw new StackOverflowError();
		items[count++] = item;
	}

	public int pop() {
		if (count == 0)
			throw new IllegalStateException();
		return items[--count];
	}
	
	public int peek() {
		if (count == 0)
			throw new IllegalStateException();
		return items[count - 1];
	}

	@Override
	public String toString() {
		var content = Arrays.copyOfRange(items, 0, count);
		return Arrays.toString(content);
	}

}
