/* Node Structure
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public Node deleteMid(Node head) {
        // code here
        Node temp=head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        if(head.next==null){
            head=head.next;
            return null ;
        }
      
            int prev=(size/2);
        Node p=head;
        int i=1;
        while(i<prev){
            i++;
            p=p.next;
        }
        p.next=p.next.next;
        return head;
    }
}