package aystzh.github.com.algo.linkedlist;

/**
 * 回文链表
 * https://leetcode-cn.com/problems/palindrome-linked-list/solution/hui-wen-lian-biao-mo-ban-zong-jie-jian-y-dzen/
 * https://leetcode-cn.com/problems/reverse-linked-list/
 * Created by zhanghuan on 2022/2/18.
 */
public class PalindRandom {
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


        /**
         * 回文模板【找中点 翻转一半 比较  还原】
         *
         * @param head
         * @return
         */
        public boolean isPalindRandom(ListNode head) {
            if (head == null || head.next == null) {
                return true;
            }
            //找中间节点 并将中间节点当做末尾节点
            ListNode middleNodeEnd = middleNode(head);
            //中间节点的下一个节点当做开始节点
            ListNode middleStart = middleNodeEnd.next;
            middleNodeEnd.next = null;
            //翻转链表
            middleStart = reversNode(middleStart);
            //链表比对
            boolean isMatch = compare(head, middleStart);
            //链表还原
            middleNodeEnd.next = reversNode(middleStart);
            return isMatch;
        }


        private boolean compare(ListNode a, ListNode b) {
            while (b != null) {
                if (a.val != b.val) {
                    return false;
                }
                a = a.next;
                b = b.next;
            }
            return true;
        }

        private ListNode reversNode(ListNode head) {
            ListNode prev = null;
            ListNode current = head;
            while (current != null) {
                ListNode temp = current.next;
                current.next = prev;
                prev = current;
                current = temp;
            }
            return prev;
        }

        public ListNode middleNode(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;
            while (fast.next != null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }

    }


}
