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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3=new ListNode();
        ListNode head=null;
        ListNode temp=null;
        ListNode temp1=l1;
        ListNode temp2=l2;
        int var=0;
        while(temp1!=null|| temp2!=null){
            int v=0;
            if(temp1==null){
                v=var+temp2.val;
            }
            else if(temp2==null){
                v=var+temp1.val;
            }
            else{
                v=var+temp1.val+temp2.val;
            }
            var=v/10;
            v=v%10;
            ListNode node=new ListNode();
            node.val=v;
            node.next=null;
            if(head==null){
                head=node;
            }
            else{
                temp.next=node;
            }
            if(temp1==null){
                temp2=temp2.next;
            }
            else if(temp2==null){
                temp1=temp1.next;
            }
            else{
                temp1=temp1.next;
                temp2=temp2.next;
            }
            temp=node;
        }
        if(var==1){
            ListNode node=new ListNode();
            node.val=1;
            node.next=null;
            temp.next=node;
            temp=node;
        }
        return head;
    }
}
