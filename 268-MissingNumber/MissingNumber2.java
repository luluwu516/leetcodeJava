import java.util.ArrayList;
import java.util.Scanner;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int sumOfNums = 0;
        int len = nums.length;
        int sumOfN = (len * (len + 1)) / 2;

        for (int n : nums) {
            sumOfNums += n;
        }

        return sumOfN - sumOfNums;
    }

    public static void main(String[] args) {
        // declaration
        MissingNumber2 s = new MissingNumber2();
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
