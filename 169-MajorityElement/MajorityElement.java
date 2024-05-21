import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int majority = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > map.get(majority)) {
                majority = entry.getKey();
            }
        }

        return majority;
    }

    public static void main(String[] args) {
        // declaration
        MajorityElement s = new MajorityElement();
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
