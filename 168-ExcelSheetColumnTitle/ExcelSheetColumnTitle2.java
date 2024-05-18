import java.util.Scanner;

public class ExcelSheetColumnTitle2 {
    public String convertToTitle(int columnNumber) {
        String res = "";
        while (columnNumber > 0) {
            res = (char) ('A' + (columnNumber - 1) % 26) + res;
            columnNumber = (columnNumber - 1) / 26;
        }

        return res;
    }

    public static void main(String[] args) {
        // declaration
        ExcelSheetColumnTitle2 s = new ExcelSheetColumnTitle2();
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
