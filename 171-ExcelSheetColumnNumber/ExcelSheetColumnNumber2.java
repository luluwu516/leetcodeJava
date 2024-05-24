import java.util.Scanner;

public class ExcelSheetColumnNumber2 {
    public int titleToNumber(String columnTitle) {
        int sum = 0;
        int unit = columnTitle.length() - 1;
        for (int i = 0; i < columnTitle.length(); i++) {
            sum += (columnTitle.charAt(i) - 'A' + 1) * Math.pow(26, unit);
            unit--;
        }

        return sum;
    }

    public static void main(String[] args) {
        // declaration
        ExcelSheetColumnNumber2 s = new ExcelSheetColumnNumber2();
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
