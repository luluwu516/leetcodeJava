import java.util.Scanner;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int count = 0;

        for (int n : nums) {
            if (n != val) {
                nums[count] = n;
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        // declaration
        RemoveElement r = new RemoveElement();
        Scanner in = new Scanner(System.in);
        int size, val, dupCount;

        // input
        System.out.print("Enter the size of the list: ");
        size = in.nextInt();

        int[] nums = new int[size];

        System.out.println("Enter list numbers: ");
        for (int i = 0; i < size; i++) {
            System.out.print("> ");
            nums[i] = in.nextInt();
        }

        System.out.print("Enter the element to remove: ");
        val = in.nextInt();

        // processing
        dupCount = r.removeElement(nums, val);

        // output
        System.out.println("\nResult:");
        System.out.printf("%d duplicates and nums = [", dupCount);
        for (int i = 0; i < dupCount; i++) {
            System.out.printf("%d, ", nums[i]);
        }
        System.out.println("]");
    }
}
