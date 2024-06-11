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

public class ReverseLinkedList2 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode rHead = null;
        ListNode curr = head, temp;

        while (curr != null) {
            temp = curr.next;
            curr.next = rHead;
            rHead = curr;
            curr = temp;
        }

        return rHead;
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
        ReverseLinkedList2 s = new ReverseLinkedList2();
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
