package aystzh.github.com.algo.linkedlist;

/**
 * 翻转链表
 * https://leetcode-cn.com/problems/reverse-linked-list/
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


    /**
     * demo 翻转2到4的节点数据 返回新链表数据
     * 1 -> 2 -> 3 -> 4 ->5
     * 1 -> 4 -> 3 -> 2 ->5
     */
    class reverseLinkedList {

        public ListNode solution(ListNode head, int left, int right) {
            ListNode dummyHead = new ListNode(0);
            dummyHead.next = head;
            //初始化指针
            ListNode g = dummyHead;
            ListNode p = dummyHead.next;
            //将指针移动到相对应位置
            for (int i = 0; i < left - 1; i++) {
                g = g.next;
                p = p.next;
            }

            //头插法插入节点
            for (int j = 0; j < right - left; j++) {
                ListNode removed = p.next;
                p.next = p.next.next;

                removed.next = g.next;
                g.next = removed;
            }
            return dummyHead.next;
        }
    }

}
