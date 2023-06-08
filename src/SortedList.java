public class SortedList extends LinkedList {

    Node start;
    public SortedList() {
        start = new Node(0);
    }

    public void add(int obj) {
        Node curr = start;
        boolean hasNext = true;

        while (hasNext) {
            Node newNode = new Node(obj);

            if (curr.next == null || curr.next.object > obj) {
                System.out.println(curr.next);
                newNode.next = curr.next;
                curr.next = newNode;
                hasNext = false;
            }

//            if (curr.next.object > obj) {
//                newNode.next = curr.next;
//                curr.next = newNode;
//                break;
//            }
            curr = curr.next;
        }
    }

    public void print() {
        Node pointer = start.next;
        boolean hasElement = true;
        while (hasElement) {
            if (pointer.next == null) {
                hasElement = false;
            }
            System.out.println(pointer.object);
            pointer = pointer.next;
        }
    }
}
