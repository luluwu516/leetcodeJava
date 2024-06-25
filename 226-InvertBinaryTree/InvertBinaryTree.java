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

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }

        TreeNode temp;
        temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
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

    public static void main(String[] args) {
        // declaration
        InvertBinaryTree s = new InvertBinaryTree();
        Scanner in = new Scanner(System.in);
        TreeNode root;
        List<Integer> original, res;

        // input
        System.out.print(
                "Enter numbers (separated by spaces) to construct the tree: ");
        String[] input = in.nextLine().split(" ");
        System.out.println();
        root = constructBinaryTree(input);
        original = s.preorderTraversal(root);

        // processing
        root = s.invertTree(root);

        // output
        System.out.println("\nOriginal:");
        for (int val : original) {
            System.out.print(val + " ");
        }
        System.out.println("\nResult:");
        res = s.preorderTraversal(root);
        for (int val : res) {
            System.out.print(val + " ");
        }
        System.out.println("");
    }
}
