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
    public int pairSum(ListNode head) {

        if(head == null){
            return 0;
        }

        // int mid=1;
        // ListNode slow=head;
        
        // ListNode fast=head;

        // fast=fast.next.next;

        // while(fast != null && fast.next!= null){
        //     slow=slow.next;
        //     fast=fast.next.next;
        //     mid++;
        // }



        // int maxTwinSum=Integer.MIN_VALUE;

        // for(int i=0;i<mid;i++){


        // }

        List<Integer> arr=new ArrayList<>();
        int maxTwinSum=Integer.MIN_VALUE;

        while(head != null){
            arr.add(head.val);
            head=head.next;
        }

        int mid=arr.size()/2;
        int currSum=0;

        for(int i=0;i<mid;i++){
            
            currSum= arr.get(i)+arr.get(arr.size()-1-i);
            if(maxTwinSum< currSum){
                maxTwinSum=currSum;
            }
        }


        return maxTwinSum;

        
    }
}