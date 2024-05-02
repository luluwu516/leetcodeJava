import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SingleNumber2 {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }

        }

        return 0;
    }

    public static void main(String[] args) {
        // declaration
        SingleNumber2 s = new SingleNumber2();
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
