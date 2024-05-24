import java.util.Scanner;

public class ExcelSheetColumnNumber {
    public int titleToNumber(String columnTitle) {
        int sum = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            sum = sum * 26 + (columnTitle.charAt(i) - 'A' + 1);
        }

        return sum;
    }

    public static void main(String[] args) {
        // declaration
        ExcelSheetColumnNumber s = new ExcelSheetColumnNumber();
        Scanner in = new Scanner(System.in);
        String columnTitle;
        int res;

        // input
        System.out.print("\nEnter the column title: ");
        columnTitle = in.next();

        // processing
        res = s.titleToNumber(columnTitle);

        // output
        System.out.println("\n\nResult:");
        System.out.printf("The column number is '%d'\n\n", res);
    }
}
