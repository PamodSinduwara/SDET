package com.sdet.assignments.six.question_4;

import java.util.LinkedList;

public class LinkedListReverse {
    public static void main(String[] args) {
        LinkedList<Character> originalList = new LinkedList<>();
        originalList.add('A');
        originalList.add('B');
        originalList.add('C');
        originalList.add('D');
        originalList.add('E');
        originalList.add('F');
        originalList.add('G');
        originalList.add('H');
        originalList.add('I');
        originalList.add('J');

        LinkedList<Character> reversedList = new LinkedList<>(originalList);
        reverseLinkedList(reversedList);

        System.out.println("Original List: " + originalList);
        System.out.println("Reversed List: " + reversedList);
    }

    private static void reverseLinkedList(LinkedList<Character> list) {
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            char temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);

            left++;
            right--;
        }
    }
}
