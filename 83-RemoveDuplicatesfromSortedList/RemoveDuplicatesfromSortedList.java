import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class RemoveDuplicatesfromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode prev = head;
        ListNode curr = head.next;

        while (curr != null) {
            if (prev.val == curr.val) {
                curr = curr.next;
                prev.next = curr;
            } else {
                curr = curr.next;
                prev = prev.next;
            }
        }
        return head;
    }

    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // declaration
        RemoveDuplicatesfromSortedList r = new RemoveDuplicatesfromSortedList();
        Scanner in = new Scanner(System.in);
        int num;
        ListNode head = null;
        ListNode curr = head;

        // input
        System.out.print("\nEnter numbers, -1 to stop: \n> ");
        num = in.nextInt();
        while (num != -1) {
            if (curr == null) {
                head = new ListNode(num);
                curr = head;
            } else {
                curr.next = new ListNode(num);
                curr = curr.next;
            }
            System.out.print("> ");
            num = in.nextInt();
        }
        System.out.print("\nOriginal list: ");
        printList(head);

        // processing
        ListNode result = r.deleteDuplicates(head);

        // output
        System.out.print("\n\nResult: ");
        printList(result);
    }
}
