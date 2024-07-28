import java.util.List;
import java.util.Scanner;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int t = nums[i];
                nums[i] = nums[left];
                nums[left] = t;
                left++;
            }
        }
    }

    public static void main(String[] args) {
        // declaration
        MoveZeroes s = new MoveZeroes();
        Scanner in = new Scanner(System.in);

        // input
        System.out.print("Enter numbers (separated by spaces): ");
        String[] input = in.nextLine().split(" ");
        int[] nums = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }

        // processing
        s.moveZeroes(nums);

        // output
        System.out.println("\n\nResult:");
        for (int n : nums) {
            System.out.printf("%d ", n);
        }
        System.out.println("\n");
    }
}
