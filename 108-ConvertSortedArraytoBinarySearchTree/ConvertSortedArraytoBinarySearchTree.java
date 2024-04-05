import java.util.Scanner;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class ConvertSortedArraytoBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        return helper(nums, 0, nums.length - 1);
    }

    public TreeNode helper(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = left + (right - left) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums, left, mid - 1);
        root.right = helper(nums, mid + 1, right);

        return root;
    }

    void printBT(String prefix, TreeNode node, Boolean isLeft) {
        if (node != null) {
            System.out.printf("%s", prefix);
            System.out.print(isLeft ? "|-- " : "L-- ");
            System.out.printf("%d\n", node.val);
            printBT(prefix + (isLeft ? "|   " : "    "), node.right, true);
            printBT(prefix + (isLeft ? "|   " : "    "), node.left, false);
        }
    }

    void printBT(TreeNode node) {
        printBT("", node, false);
    }

    public static void main(String[] args) {
        // declaration
        ConvertSortedArraytoBinarySearchTree solution = new ConvertSortedArraytoBinarySearchTree();
        Scanner in = new Scanner(System.in);
        int size;
        TreeNode result;

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
        result = solution.sortedArrayToBST(nums);

        // output
        System.out.println("\nResult:\n");
        solution.printBT(result);
    }
}
