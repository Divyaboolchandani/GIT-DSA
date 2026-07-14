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
    public int getKthFromLast(Node head, int k) {
        // code here
        Node temp=head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        if(k>size){
            return -1;
        }
        int k_start=size-k+1;
        int i=1;
        Node prev=head;
        while(i<=k_start-1){
            i++;
            prev=prev.next;
        }
        
        return prev.data;
    }
}