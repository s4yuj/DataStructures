package Tree;

public class Tree {

    Node start;

    public Tree() {
    }

    public Node getStart() {
        return start;
    }

    // CONSTRAINT: all elements are unique and
    //              existing binary search tree is ordered

    public boolean add(int value) {
        if (start == null) {
            start = new Node(value);
            return true;
        } else {
            return start.add(value);
        }
    }


    public void preOrderPrint(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.object);
        preOrderPrint(node.left);
        preOrderPrint(node.right);
    }

    public void postOrderPrint(Node node) {
        if (node == null) {
            return;
        }
        postOrderPrint(node.left);
        postOrderPrint(node.right);
        System.out.println(node.object);
    }
}