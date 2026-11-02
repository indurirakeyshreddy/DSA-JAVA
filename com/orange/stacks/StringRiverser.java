package com.orange.stacks;

import java.util.Stack;

public class StringRiverser {
	
	public static void main (String[] args) {
		String str = "AMAR";
		var result = reverse(str);
		System.out.println(result);
	}
	
	private static String reverse (String input) {
		Stack<Character> stack = new Stack<>();
		
		for (char ch : input.toCharArray())
			stack.push(ch);
		
		StringBuffer reversed = new StringBuffer();
		while (!stack.empty())
			reversed.append(stack.pop());
		
		return reversed.toString();
	}
}
