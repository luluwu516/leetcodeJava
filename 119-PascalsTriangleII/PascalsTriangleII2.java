import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class PascalsTriangleII2 {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> res = new ArrayList<>();

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        res.add(firstRow);

        for (int i = 1; i < rowIndex + 1; i++) {
            List<Integer> prevRow = res.get(i - 1);
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(1);

            for (int j = 1; j < i; j++) {
                currentRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            currentRow.add(1);
            res.add(currentRow);
        }

        return res.get(rowIndex);
    }

    public static void main(String[] args) {
        // declaration
        PascalsTriangleII2 solution = new PascalsTriangleII2();
        Scanner in = new Scanner(System.in);
        int row;
        List<Integer> result;

        // input
        System.out.print("Enter the row: ");
        row = in.nextInt();

        // processing
        result = solution.getRow(row);

        // output
        System.out.println("\nResult:");
        for (int v : result) {
            System.out.printf("%d ", v);
        }
        System.out.println();
    }
}
