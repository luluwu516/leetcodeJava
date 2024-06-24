import java.util.Deque;
import java.util.LinkedList;
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

public class CountCompleteTreeNodes3 {
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Deque<TreeNode> queue = new LinkedList<>();
        int level = 1;
        int res = 0;
        queue.offerFirst(root);
        while (!queue.isEmpty() && res == 0) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.pollLast();
                if (curr.left == null) {
                    res = (int) (Math.pow(2, level) - 1) + i * 2;
                    break;
                } else if (curr.right == null) {
                    res = ((int) Math.pow(2, level)) + i * 2;
                    break;
                } else {
                    queue.offerFirst(curr.left);
                    queue.offerFirst(curr.right);
                }
            }
            level++;
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
        CountCompleteTreeNodes3 s = new CountCompleteTreeNodes3();
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
