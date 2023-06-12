package Tree;

public class Tree {

    Node start;

    public Tree(int object) {
        start = new Node(object);
    }

    // CONSTRAINT: all elements in the tree are unique
    public void add(int object) {
        Node pointer = start;
        Node next = null;
        boolean atEnd = false;
        while (!atEnd) {
            if (object > pointer.object) {
                // go right
                next = pointer.right;
            } else if (object < pointer.object) {
                // go left
                next = pointer.left;
            } else {
                System.out.println("node already exists");
            }
            if (next == null) {
                next = new Node(object); //assign object to this position
                System.out.println("node added");
                atEnd = true; //break out of loop/
            }
        }
    }

    public void delete(int object) {
        Node pointer = start;
        Node next = null;
        boolean atEnd = false;
        while (!atEnd) {
            if (pointer.object == object) { //object found
                //delete object (!!!)
                // move node children (!!!)
                atEnd = true;
            }

            if (object > pointer.object) {
                next = pointer.right;
            } else if (object < pointer.object) {
                next = pointer.left;
            }
        }
    }

}
