package com.orange.stacks;

import java.util.Stack;

public class JavaStack {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		
		System.out.println("Is Empty: " + stack.empty());
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println("Current Stack: " + stack);
		
		System.out.println("Search of 10: " + stack.search(10));
		System.out.println("Search of 20: " + stack.search(20));
		System.out.println("Search of 30: " + stack.search(30));
		
		System.out.println("Peek: " + stack.peek());
		System.out.println("Current Stack: " + stack);
		
		System.out.println("Pop: " + stack.pop());
		System.out.println("Current Stack: " + stack);	
	}
}
