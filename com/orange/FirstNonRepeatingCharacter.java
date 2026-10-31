package com.orange;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {

        String input = "indian";

        Map<Character, Integer> frequency = new LinkedHashMap<>();

        for (char ch : input.toCharArray()) {
            frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : frequency.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First non-repeating character: " + entry.getKey());
                return;
            }
        }

        System.out.println("No non-repeating character found");
    }
}



//// BEGINNER APPROACH: Nested loops
//// Time: O(n^2) | Auxiliary space: O(1)
//
//package com.orange;
//
//public class FirstNonRepeatingCharacter {
//
//    public static void main(String[] args) {
//
//        String input = "swiss";
//        boolean found = false;
//
//        for (int i = 0; i < input.length(); i++) {
//            char current = input.charAt(i);
//            boolean repeated = false;
//
//            for (int j = 0; j < input.length(); j++) {
//                if (i != j && current == input.charAt(j)) {
//                    repeated = true;
//                    break;
//                }
//            }
//
//            if (!repeated) {
//                System.out.println("First non-repeating character: " + current);
//                found = true;
//                break;
//            }
//        }
//
//        if (!found) {
//            System.out.println("No non-repeating character found");
//        }
//    }
//}


/*
-------------------------------------------------------------------------------------------
STEP-BY-STEP EXECUTION:
	Input: "swiss"
		1. 's' repeats, so skip it.
		2. 'w' appears only once, so print it and stop.
	Output: First non-repeating character: w

COMPLEXITY COMPARISON:
	Optimized approach:
		- Time: O(n) average
		- Space: O(k), where k is the number of distinct characters.
		- LinkedHashMap preserves insertion order.

	Beginner approach:
		- Time: O(n^2), because each character is checked against every other character.
		- Auxiliary space: O(1).

CONCLUSION:
	Both approaches find the correct character.
	The optimized approach is more efficient for large strings.
	The beginner approach is easier to understand initially.
-------------------------------------------------------------------------------------------
*/
