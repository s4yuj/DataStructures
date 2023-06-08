public class LinkedList {
    Node start;

    public LinkedList() {
        start = new Node(0);
    }

    public void add(int obj) {
        Node pointer = start;

        while (true) {
            if (pointer.next == null) {// check if current node is the last one
                pointer.next = new Node(obj); // add new node linked to this one
                break;
            }
            pointer = pointer.next;
        }
    }

    public void delete() {
//        pointer = start;
//        while (true) {
//            Node nextNode = pointer.next;
//            if (nextNode.next == null) {// check if nextNode is the last node
//                pointer.next = null;
//                break;
//            }
//            pointer = pointer.next;
//        }
        Node pointer = start.next;
        start.next = pointer.next;
    }

    public void deleteAt(int index) {
        Node pointer = start.next;
        for (int i = 0; i < index - 1; i++) {
            pointer = pointer.next; // go to next node
        }
        pointer.next = pointer.next.next;
    }

    public void printAt(int index) {
        Node pointer = start.next;
        for (int i = 0; i < index; i++) {
            pointer = pointer.next;
        }
        System.out.println(pointer.object);
    }

    //deletes first instance of given object
    public void delete(int obj) {
        Node pointer = start;
        boolean hasNext = true;
        while (hasNext) {
            if (pointer.next == null) {
                break;
            }
            if (pointer.next.object == obj) {
                pointer.next = pointer.next.next;
                break;
            }
            pointer = pointer.next;
        }
    }

    public void insertAfter(int obj, int index) {
        Node pointer = start.next;
        if (index < 0) {
            System.out.println("negative index");
        } else {
            for (int i = 0; i < index; i++) {
                if (pointer.next == null) {
//                    flag = false;
                    System.out.println("index out of bounds");
                    break;
                } else {
                    pointer = pointer.next;
                }
            }
            Node newNode = new Node(obj);
            newNode.next = pointer.next;
            pointer.next = newNode;
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
