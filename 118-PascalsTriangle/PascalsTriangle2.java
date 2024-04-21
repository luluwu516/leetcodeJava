import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class PascalsTriangle2 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            res.add(generateRow(i));
        }
        return res;
    }

    public static List<Integer> generateRow(int row) {
        List<Integer> newRow = new ArrayList<>();
        newRow.add(1);
        int ans = 1;
        for (int col = 1; col < row; col++) {
            ans = ans * (row - col);
            ans = ans / col;
            newRow.add(ans);
        }
        return newRow;
    }

    public static void main(String[] args) {
        // declaration
        PascalsTriangle2 solution = new PascalsTriangle2();
        Scanner in = new Scanner(System.in);
        int row;
        List<List<Integer>> result;

        // input
        System.out.print("Enter the row: ");
        row = in.nextInt();

        // processing
        result = solution.generate(row);

        // output
        System.out.println("\nResult:");
        for (List<Integer> r : result) {
            for (int v : r) {
                System.out.printf("%d ", v);
            }
            System.out.println();
        }
    }
}
