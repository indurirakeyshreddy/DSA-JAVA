package com.orange.linkedlists;

import java.util.Arrays;

public class CustomLinkedListMain {

    public static void main(String[] args) {

        var list = new CustomLinkedList();

        // 1. addLast()
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);

        System.out.println("1. After addLast(): " + Arrays.toString(list.toArray()));

        // 2. addFirst()
        list.addFirst(5);
        System.out.println("2. After addFirst(): " + Arrays.toString(list.toArray()));

        // 3. indexOf()
        System.out.println("3. Index of 20: " + list.indexOf(20));
        System.out.println("3. Index of 100: " + list.indexOf(100));

        // 4. contains()
        System.out.println("4. Contains 30: " + list.contains(30));
        System.out.println("4. Contains 100: " + list.contains(100));

        // 5. removeFirst()
        list.removeFirst();
        System.out.println("5. After removeFirst(): " + Arrays.toString(list.toArray()));

        // 6. removeLast()
        list.removeLast();
        System.out.println("6. After removeLast(): " + Arrays.toString(list.toArray()));

        // 7. reverse()
        list.reverse();
        System.out.println("7. After reverse(): " + Arrays.toString(list.toArray()));

        // 8. getKthFromTheEnd()
        System.out.println("8. Third node from the end: " + list.getKthFromTheEnd(3));

        // 9. toArray()
        int[] array = list.toArray();
        System.out.println("9. Array: " + Arrays.toString(array));
    }
}
