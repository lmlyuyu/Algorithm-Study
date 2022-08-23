package com.maolin.algorithm.linkedList;

public class LinkedListUtils {

    public static ListNode arrayToListNode(int[] arrays) {
        if (arrays.length == 0) {
            return null;
        }

        ListNode dummy = new ListNode(-1), p = dummy;

        for (int val : arrays) {
            ListNode nextNode = new ListNode(val);
            p.next = nextNode;
            p = p.next;
        }

        return dummy.next;
    }


    public static void main(String[] args) {
        int[] arrays = {1,3,4};
        System.out.println(arrayToListNode(arrays));
    }
}
