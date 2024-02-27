import java.util.Scanner;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null)
            return null;
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;

        ListNode merged = new ListNode(0);
        ListNode current = merged;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        return merged.next;
    }

    public static ListNode createList(Scanner in) {
        ListNode temp = new ListNode(0);
        ListNode current = temp;
        int input;

        System.out.print("Enter the elements of list, -1 to stop: ");
        input = in.nextInt();
        while (input != -1) {
            current.next = new ListNode(input);
            current = current.next;

            System.out.print("Enter the elements of list, -1 to stop: ");
            input = in.nextInt();
        }

        return temp.next;
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println("]");
    }

    public static void main(String args[]) {
        // declaration
        MergeTwoSortedLists m = new MergeTwoSortedLists();
        Scanner in = new Scanner(System.in);

        // input
        System.out.println("\nList 1: ");
        ListNode list1 = createList(in);

        System.out.println("\nList 2: ");
        ListNode list2 = createList(in);

        System.out.print("\nList 1: [ ");
        printList(list1);
        System.out.print("List 2: [ ");
        printList(list2);

        // Processing
        ListNode merged = m.mergeTwoLists(list1, list2);

        // Output
        System.out.print("\nMerged List: [ ");
        printList(merged);
    }
}
