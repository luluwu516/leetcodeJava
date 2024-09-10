import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class IntersectionOfTwoArraysII2 {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> resList = new ArrayList<>();
        int[] hash = new int[1001];
        for (int n : nums1) {
            hash[n]++;
        }
        int count = 0;
        for (int n : nums2) {
            if (hash[n] > 0) {
                resList.add(n);
                hash[n]--;
                count++;
            }
        }

        int[] res = new int[count];
        for (int i = 0; i < count; i++) {
            res[i] = resList.get(i);
        }

        return res;
    }

    public static void main(String args[]) {
        // declaration
        IntersectionOfTwoArraysII2 s = new IntersectionOfTwoArraysII2();
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
