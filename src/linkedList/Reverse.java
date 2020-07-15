package linkedList;

import linkedList.LinkedMain.*;

public class Reverse {

    //遍历实现链表反转
    public static Node reverseByLoop(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node pre = null;
        Node post = null;
        while(head != null){
            post = head.next;
            head.next = pre;
            pre = head;
            head = post;
        }
        return pre;
    }

    //递归实现链表反转
    public static Node reverseByRecursion(Node head){
        if(head == null || head.getNext() == null){
            return head;
        }
        Node newHead = reverseByRecursion(head.getNext());/*找到了最后一个   也就是5   当前head为4  reverse为5*/

        head.getNext().setNext(head);/* 1-->2-->3-->4-->5   变为   5-->4  1-->2-->3-->4  此时4指向5  5 也指向4*/
        head.setNext(null); /*4-->null    5-->4-->null  1-->2-->3-->4 */
        return newHead;/*返回5-->4-->null*/
    }
}
