package LinkedList;

public class ReverseLinkedLis {
    Node reverse(Node head){
        Node cur = head;
        Node pre = null;
        while(cur!=null){
            Node temp = cur.next;
            prev = cur;
            cur = temp;

        }
        return prev;
    }
}
