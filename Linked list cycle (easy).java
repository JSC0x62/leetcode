/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

/*
https://leetcode.com/problems/linked-list-cycle
https://www.youtube.com/watch?v=gBTe7lFR3vc&ab_channel=NeetCode

First is my solution which is slower and more memory intensive. Normally would be used with a HashSet or HashMap but I used a list.
Just go through the list and store each ListNode. Check if the current node is in there or not, if yes return true, if not try again with the next node.
If its in the list that means we have a repeat (cycle)

The second solution uses Floyd's tortise and hair algorithim. Its O(N) and uses a 2 pointer method.
Basically you have a slow and a fast pointer. At some point, if there is a cycle, the fast will catch up with the slow pointer (sort of like its lapping the slow one in race)

*/
import java.util.ArrayList;
public class Solution {
    
    public boolean hasCycleMe(ListNode head) {
       ArrayList<ListNode> list = new ArrayList<>();
       while(head != null){
           if(list.contains(head)){
               return true;
           }
           list.add(head);
           head = head.next;
       }
        return false;
    }
  
  public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        //have to check for both cases here. Head could be null, and if the next is null, there is no cycle.
        while(fast != null && fast.next != null){
            //the fast pointer is increased by 2 and the slow by 1
            fast = fast.next.next; 
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }
}
