import java.util.ArrayList;
import java.util.Scanner;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int res = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            res ^= i;
            res ^= nums[i];
        }
        res ^= len;
        return res;
    }

    public static void main(String[] args) {
        // declaration
        MissingNumber s = new MissingNumber();
        Scanner in = new Scanner(System.in);
        int num, res;
        ArrayList<Integer> nums = new ArrayList<Integer>();

        // input
        System.out.print("\nEnter the number lists, -1 to stop: \n> ");
        num = in.nextInt();
        while (num != -1) {
            nums.add(num);
            System.out.print("> ");
            num = in.nextInt();
        }

        int[] nums_array = new int[nums.size()];
        int index = 0;
        for (int n : nums) {
            nums_array[index] = n;
            index++;
        }

        // processing
        res = s.missingNumber(nums_array);

        // output
        System.out.println("\n\nResult:");
        System.out.printf("The missing number is: %d\n\n", res);
    }
}
