package com.orange;

public class ReverseString {
	public static void main(String[] args) {
	
		String input = "welcome";
		char[] chars = input.toCharArray();
		
		int left = 0;
		int right = chars.length - 1;
		
		while (left < right) {
			char temp = chars[left];
			chars[left] = chars[right];
			chars[right] = temp;
			
			left++;
			right--;
		}
		
		System.out.println(new String(chars));
		
	}
	
}


/*
package com.orange;

public class ReverseString {

    public static void main(String[] args) {
    	
        String input = "bus";
        String reversed = "";
        
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        System.out.println(reversed); // Output: sub
    }
}

---------------------------------------------------------------------

STEP-BY-STEP EXECUTION:

Input: "bus"

Iteration 1:
i = 2
input.charAt(2) = 's'
reversed = "" + 's' = "s"

Iteration 2:
i = 1
input.charAt(1) = 'u'
reversed = "s" + 'u' = "su"

Iteration 3:
i = 0
input.charAt(0) = 'b'
reversed = "su" + 'b' = "sub"

Output: sub

=====================================================================

WHY IS THE TWO-POINTER APPROACH BETTER?

In this program, reversed += input.charAt(i) creates a new
String result repeatedly because Java Strings are immutable.

For a string of length n:
- Time complexity: O(n^2) in the general case.
- Space complexity: O(n) for the final result, with additional
  temporary allocations during concatenation.

The two-pointer approach:
- Converts the String into a character array once.
- Swaps characters from both ends toward the middle.
- Takes O(n) time and O(n) extra space for the character array.

CONCLUSION:
Both approaches correctly reverse a string.
The two-pointer approach is generally more efficient for large
strings. The for-loop approach is simpler for beginners to
understand.

======================================================================
*/
