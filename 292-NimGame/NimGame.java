import java.util.Scanner;

public class NimGame {
    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }

    public static void main(String[] args) {
        // declaration
        NimGame s = new NimGame();
        Scanner in = new Scanner(System.in);
        int num;
        Boolean res;

        // input
        System.out.print("\nEnter the number of stones in the heap: ");
        num = in.nextInt();

        // processing
        res = s.canWinNim(num);

        // output
        System.out.println("\n\nResult:");
        System.out.printf("You can%s win the game.\n\n", (res ? "" : " not"));
    }
}
