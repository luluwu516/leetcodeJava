import java.util.Scanner;

public class ReverseBits {
    public int reverseBits(int n) {
        return Integer.reverse(n);
    }

    public static void main(String arg[]) {
        // declaration
        ReverseBits s = new ReverseBits();
        int binaryNum, res;
        Scanner in = new Scanner(System.in);

        // input
        System.out.print("\nEnter the binary number: ");
        binaryNum = in.nextInt();

        // processing
        res = s.reverseBits(binaryNum);

        // output
        System.out.println("\n\nResult:");
        System.out.printf("The return number in decimal representation is '%d'\n\n", res);
    }
}
