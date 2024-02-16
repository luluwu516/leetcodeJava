import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        // declaration
        TwoSum test = new TwoSum();
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<Integer>();
        int[] result;
        int input = 0, target;

        // input
        System.out.println("Enter the number lists, -1 to stop: ");
        while (input != -1) {
            System.out.print("> ");
            input = in.nextInt();
            nums.add(input);
        }

        System.out.print("\nEnter the target: ");
        target = in.nextInt();

        // convert ArrayList<Integer> to int[] with one line in Java 8
        // int[] nums_array = nums.stream().mapToInt(id -> id).toArray();

        int[] nums_array = new int[nums.size()];
        int index = 0;
        for (int num : nums) {
            nums_array[index] = num;
            index++;
        }

        result = test.twoSum(nums_array, target);
        System.out.println("\nResult: " + Arrays.toString(result));
    }
}
