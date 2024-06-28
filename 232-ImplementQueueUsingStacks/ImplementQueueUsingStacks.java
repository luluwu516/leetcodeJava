import java.util.Stack;

class MyQueue {
    Stack<Integer> s1;
    Stack<Integer> s2;

    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void push(int x) {
        while (!s1.empty()) {
            s2.push(s1.pop());
        }
        s2.push(x);
        while (!s2.empty()) {
            s1.push(s2.pop());
        }
    }

    public int pop() {
        int front = s1.pop();
        return front;
    }

    public int peek() {
        return s1.peek();
    }

    public boolean empty() {
        return s1.empty();
    }
}

public class ImplementQueueUsingStacks {
    public static void main(String args[]) {
        // declaration
        MyQueue myQueue = new MyQueue();

        // processing
        myQueue.push(1);
        myQueue.push(2);
        int param_2 = myQueue.peek();
        int param_3 = myQueue.pop();
        boolean param_4 = myQueue.empty();

        // output
        System.out.println("\nResult:");
        System.out.printf("peek: %d\n", param_2);
        System.out.printf("pop: %d\n", param_3);
        System.out.printf("The stack now is %s empty\n\n", (param_4 ? "" : "not"));
    }
}
