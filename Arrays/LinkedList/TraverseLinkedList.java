package LinkedList;

import LinkedList.Creation.Node;

public class TraverseLinkedList {
    void main(){
        traverse(head);
    }
void traverse(Node head)
Node curr = head;
while(curr!=null){
    print(curr.data);
    curr =curr.next;
}
    
}
