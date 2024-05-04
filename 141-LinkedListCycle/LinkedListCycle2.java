import java.util.HashSet;
import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class LinkedListCycle2 {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> visited = new HashSet<ListNode>();
        while (head != null) {
            if (!visited.add(head))
                return true;
            head = head.next;
        }
        return false;
    }

    public static ListNode constructLinkedList(String[] input, int pos) {
        if (input == null || input.length == 0) {
            return null;
        }

        ListNode[] nodes = new ListNode[input.length];
        for (int i = 0; i < input.length; i++) {
            nodes[i] = new ListNode(Integer.parseInt(input[i]));
        }

        for (int i = 0; i < nodes.length - 1; i++) {
            nodes[i].next = nodes[i + 1];
        }

        if (pos >= 0 && pos < nodes.length) {
            nodes[nodes.length - 1].next = nodes[pos];
        }

        return nodes[0];
    }

    public static void main(String[] args) {
        // declaration
        LinkedListCycle2 s = new LinkedListCycle2();
        ListNode head;
        Scanner in = new Scanner(System.in);
        int pos;
        Boolean res;

        // input
        System.out.print(
                "Enter the values to construct the linked list (separated by spaces): ");
        String[] input = in.nextLine().split(" ");

        System.out.print("Enter the connected position or -1 to create a linked list without a cycle: ");
        pos = in.nextInt();

        // processing
        head = constructLinkedList(input, pos);
        res = s.hasCycle(head);

        // output
        System.out.println("\n\nResult:");
        System.out.printf("The linked list %s a cycle\n", (res ? "has" : "doesn't have"));
    }
}
