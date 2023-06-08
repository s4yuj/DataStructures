
package DoublyLinkedList;

public class DoublyLinkedList {
    Node start;

    public DoublyLinkedList() {
        start = new Node(0);
    }

    public void add(int obj) {
        Node pointer = start;

        while (true) {
            if (pointer.next == null) { //check if current node is the last node
                Node newNode = new Node(obj);
                pointer.next = newNode; //assigns newNode as the next node in the list
                newNode.prev = pointer; //assigns current pointer's node to newNode's prev
                break;
            }
            pointer = pointer.next;
        }
    }





    public void delete() {

    }


}
