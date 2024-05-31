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

public class RemoveLinkedListElements2 {
    public ListNode removeElements(ListNode head, int val) {
        // if (head == null) {
        // return null;
        // }

        // if (head.val == val) {
        // head = removeElements(head.next, val);
        // if (head == null) {
        // return null;
        // }
        // }
        // head.next = removeElements(head.next, val);

        // return head;
        if (head == null || (head.next == null && head.val == val))
            return null;

        head.next = removeElements(head.next, val);
        if (head.val == val) {
            return head.next;
        } else {
            return head;
        }
    }

    public static void printLinkList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.printf("%d ", curr.val);
            curr = curr.next;
        }
        System.out.println("");
    }

    public static ListNode constructLinkList(String[] nums) {
        ListNode curr = new ListNode(Integer.parseInt(nums[0]));
        ListNode dummy = new ListNode(0, curr);

        for (int i = 1; i < nums.length; i++) {
            curr.next = new ListNode(Integer.parseInt(nums[i]));
            curr = curr.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        // declaration
        RemoveLinkedListElements2 s = new RemoveLinkedListElements2();
        Scanner in = new Scanner(System.in);
        int val;
        ListNode head, res;

        // input
        System.out.print("Enter numbers to construct the Linked List (separated by spaces): ");
        String[] nums = in.nextLine().split(" ");
        head = constructLinkList(nums);
        System.out.print("Enter a value to remove: ");
        val = in.nextInt();

        // processing output
        System.out.println("\nResult: ");
        System.out.print("Original: ");
        printLinkList(head);
        res = s.removeElements(head, val);
        System.out.print("Revised : ");
        printLinkList(res);
    }
}
