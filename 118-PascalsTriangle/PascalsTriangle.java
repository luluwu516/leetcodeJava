import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if (numRows == 0) {
            return res;
        }

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        res.add(firstRow);

        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = res.get(i - 1);
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(1);

            for (int j = 1; j < i; j++) {
                currentRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            currentRow.add(1);
            res.add(currentRow);
        }

        return res;
    }

    public static void main(String[] args) {
        // declaration
        PascalsTriangle solution = new PascalsTriangle();
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
