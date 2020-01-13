import java.util.Scanner;

public class J2MagicSquares2016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int n = 0; n < 4; n++) {
                a[i][n] = sc.nextInt();
            }
        }
        int rowSum = a[0][1] + a[0][2] + a[0][3] + a[0][0];
        int colSum = a[0][0] + a[1][0] + a[2][0] + a[3][0];
        for (int i = 1; i < 4; i++) {
            if (a[i][1] + a[i][2] + a[i][0] + a[i][3] != rowSum) {
                System.out.println("not magic");
                return;
            }
        }
        for (int i = 1; i < 4; i++) {
            if (a[1][i] + a[2][i] + a[0][i] + a[3][i] != colSum) {
                System.out.println("not magic");
                return;
            }
        }
        System.out.println("magic");
    }
}
