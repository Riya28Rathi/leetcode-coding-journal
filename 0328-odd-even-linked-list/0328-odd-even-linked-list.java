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
class Solution {

   
    public ListNode oddEvenList(ListNode head) {

        if(head == null || head.next==null){
            return head;
        }

        // Create the first ListNode object with value 10
        ListNode node1 = new ListNode(head.val,null);

        // Create the second ListNode object with value 20
        ListNode node2 = new ListNode(head.next.val,null);

        ListNode end=node1;
        ListNode start_n1=node1;
        ListNode start_n2=node2;

        head = head.next.next;

        // oddEven(head.next.next, node1,node2);
        while(head!=null){
            node1.next=head;
            end=node1.next;
            node2.next=head.next;

            node1=node1.next;
            node2=node2.next;

            if(head.next==null || head.next.next== null){
                break;
            }
            head=head.next.next;
            
        }

        end.next=start_n2;

        return start_n1;


        
    }


    
}