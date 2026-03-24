package dsa.linkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class SinglyList {
    Node head;
    int size;

    void append(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;  // IMPORTANT
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    void BubbleSort() {
        if (head == null) return;

        Node current;
        Node index;

        for (current = head; current != null; current = current.next) {
            for (index = current.next; index != null; index = index.next) {

                if (current.data > index.data) {
                    // swap data
                    int temp = current.data;
                    current.data = index.data;
                    index.data = temp;
                }
            }
        }
    }

    void printForward() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class sort {
    public static void main(String[] args) {
        SinglyList sl = new SinglyList();

        sl.append(10);
        sl.append(2);
        sl.append(1);
        sl.append(0);

        System.out.println("Before Sorting:");
        sl.printForward();

        sl.BubbleSort();

        System.out.println("After Sorting:");
        sl.printForward();
    }
}