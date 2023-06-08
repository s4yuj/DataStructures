public class Stack {
    int myStack[];
    int pointer; //represents earliest open spot
    int maxSize;

    //constructor
    public Stack(int size){
        this.maxSize = size;
        myStack = new int[size];
        pointer = 0;
    }

    //pushes the given integer into the stack
    public void push(int obj) {
        if (pointer < maxSize) {
            myStack[pointer] = obj;
            pointer++;
            System.out.println("added");
        } else {
            System.out.println("capacity!");
        }
    }

    //returns the element most recently added
    public int pop() {
        int res;

        res = myStack[pointer - 1];
        myStack[pointer - 1] = -1;
        pointer--;

        return res;
    }
}
