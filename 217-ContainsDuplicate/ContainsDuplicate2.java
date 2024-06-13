import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ContainsDuplicate2 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> s = new HashSet<Integer>();
        for (int n : nums) {
            if (!duplicate.add(n)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        // declaration
        ContainsDuplicate2 s = new ContainsDuplicate2();
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
