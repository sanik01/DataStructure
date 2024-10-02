package LinkedList;

import LinkedList.Creation.Node;

public class DeleteLinkedList {
    void delete(head,3);
}
void delete(Node head,int pos){
    if(pos==0){
        head=head.next;
        return;
    }
    Node prev = head;
    for(inti=0;i<pos-1;i++){
        prev = prev.next;
    }
    prev.next= prev.next.next;
}
