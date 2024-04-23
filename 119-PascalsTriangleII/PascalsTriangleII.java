import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class PascalsTriangleII {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> newRow = new ArrayList<>();
        newRow.add(1);
        long val = 1;
        for (int i = 1; i < rowIndex + 1; i++) {
            val = val * (rowIndex + 1 - i);
            val = val / i;
            newRow.add((int) val);
        }
        return newRow;
    }

    public static void main(String[] args) {
        // declaration
        PascalsTriangleII solution = new PascalsTriangleII();
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
