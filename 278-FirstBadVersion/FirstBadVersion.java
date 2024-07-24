import java.util.ArrayList;
import java.util.Scanner;

public class FirstBadVersion {
    private int badVersion = 0;

    boolean isBadVersion(int version) {
        return version == badVersion;
    }

    public int firstBadVersion(int n) {
        int left = 1, right = n;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public void setBadVersion(int bad) {
        badVersion = bad;
    }

    public static void main(String[] args) {
        // declaration
        FirstBadVersion s = new FirstBadVersion();
        Scanner in = new Scanner(System.in);
        int n, bad, res;

        // input
        System.out.print("Enter the bad version: ");
        bad = in.nextInt();
        s.setBadVersion(bad);
        System.out.print("\nEnter n: ");
        n = in.nextInt();

        // processing
        res = s.firstBadVersion(n);

        // output
        System.out.println("\n\nResult:");
        System.out.printf("Version %d is the first bad version\n\n", res);
    }
}
