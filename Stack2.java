package veer.com;



class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }

    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full. Cannot push " + value);
            return;
        }
        stackArray[++top] = value;
        System.out.println(value + " pushed to stack");
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        int poppedValue = stackArray[top--];
        return poppedValue;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }
}

public class Stack2 {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(5);
        stack.push(10);
        stack.push(15);

        System.out.println("Top element: " + stack.peek()); // Output: 15

        System.out.println("Popped element: " + stack.pop()); // Output: 15
        System.out.println("Popped element: " + stack.pop()); // Output: 10

        stack.push(20);
        System.out.println("Top element after push: " + stack.peek()); // Output: 20
    }
}
