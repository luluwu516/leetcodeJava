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

public class ReverseLinkedList3 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode curr = head.next;
        ListNode second = curr;
        ListNode prev = head;

        head.next = null;

        while (curr.next != null) {
            second = second.next;
            curr.next = prev;
            prev = curr;
            curr = second;
        }
        curr.next = prev;

        return curr;
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
        ReverseLinkedList3 s = new ReverseLinkedList3();
        Scanner in = new Scanner(System.in);
        ListNode head, res;

        // input
        System.out.print("Enter numbers to construct the Linked List (separated by spaces): ");
        String[] nums = in.nextLine().split(" ");
        head = constructLinkList(nums);

        // processing and output
        System.out.println("\nResult: ");
        System.out.print("Original: ");
        printLinkList(head);
        res = s.reverseList(head);
        System.out.print("Revised : ");
        printLinkList(res);
    }
}
