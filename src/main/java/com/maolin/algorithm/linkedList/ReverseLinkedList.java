package com.maolin.algorithm.linkedList;

public class ReverseLinkedList {

    /**
     * 递归实现
     *
     * @param head
     * @return
     */
    public static ListNode reverse(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode last = reverse(head.next);

        head.next.next = head;
        head.next = null;

        return last;
    }

    /**
     * 迭代实现
     *
     * @param head
     * @return
     */
    public static ListNode reverseIteration(ListNode head) {

        return null;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9};
        System.out.println(reverse(LinkedListUtils.arrayToListNode(arr)));
    }
}
