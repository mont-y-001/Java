package dsa.linkedList;
class Node{
    int data;
    Node next;
    Node prev;

    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
class DoublyLinked{
    Node head;
    Node tail;
    int size;

    //insert at end
    void append(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    void printForward(){
        Node current = head;

        while(current!=null){
            System.out.print(current.data + "<->" );
            current = current.next;
        }
        System.out.println("null");
    }
}
public class doubly {
    public static void main(String[] args) {
        DoublyLinked dll = new DoublyLinked();
        dll.append(10);
        dll.append(20);
        dll.append(30);

        dll.printForward();
        }
}
