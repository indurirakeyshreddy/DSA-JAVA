package com.orange.linkedlist;

import java.util.Arrays;

public class MainLinkedList {

    public static void main(String[] args) {

        var list = new LinkedList();

        // 1. addLast()
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);

        System.out.println("After addLast(): " + Arrays.toString(list.toArray()));

        // 2. addFirst()
        list.addFirst(5);
        System.out.println("After addFirst(): " + Arrays.toString(list.toArray()));

        // 3. size()
        System.out.println("Size: " + list.size());

        // 4. indexOf()
        System.out.println("Index of 20: " + list.indexOf(20));
        System.out.println("Index of 100: " + list.indexOf(100));

        // 5. contains()
        System.out.println("Contains 30: " + list.contains(30));
        System.out.println("Contains 100: " + list.contains(100));

        // 6. removeFirst()
        list.removeFirst();
        System.out.println("After removeFirst(): " + Arrays.toString(list.toArray()));

        // 7. removeLast()
        list.removeLast();
        System.out.println("After removeLast(): " + Arrays.toString(list.toArray()));

        // 8. reverse()
        list.reverse();
        System.out.println("After reverse(): " + Arrays.toString(list.toArray()));

        // 9. getKthFromTheEnd()
        System.out.println("3rd node from the end: " + list.getKthFromTheEnd(3));

        // 10. toArray()
        int[] array = list.toArray();
        System.out.println("Array: " + Arrays.toString(array));
    }
}
