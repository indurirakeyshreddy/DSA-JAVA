package com.orange.stacks;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BalancedExpression {
	private final List<Character> leftBrackets = Arrays.asList('(', '<', '[', '{');
	private final List<Character> rightBrackets = Arrays.asList(')', '>', ']', '}');

	public static void main(String[] args) {
		var balancedExpression = new BalancedExpression();
		String str = "[{1 + 2}]";
		var result = balancedExpression.isBalanced(str);
		System.out.println(result);
	}

	public boolean isBalanced(String input) {
		Stack<Character> stack = new Stack<>();

		for (char ch : input.toCharArray()) {
			if (isLeftBracket(ch))
				stack.push(ch);

			if (isRightBracket(ch)) {
				if (stack.empty())
					return false;
				var top = stack.pop();
				if (bracketsNotMatch(top, ch))
					return false;
			}
		}
		return stack.empty();
	}

	private boolean isLeftBracket(char ch) {
		return leftBrackets.contains(ch);
	}

	private boolean isRightBracket(char ch) {
		return rightBrackets.contains(ch);
	}

	private boolean bracketsNotMatch(char top, char ch) {
		return leftBrackets.indexOf(top) != rightBrackets.indexOf(ch);
	}

}
