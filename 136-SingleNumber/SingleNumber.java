import java.util.Scanner;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int xor = 0;
        for (int n : nums) {
            xor ^= n;
        }
        return xor;
    }

    public static void main(String[] args) {
        // declaration
        SingleNumber s = new SingleNumber();
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
