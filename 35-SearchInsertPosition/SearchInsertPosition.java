import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }

    public static void main(String args[]) {
        // declaration
        SearchInsertPosition s = new SearchInsertPosition();
        Scanner in = new Scanner(System.in);
        int size, target, result;

        // input
        System.out.print("Enter the size of the list: ");
        size = in.nextInt();

        int[] nums = new int[size];

        System.out.println("Enter list numbers: ");
        for (int i = 0; i < size; i++) {
            System.out.print("> ");
            nums[i] = in.nextInt();
        }

        System.out.print("\nEnter the target: ");
        target = in.nextInt();

        // processing
        result = s.searchInsert(nums, target);

        // output
        System.out.println("\nResult: ");
        System.out.printf("The target \"%d\" should be inserted at index %d\n\n", target, result);
    }
}
