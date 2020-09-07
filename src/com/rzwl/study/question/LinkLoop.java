package com.rzwl.study.question;

/**
 * @author : champion
 * @version V1.0
 * @Description: 检测是否有环
 * @date Date : 2020年09月07日 15:05
 */
public class LinkLoop {

    public static void main(String[] args) {
        LinkedNode n1 = new LinkedNode(1);
        LinkedNode n2 = new LinkedNode(2);
        LinkedNode n3 = new LinkedNode(3);
        LinkedNode n4 = new LinkedNode(4);
        LinkedNode n5 = new LinkedNode(5);
        LinkedNode n6 = new LinkedNode(6);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n3;

        System.out.println( checkLoop( n1 ) );
    }

    public static boolean checkLoop(LinkedNode head) {
        LinkedNode slow = head;
        LinkedNode fast = head;
        while ( fast !=null && fast.next != null ) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

   static class LinkedNode{
        Integer node;
        LinkedNode next;

        public LinkedNode(Integer val) {
            node = val;
            next = null;
        }
    }
}