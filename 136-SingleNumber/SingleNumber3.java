import java.util.Scanner;
import java.util.Arrays;

public class SingleNumber3 {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }

        return nums[nums.length - 1];
    }

    public static void main(String[] args) {
        // declaration
        SingleNumber3 s = new SingleNumber3();
        Scanner in = new Scanner(System.in);
        int size, res;
        int[] nums;

        // input
        System.out.print("Enter the size of the list: ");
        size = in.nextInt();

        nums = new int[size];
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < size; i++) {
            System.out.print("> ");
            nums[i] = in.nextInt();
        }

        // processing
        res = s.singleNumber(nums);

        // output
        System.out.println("\nResult: ");
        System.out.printf("Number %d only appears one time\n", res);
    }
}
