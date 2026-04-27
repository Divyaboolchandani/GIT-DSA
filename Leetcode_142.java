public class Solution {
    public ListNode detectCycle(ListNode head) {
        //ListNode pos=null;
        boolean cycle=false;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
               cycle=true; 
               break;
            }
        }
        if(cycle==true){
            slow=head;
            while(slow!=fast){
                slow=slow.next;
                fast=fast.next;
            }
           
            return slow;
        }
        return null;
    }
}