package com.maolin.algorithm.linkedList;

public class ListNode {
    int val;

    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(String.valueOf(val));
        while (this.next != null) {
            sb.append(", " + this.next.val);
            this.next = this.next.next;
        }

        return sb.toString();
    }
}
