import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IntersectionOfTwoArrays2 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> nums1Set = new HashSet<Integer>();
        Set<Integer> resSet = new HashSet<Integer>();

        for (int n : nums1) {
            nums1Set.add(n);
        }

        for (int n : nums2) {
            if (nums1Set.contains(n) && !resSet.contains(n)) {
                resSet.add(n);
            }
        }

        int[] res = new int[resSet.size()];
        int i = 0;
        for (int n : resSet) {
            res[i++] = n;
        }
        return res;
    }

    static boolean search(int num, int[] nums) {
        for (int n : nums) {
            if (num == n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        // declaration
        IntersectionOfTwoArrays2 s = new IntersectionOfTwoArrays2();
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
        res = s.intersection(nums1, nums2);

        // output
        System.out.println("\n\nResult: ");
        System.out.printf("The intersection of two integer arrays is: ");
        for (int n : res) {
            System.out.printf("%d ", n);
        }
        System.out.println("\n");
    }
}
