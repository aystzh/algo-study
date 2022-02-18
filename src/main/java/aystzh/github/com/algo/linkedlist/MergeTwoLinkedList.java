package aystzh.github.com.algo.linkedlist;

/**
 * 合并两个有序链表
 * https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xnnbp2/
 * Created by zhanghuan on 2022/2/18.
 */
public class MergeTwoLinkedList {

   private class ListNode {
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
     * 递归求解合并两个有序链表
     * @param listNode1
     * @param listNode2
     * @return
     */
    public ListNode mergeTwoLists(ListNode listNode1,ListNode listNode2) {
        if (listNode1 == null) {
            return listNode2;
        }

        if (listNode2 == null) {
            return listNode2;
        }

        if (listNode1.val < listNode2.val) {
            listNode1.next = mergeTwoLists(listNode1.next, listNode2);
            return listNode1;
        } else {
            listNode2.next = mergeTwoLists(listNode1, listNode2.next);
            return listNode2;
        }
    }
}
