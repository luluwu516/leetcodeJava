import java.util.ArrayList;
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

public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        if (root != null) {
            helper(root, res, "");
        }

        return res;
    }

    private void helper(TreeNode node, List<String> res, String path) {
        if (node != null) {
            path += Integer.toString(node.val);
            if (node.left == null && node.right == null) {
                res.add(path);
            } else {
                path += "->";
                if (node.left != null) {
                    helper(node.left, res, path);
                }
                if (node.right != null) {
                    helper(node.right, res, path);
                }
            }
        }
    }

    public static TreeNode constructBinaryTree(String[] input) {
        if (input == null || input.length == 0 || input[0].equals("-1")) {
            return null;
        }

        TreeNode[] nodes = new TreeNode[input.length];
        for (int i = 0; i < input.length; i++) {
            if (!input[i].equals("-1")) {
                nodes[i] = new TreeNode(Integer.parseInt(input[i]));
            }
        }

        int leftIndex = 1, rightIndex = 2;
        for (int i = 0; i < input.length; i++) {
            if (!input[i].equals("-1")) {
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

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        return helper(root, res);
    }

    public List<Integer> helper(TreeNode root, List<Integer> res) {
        if (root != null) {
            res.add(root.val);
            helper(root.left, res);
            helper(root.right, res);
        }
        return res;
    }

    public static void main(String[] args) {
        // declaration
        BinaryTreePaths s = new BinaryTreePaths();
        Scanner in = new Scanner(System.in);
        TreeNode root;
        List<Integer> original;
        List<String> res;

        // input
        System.out.print(
                "Enter numbers (separated by spaces) to construct the tree: ");
        String[] input = in.nextLine().split(" ");
        System.out.println();
        root = constructBinaryTree(input);
        original = s.preorderTraversal(root);

        // processing
        res = s.binaryTreePaths(root);

        // output
        System.out.println("\nOriginal (preorder):");
        for (int val : original) {
            System.out.print(val + " ");
        }
        System.out.println("\nResult:");
        for (String val : res) {
            System.out.print(val + " ");
        }
        System.out.println("");
    }
}
