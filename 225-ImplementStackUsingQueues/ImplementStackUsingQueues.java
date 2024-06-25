import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    Queue<Integer> q;

    public MyStack() {
        q = new LinkedList<>();
    }

    public void push(int x) {
        q.add(x);
        for (int i = 0; i < q.size() - 1; i++) {
            int oldest = q.remove();
            q.add(oldest);
        }
    }

    public int pop() {
        return q.remove();
    }

    public int top() {
        return q.peek();
    }

    public boolean empty() {
        return q.isEmpty();
    }
}

public class ImplementStackUsingQueues {
    public static void main(String args[]) {
        // declaration
        MyStack myStack = new MyStack();

        // processing
        myStack.push(1);
        myStack.push(2);
        int param_2 = myStack.top();
        int param_3 = myStack.pop();
        boolean param_4 = myStack.empty();

        // output
        System.out.println("\nResult:");
        System.out.printf("top: %d\n", param_2);
        System.out.printf("pop: %d\n", param_3);
        System.out.printf("The stack now is %s empty\n\n", (param_4 ? "" : "not"));
    }
}
