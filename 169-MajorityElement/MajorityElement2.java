import java.util.Scanner;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int majority = nums[0];
        int count = 0;

        for (int n : nums) {
            if (count == 0) {
                majority = n;
                count++;
            } else if (majority == n) {
                count++;
            } else {
                count--;
            }
        }

        return majority;
    }

    public static void main(String[] args) {
        // declaration
        MajorityElement2 s = new MajorityElement2();
        Scanner in = new Scanner(System.in);
        int size, res;

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
        res = s.majorityElement(nums);

        // output
        System.out.println("\n\nResult:");
        System.out.printf("The majority element is %d\n\n", res);
    }
}
