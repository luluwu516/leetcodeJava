import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class IntersectionOfTwoArrays3 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> resList = new ArrayList<>();
        for (int n : nums1) {
            map.put(n, 1);
        }

        for (int n : nums2) {
            if (map.containsKey(n) && map.get(n) == 1) {
                resList.add(n);
                map.put(n, 0);
            }
        }

        int[] res = new int[resList.size()];
        for (int i = 0; i < resList.size(); i++) {
            res[i] = resList.get(i);
        }
        return res;
    }

    public static void main(String args[]) {
        // declaration
        IntersectionOfTwoArrays3 s = new IntersectionOfTwoArrays3();
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
