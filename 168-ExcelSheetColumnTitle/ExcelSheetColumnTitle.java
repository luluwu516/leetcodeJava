import java.util.Scanner;

public class ExcelSheetColumnTitle {
    public String convertToTitle(int columnNumber) {
        if (columnNumber == 0) {
            return "";
        }
        return convertToTitle((columnNumber - 1) / 26) + (char) ('A' + (columnNumber - 1) % 26);
    }

    public static void main(String[] args) {
        // declaration
        ExcelSheetColumnTitle s = new ExcelSheetColumnTitle();
        Scanner in = new Scanner(System.in);
        int columnNumber;
        String res;

        // input
        System.out.print("\nEnter the column number: ");
        columnNumber = in.nextInt();

        // processing
        res = s.convertToTitle(columnNumber);

        // output
        System.out.println("\n\nResult:");
        System.out.printf("The corresponding column title is '%s'\n\n", res);
    }
}
