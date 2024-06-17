import java.util.HashSet;
import java.util.Scanner;

public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> hset = new HashSet<Integer>();
        int visited = 0;

        for (int i = 0; i < nums.length; i++) {
            if (!hset.add(nums[i])) {
                return true;
            }
            if (hset.size() > k) {
                hset.remove(nums[visited++]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // declaration
        ContainsDuplicateII2 s = new ContainsDuplicateII2();
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
