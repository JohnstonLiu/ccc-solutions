import java.util.Scanner;

public class J4Sunflowers2018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] A = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        recursion(A);
    }

    public static boolean check(int[][] A, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (A[i][j] > A[i][j + 1]) {
                    return false;
                }
                if (A[j][i] > A[j][i + 1]) {
                    return false;
                }
                if (A[j][i] > A[j + 1][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int[][] rotate(int[][] a) {
        int[][] temp = new int[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                temp[j][i] = a[a.length - 1 - i][j];
            }
        }
        return temp;
    }

    public static void recursion(int[][] A) {
        int n = A.length;
        if (check(A, n)) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(A[i][j] + " ");
                }
                System.out.println();
            }
            return;
        } else {
            recursion(rotate(A));
        }
    }
}
