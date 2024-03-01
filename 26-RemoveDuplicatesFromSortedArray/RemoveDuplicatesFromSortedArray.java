import java.util.Scanner;

public class RemoveDuplicatesFromSortedArray {
  public int removeDuplicates(int[] nums) {
    if (nums.length <= 1) {
      return nums.length;
    }

    int unique = 1;
    for (int i = 1; i < nums.length; i++) {
      if (nums[i - 1] != nums[i]) {
        nums[unique] = nums[i];
        unique++;
      }
    }

    return unique;
  }

  public static void main(String[] args) {
    // declaration
    RemoveDuplicatesFromSortedArray r = new RemoveDuplicatesFromSortedArray();
    Scanner in = new Scanner(System.in);
    int size, uniqueNumCount;

    // input
    System.out.print("Enter the size of the list: ");
    size = in.nextInt();

    int[] nums = new int[size];

    System.out.println("Enter list numbers: ");
    for (int i = 0; i < size; i++) {
      System.out.print("> ");
      nums[i] = in.nextInt();
    }

    // processing
    uniqueNumCount = r.removeDuplicates(nums);

    // output
    System.out.println("\nResult:");
    System.out.printf("%d unique number(s). nums = [", uniqueNumCount);
    for (int i = 0; i < uniqueNumCount; i++) {
      System.out.printf("%d, ", nums[i]);
    }
    System.out.println("]");
  }
}
