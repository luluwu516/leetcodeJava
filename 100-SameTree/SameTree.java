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

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if ((p == null) && (q == null)) {
            return true;
        }
        if ((p == null) || (q == null)) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
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
        SameTree solution = new SameTree();
        Scanner in = new Scanner(System.in);
        TreeNode root1, root2;
        Boolean result;

        // input
        System.out.println(
                "Enter the values to construct the binary tree (separated by spaces, enter -1 for null nodes)");
        System.out.println("The first tree: ");
        String[] input = in.nextLine().split(" ");
        root1 = constructBinaryTree(input);

        System.out.println("The second tree: ");
        input = in.nextLine().split(" ");
        root2 = constructBinaryTree(input);

        // processing
        result = solution.isSameTree(root1, root2);

        // output
        System.out.println("\nResult:");
        if (result) {
            System.out.println("They are the same tree");
        } else {
            System.out.println("They are not the same tree");
        }
    }
}
