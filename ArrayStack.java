public class ArrayStack {
    private int[] stackArray;
    private int top;
    private int capacity;

    public ArrayStack(int size) {
        this.capacity = size;
        this.stackArray = new int[capacity];
        this.top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot push " + value);
            return;
        }
        stackArray[++top] = value;
        System.out.println("Pushed: " + value);
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Stack is empty.");
            return;
        }
        int poppedValue = stackArray[top--];
        System.out.println("Popped: " + poppedValue);
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.println("Top element: " + stackArray[top]);
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack (top to bottom): ");
        for (int i = top; i >= 0; i--) {
            System.out.print(stackArray[i] + (i > 0 ? " " : ""));
        }
        System.out.println();
    }
}