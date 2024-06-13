import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> s = new HashSet<Integer>();
        for (int n : nums) {
            if (s.contains(n)) {
                return true;
            }
            s.add(n);
        }

        return nums.length != s.size();
    }

    public static void main(String[] args) {
        // declaration
        ContainsDuplicate s = new ContainsDuplicate();
        Scanner in = new Scanner(System.in);
        int size;
        boolean res;

        // input
        System.out.print("Enter the size of the list: ");
        size = in.nextInt();

        int[] nums = new int[size];
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < size; i++) {
            System.out.print("> ");
            nums[i] = in.nextInt();
        }

        // processing
        res = s.containsDuplicate(nums);

        // output
        System.out.println("\n\nResult:");
        System.out.printf("The array %s duplicate\n\n", (res ? "contains" : "doesn't contain"));
    }
}
