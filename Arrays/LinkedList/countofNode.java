package LinkedList;

import org.w3c.dom.Node;

public class countofNode {
       public static int getCount(Node head){
        Node currentNode = head;
        int lengthOfLinkedList = 0;
        
        while(currentNode != null){
            lengthOfLinkedList++;
            currentNode = currentNode.next;
        }
        return lengthOfLinkedList;
    }
}
