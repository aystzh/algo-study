package aystzh.github.com.algo.linkedlist;

/**
 * 翻转链表
 * Created by zhanghuan on 2021/8/12.
 */
public class LinkedListReverse {

    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    /**
     * null ->1 ->2 ->3 ->4
     * null <-1 <-2 <-3 <-4
     */
    public class Solution {
        public ListNode reverseListNode(ListNode head) {
            ListNode prev = null;
            ListNode current = head;
            while (head != null) {
                //临时节点用于保存当前节点下一个节点
                ListNode tempNextNode = current.next;
                //当前节点指向它前面的节点
                current.next = prev;
                //前一个节点后移
                prev = current;
                //当前节点后移
                current = tempNextNode;
            }
            return prev;
        }
    }

}
