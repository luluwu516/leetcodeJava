import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            // or
            // if (hmap.containsKey(nums[i]) && i - hmap.get(nums[i]) <= k) {
            if (hmap.get(nums[i]) != null && i - hmap.get(nums[i]) <= k) {
                return true;
            }
            hmap.put(nums[i], i);
        }

        return false;
    }

    public static void main(String[] args) {
        // declaration
        ContainsDuplicateII s = new ContainsDuplicateII();
        Scanner in = new Scanner(System.in);
        int size, k;
        boolean res;

        // input
        System.out.print("\nEnter the size of the list: ");
        size = in.nextInt();

        int[] nums = new int[size];
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < size; i++) {
            System.out.print("> ");
            nums[i] = in.nextInt();
        }

        System.out.print("Enter an integer k: ");
        k = in.nextInt();

        // processing
        res = s.containsNearbyDuplicate(nums, k);

        // output
        System.out.println("\n\nResult:");
        System.out.printf("The array %s duplicate\n\n", (res ? "contains" : "doesn't contain"));
    }
}
