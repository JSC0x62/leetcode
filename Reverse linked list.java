/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

/*
https://www.youtube.com/watch?v=G0_I-ZF0S38&ab_channel=NeetCode
https://leetcode.com/problems/reverse-linked-list/submissions/
This is an iterative O(N) solution
Basically involves swapping via pointers which are nodes until its reversed
I added the print statements to see what's going on

An example is [1,2,3]

next = current.next; (2)
current.next = previous; (null)
previous = current; (1)
current = next; (2)  (notice how now the current is 2 and the previous is 1)

next = current.next; (3)
current.next = previous; (1)
previous = current; (2)
current = next; (3)  

next = current.next; (null)
current.next = previous; (2)
previous = current; (3)
current = next; (null)  

*/
class Solution {
    public ListNode reverseList(ListNode head) {
           ListNode current = head;
           ListNode previous = null;
           ListNode next;
        while(current != null){
            next = current.next;
             if(next != null){
                System.out.println("value of next: " + next.val);
            }
            else{
                System.out.println("value of next: null");
            }
            current.next = previous;
             if(current.next != null){
                System.out.println("value of current.next: " + current.next.val);
            }
            else{
                System.out.println("value of current.next: null");
            }
            previous = current;
             if(previous != null){
                System.out.println("value of previous: " + previous.val);
            }
            else{
                System.out.println("value of previous: null");
            }
            current = next;
             if(current != null){
                System.out.println("value of current: " + current.val);
            }
            else{
                System.out.println("value of current: null");
            }
            System.out.println();
         }
        return previous;
        }
    }
