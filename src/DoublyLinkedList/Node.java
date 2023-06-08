package DoublyLinkedList;

public class Node {
    int object;
    Node next;
    Node prev;

    //constructor
    public Node(int obj) {
        this.object = obj;
        next = null;
        prev = null;
    }
}
