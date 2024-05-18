import java.util.Scanner;

public class ExcelSheetColumnTitle3 {
    public String convertToTitle(int columnNumber) {
        StringBuffer sb = new StringBuffer();

        while (columnNumber > 0) {
            columnNumber--;
            sb.append((char) ('A' + (columnNumber % 26)));
            columnNumber /= 26;
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        // declaration
        ExcelSheetColumnTitle3 s = new ExcelSheetColumnTitle3();
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
