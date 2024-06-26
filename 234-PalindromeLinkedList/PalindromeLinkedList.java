import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

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

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList();
        ListNode curr = head;
        while (curr != null) {
            list.add(curr.val);
            curr = curr.next;
        }

        int left = 0;
        int right = list.size() - 1;
        while (left < right) {
            if (list.get(left) != list.get(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;

        // Stack<Integer> stack = new Stack();
        // ListNode curr = head;
        // while(curr != null) {
        // stack.push(curr.val);
        // curr = curr.next;
        // }
        // curr = head;
        // while(curr != null && curr.val == stack.pop()) {
        // curr = curr.next;
        // }
        // return curr == null;
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
        PalindromeLinkedList s = new PalindromeLinkedList();
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
