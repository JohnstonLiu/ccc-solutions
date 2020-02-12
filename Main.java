import java.util.*;

public class Main {
    static int[][][] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        dp = new int[n + 1][k + 1][n];
        System.out.println(brain(n, k, 1));
    }

    public static int brain(int n, int k, int min) {
        if (dp[n][k][min] == 0) {

            if (k == n || k == 1) {
                dp[n][k][min] = 1;
            } else {
                int sum = 0;
                for (int i = min; i <= n / k; i++) {//Start with the first person and the imnimum number of slices thjey get and go up
                    sum += brain(n - i, k - 1, i);//n-i because you have to subtract the pi's you gave to the person
                    //k-1 because you occupied one person
                }
                dp[n][k][min] = sum;
            }

        }

        return dp[n][k][min];
    }
}