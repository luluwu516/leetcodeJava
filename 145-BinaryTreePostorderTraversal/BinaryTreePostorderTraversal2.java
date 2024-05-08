import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
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

public class BinaryTreePostorderTraversal2 {
    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<Integer>();
        }

        Deque<Integer> res = new ArrayDeque<>();
        Deque<TreeNode> stack = new ArrayDeque<>();

        stack.push(root);

        while (!stack.isEmpty()) {
            root = stack.pop();
            res.push(root.val);

            if (root.left != null) {
                stack.push(root.left);
            }

            if (root.right != null) {
                stack.push(root.right);
            }
        }

        return new ArrayList<Integer>(res);
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
        BinaryTreePostorderTraversal2 s = new BinaryTreePostorderTraversal2();
        Scanner in = new Scanner(System.in);
        List<Integer> result;
        TreeNode root;

        // input
        System.out.println(
                "Enter the values to construct the binary tree (separated by spaces, enter -1 for null nodes):");
        String[] input = in.nextLine().split(" ");
        root = constructBinaryTree(input);

        // processing
        result = s.postorderTraversal(root);

        // output
        System.out.println("\nPreorder Traversal Result: ");
        for (Integer val : result) {
            System.out.print(val + " ");
        }
        System.out.println("");
    }
}
