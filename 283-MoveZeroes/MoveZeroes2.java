import java.util.List;
import java.util.Scanner;

public class MoveZeroes2 {
    public void moveZeroes(int[] nums) {
        int left = 0, len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] != 0) {
                nums[left] = nums[i];
                left++;
            }
        }
        for (int i = left; i < len; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        // declaration
        MoveZeroes2 s = new MoveZeroes2();
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
