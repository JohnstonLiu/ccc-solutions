import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S3NailedIt2017 {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int d = sc.nextInt();
        int[] L = new int[2001];
        for (int i = 0; i < d; i++) {
            int x = sc.nextInt();
            L[x] += 1;
        }

        int[] F = new int[4001];
        for (int i = 1; i < 2001; i++) {
            if (L[i] > 1) {
                F[i * 2] += L[i] / 2;
            }
            for (int j = i + 1; j < 2001; j++) {
                F[i + j] += Math.min(L[i], L[j]);
            }
        }


        int counter = 1;
        int big = 0;
        for (int i = 1; i < 4001; i++) {
            if (F[i] == big) {
                counter += 1;
            } else if (F[i] > big) {
                counter = 1;
                big = F[i];
            }
        }
        //printStuff(L);
        //printStuff(F);

        System.out.println(big + " " + counter);
    }

    public static void printStuff(int[] a) {
        for (int i = 1; i < a.length; i++) {
            if (a[i] != 0) {
                System.out.print(i + " " + a[i] + ", ");
            }
        }
        System.out.println();
    }


}

class FastReader {
    BufferedReader br;
    StringTokenizer st;

    public FastReader() {
        br = new BufferedReader(new
                InputStreamReader(System.in));
    }

    String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt() {
        return Integer.parseInt(next());
    }

    long nextLong() {
        return Long.parseLong(next());
    }

    double nextDouble() {
        return Double.parseDouble(next());
    }

    String nextLine() {
        String str = "";
        try {
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}

