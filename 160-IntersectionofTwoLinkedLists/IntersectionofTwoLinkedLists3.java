import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class IntersectionofTwoLinkedLists3 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        if (headA == headB) {
            return headA;
        }

        int length_A = 0;
        int length_B = 0;
        ListNode currA = headA;
        ListNode currB = headB;

        while (currA != null) {
            length_A++;
            currA = currA.next;
        }
        while (currB != null) {
            length_B++;
            currB = currB.next;
        }
        while (length_A > length_B) {
            headA = headA.next;
            length_A--;
        }
        while (length_B > length_A) {
            headB = headB.next;
            length_B--;
        }
        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }

    public static ListNode constructLinkedList(String[] input) {
        if (input == null || input.length == 0)
            return null;

        ListNode head = new ListNode(Integer.parseInt(input[0]));
        ListNode curr = head;
        for (int i = 1; i < input.length; i++) {
            curr.next = new ListNode(Integer.parseInt(input[i]));
            curr = curr.next;
        }

        return head;
    }

    public static void constructIntersectedLinkedList(ListNode headA,
            ListNode headB, int intersectVal, int skipA, int skipB) {
        if (intersectVal != 0) {
            ListNode currA = headA;
            for (int i = 0; i < skipA; i++) {
                currA = currA.next;
            }
            ListNode currB = headB;
            for (int i = 0; i < skipB; i++) {
                currB = currB.next;
            }
            currB.next = currA.next;
        }
    }

    static void printLinkedList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // declaration
        IntersectionofTwoLinkedLists3 s = new IntersectionofTwoLinkedLists3();
        Scanner in = new Scanner(System.in);
        ListNode headA, headB;
        ListNode res;
        int intersectVal, skipA, skipB;

        // input
        System.out.println(
                "Enter the values to construct the Linked List (separated by spaces):");
        String[] stringA = in.nextLine().split(" ");
        System.out.println(
                "Enter the values to construct the Linked List (separated by spaces):");
        String[] stringB = in.nextLine().split(" ");

        headA = constructLinkedList(stringA);
        headB = constructLinkedList(stringB);

        System.out.print("\nEnter the intersect value: ");
        intersectVal = in.nextInt();

        System.out.print("\nEnter the skipA value: ");
        skipA = in.nextInt();
        System.out.print("Enter the skipB value: ");
        skipB = in.nextInt();

        constructIntersectedLinkedList(headA, headB, intersectVal, skipA, skipB);

        // System.out.println("\nheadA: ");
        // printLinkedList(headA);
        // System.out.println("headB: ");
        // printLinkedList(headB);

        // processing
        res = s.getIntersectionNode(headA, headB);

        // output
        System.out.println("\n\nResult:");
        if (res != null) {
            System.out.println("Intersected at '" + res.val + "'\n");
        } else {
            System.out.println("No intersection\n");
        }
    }
}
