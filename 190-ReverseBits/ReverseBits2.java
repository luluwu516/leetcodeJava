import java.util.Scanner;

public class ReverseBits2 {
    public int reverseBits(int n) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            res <<= 1;
            res |= (n & 1);
            n >>= 1;
        }
        return res;
    }

    public static void main(String arg[]) {
        // declaration
        ReverseBits2 s = new ReverseBits2();
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
