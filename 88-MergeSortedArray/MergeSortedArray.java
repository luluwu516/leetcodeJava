import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = 0;
        for (int i = m; i < nums1.length; i++) {
            nums1[i] = nums2[index];
            index++;
        }
        Arrays.sort(nums1);
    }

    static public void printList(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.printf("%d", list[i]);
            if (i + 1 != list.length) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // declaration
        MergeSortedArray m = new MergeSortedArray();
        Scanner in = new Scanner(System.in);
        int nums1_len, nums2_len;

        // input
        System.out.print("Enter the size of the nums1: ");
        nums1_len = in.nextInt();

        int[] nums1 = new int[nums1_len];

        System.out.println("Enter list numbers: ");
        for (int i = 0; i < nums1_len; i++) {
            System.out.print("> ");
            nums1[i] = in.nextInt();
        }

        System.out.print("\nEnter the size of the nums2: ");
        nums2_len = in.nextInt();

        int[] nums2 = new int[nums2_len];

        System.out.println("Enter list numbers: ");
        for (int i = 0; i < nums2_len; i++) {
            System.out.print("> ");
            nums2[i] = in.nextInt();
        }

        int[] numsT = new int[nums1_len + nums2_len];

        for (int i = 0; i < nums1_len; i++) {
            numsT[i] = nums1[i];
        }
        for (int i = nums1_len; i < nums1_len + nums1_len; i++) {
            numsT[i] = 0;
        }

        System.out.println("\nOriginal lists: ");
        System.out.print("nums1: ");
        printList(numsT);
        System.out.print("nums2: ");
        printList(nums2);

        // processing
        m.merge(numsT, nums1_len, nums2, nums2_len);

        // output
        System.out.println("\nResult:");
        System.out.print("Sorted list: ");
        printList(numsT);
    }
}
