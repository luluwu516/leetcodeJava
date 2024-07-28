import java.util.List;
import java.util.Scanner;

public class MoveZeroes3 {
    public void moveZeroes(int[] nums) {
        int len = nums.length, left = 0;
        int stack[] = new int[len];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                stack[left] = nums[i];
                left++;
            }
        }
        for (int i = 0; i < len; i++) {
            if (i < left) {
                nums[i] = stack[i];
            } else {
                nums[i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        // declaration
        MoveZeroes3 s = new MoveZeroes3();
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
