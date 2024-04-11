import java.util.List;
import java.util.Scanner;
import java.lang.Math;

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

public class MinimumDepthofBinaryTree {
    public int minDepth(TreeNode root) {
        return helper(root);
    }

    public int helper(TreeNode root) {
        if (root == null) {
            return 0;
        } else if (root.left == null && root.right == null) {
            return 1;
        } else if (root.left == null) {
            return helper(root.right) + 1;
        } else if (root.right == null) {
            return helper(root.left) + 1;
        }

        return Math.min(helper(root.left), helper(root.right)) + 1;
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
        MinimumDepthofBinaryTree solution = new MinimumDepthofBinaryTree();
        Scanner in = new Scanner(System.in);
        TreeNode root;
        int result;

        // input
        System.out.println(
                "\nEnter the values to construct the binary tree (separated by spaces, enter -1 for null nodes):");
        System.out.print("> ");
        String[] input = in.nextLine().split(" ");
        root = constructBinaryTree(input);

        // processing
        result = solution.minDepth(root);

        // output
        System.out.println("\nResult:\n");
        System.out.printf("The minimum depth of the tree is %d\n\n", result);
    }
}
