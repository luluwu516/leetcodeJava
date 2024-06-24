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

public class CountCompleteTreeNodes2 {
    public void preorder(TreeNode root, ArrayList<Integer> res) {
        if (root != null) {
            res.add(root.val);
            preorder(root.left, res);
            preorder(root.right, res);
        } else {
            return;
        }
    }

    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        ArrayList<Integer> res = new ArrayList<>();
        preorder(root, res);
        return res.size();
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
        CountCompleteTreeNodes2 s = new CountCompleteTreeNodes2();
        Scanner in = new Scanner(System.in);
        TreeNode root;
        int res;

        // input
        System.out.print(
                "Enter numbers (separated by spaces) to construct the tree: ");
        String[] input = in.nextLine().split(" ");
        root = constructBinaryTree(input);

        // processing
        res = s.countNodes(root);

        // output
        System.out.println("\nResult:");
        System.out.printf("There are %d nodes in the tree.\n\n", res);
    }
}
