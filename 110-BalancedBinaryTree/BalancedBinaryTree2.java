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

public class BalancedBinaryTree2 {
    class BooleanWrapper {
        boolean value;

        BooleanWrapper(boolean value) {
            this.value = value;
        }
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        BooleanWrapper res = new BooleanWrapper(true);
        check(root, res);
        return res.value;
    }

    public int check(TreeNode root, BooleanWrapper res) {
        if (root == null) {
            return 0;
        }
        int left = check(root.left, res);
        int right = check(root.right, res);

        if (Math.abs(left - right) > 1) {
            res.value = false;
        }

        return Math.max(left, right) + 1;
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
        BalancedBinaryTree2 solution = new BalancedBinaryTree2();
        Scanner in = new Scanner(System.in);
        TreeNode root;
        boolean result;

        // input
        System.out.println(
                "\nEnter the values to construct the binary tree (separated by spaces, enter -1 for null nodes):");
        System.out.print("> ");
        String[] input = in.nextLine().split(" ");
        root = constructBinaryTree(input);

        // processing
        result = solution.isBalanced(root);

        // output
        System.out.println("\nResult:");
        System.out.printf("The tree is %s\n\n", result ? "balanced" : "not balanced");
    }
}
