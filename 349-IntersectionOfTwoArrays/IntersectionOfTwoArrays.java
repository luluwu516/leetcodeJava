import java.util.HashSet;
import java.util.Scanner;

public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> resSet = new HashSet<Integer>();
        for (int n : nums1) {
            if (search(n, nums2)) {
                resSet.add(n);
            }
        }
        int[] res = new int[resSet.size()];
        int i = 0;
        for (int n : resSet) {
            res[i] = n;
            i++;
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
        IntersectionOfTwoArrays s = new IntersectionOfTwoArrays();
        Scanner in = new Scanner(System.in);
        int size, num;

        // input
        System.out.println("Enter the size of array 1: ");
        size = in.nextInt();
        int[] nums1 = new int[size];

        System.out.println("Enter the numbers: ");
        for (int i = 0; i < size; i++) {
            System.out.print("> ");
            nums1[i] = in.nextInt();
        }

        System.out.println("Enter the size of array 2: ");
        size = in.nextInt();
        int[] nums2 = new int[size];

        System.out.println("Enter the numbers: ");
        for (int i = 0; i < size; i++) {
            System.out.print("> ");
            nums2[i] = in.nextInt();
        }

        // processing
        res = s.intersection(nums1, nums2);

        // output
        System.out.println("\nResult: ");
        System.out.printf("The intersection of two integer arrays is: ");
        for (int n : res) {
            System.out.printf("%d ", n);
        }
        System.out.println("\n");
    }
}
