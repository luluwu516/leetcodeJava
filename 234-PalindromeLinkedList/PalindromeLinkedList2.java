import java.util.ArrayList;
import java.util.List;
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

public class PalindromeLinkedList2 {
    public boolean isPalindrome(ListNode head) {
        // get the first half of the linked list
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // reverse the second half
        ListNode prev = null;
        ListNode curr = slow.next;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // compare with the reversed second half
        ListNode rev = prev;
        slow.next = null;
        while (rev != null) {
            if (head.val != rev.val) {
                return false;
            }
            head = head.next;
            rev = rev.next;
        }
        return true;
    }

    public static void printLinkList(ListNode head) {
        ListNode curr = head;
        while (curr.next != null) {
            System.out.printf("%d, ", curr.val);
            curr = curr.next;
        }
        System.out.printf("%d", curr.val);
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
        PalindromeLinkedList2 s = new PalindromeLinkedList2();
        Scanner in = new Scanner(System.in);
        ListNode head;
        Boolean res;

        // input
        System.out.print("\nEnter numbers separated by spaces to construct the Linked List: ");
        String[] nums = in.nextLine().split(" ");
        head = constructLinkList(nums);

        // processing output
        System.out.println("\nResult: ");
        System.out.print("The Linked List, [");
        printLinkList(head);
        res = s.isPalindrome(head);
        System.out.printf("], is%s palindrome\n\n", (res ? "" : " not"));
    }
}
