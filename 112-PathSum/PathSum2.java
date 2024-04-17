import java.util.List;
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

public class PathSum2 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return helper(root, 0, targetSum);
    }

    public boolean helper(TreeNode root, int count, int targetSum) {
        if (root == null) {
            return false;
        }

        count += root.val;

        if (root.left == null && root.right == null) {
            return count == targetSum;
        }
        boolean left = helper(root.left, count, targetSum);
        boolean right = helper(root.right, count, targetSum);

        return left || right;
    }

    public static TreeNode constructBinaryTree(String[] input) {
        if (input == null || input.length == 0 || input[0].equals("-1"))
            return null;

        TreeNode[] nodes = new TreeNode[input.length];
        for (int i = 0; i < input.length; i++) {
            if (!input[i].equals("-1")) {
                nodes[i] = new TreeNode(Integer.parseInt(input[i]));
            }
        }

        int leftIndex = 1;
        int rightIndex = 2;

        for (int i = 0; i < input.length; i++) {
            if (nodes[i] != null) {
                if (leftIndex < input.length) {
                    nodes[i].left = nodes[leftIndex];
                }
                if (rightIndex < input.length) {
                    nodes[i].right = nodes[rightIndex];
                }
                leftIndex += 2;
                rightIndex += 2;
            }

        }

        return nodes[0];
    }

    public static void main(String[] args) {
        // declaration
        PathSum2 solution = new PathSum2();
        Scanner in = new Scanner(System.in);
        TreeNode root;
        int targetSum;
        boolean result;

        // input
        System.out.println(
                "\nEnter the values to construct the binary tree (separated by spaces, enter -1 for null nodes):");
        System.out.print("> ");
        String[] input = in.nextLine().split(" ");
        root = constructBinaryTree(input);

        System.out.print("Enter the target sum: ");
        targetSum = in.nextInt();

        // processing
        result = solution.hasPathSum(root, targetSum);

        // output
        System.out.println("\nResult:");
        System.out.printf("The root-to-leaf path with the target sum is %s\n\n", result ? "shown" : "not shown");
    }
}
