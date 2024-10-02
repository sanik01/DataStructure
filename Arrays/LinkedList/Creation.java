package LinkedList;
public class Creation{

    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    void Main(){
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);

        Node head = n1;
        head.next= n2;
        n2.next =n3;
        n3.next = null;
    }
}