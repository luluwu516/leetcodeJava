import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int nums1Size = nums1.length, nums2Size = nums2.length;
        int[] res = new int[nums1Size > nums2Size ? nums1Size : nums2Size];
        int i = 0, j = 0;
        int count = 0;
        while (i < nums1Size && j < nums2Size) {
            if (nums1[i] == nums2[j]) {
                res[count++] = nums1[i];
                i++;
                j++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                i++;
            }
        }

        return Arrays.copyOf(res, count);
    }

    public static void main(String args[]) {
        // declaration
        IntersectionOfTwoArraysII3 s = new IntersectionOfTwoArraysII3();
        Scanner in = new Scanner(System.in);
        int[] nums1, nums2, res;
        int size;

        // input
        System.out.print("Enter the size of array 1: ");
        size = in.nextInt();
        nums1 = new int[size];

        System.out.println("Enter the numbers: ");
        for (int i = 0; i < size; i++) {
            System.out.print("> ");
            nums1[i] = in.nextInt();
        }

        System.out.print("\nEnter the size of array 2: ");
        size = in.nextInt();
        nums2 = new int[size];

        System.out.println("Enter the numbers: ");
        for (int i = 0; i < size; i++) {
            System.out.print("> ");
            nums2[i] = in.nextInt();
        }

        // processing
        res = s.intersect(nums1, nums2);

        // output
        System.out.println("\n\nResult: ");
        System.out.printf("The intersection of two integer arrays is: ");
        for (int n : res) {
            System.out.printf("%d ", n);
        }
        System.out.println("\n");
    }
}
