import java.io.*;
import java.util.*;

public class S1SumGame2017 {
    private static class FastReader {
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

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int N = sc.nextInt();
        int fSum = 0;
        int sSum = 0;
        String[] first = sc.nextLine().split(" ");
        String[] second = sc.nextLine().split(" ");
        int bigSum = 0;
        for (int i = 0; i < N; i++){
            fSum += Integer.parseInt(first[i]);
            sSum += Integer.parseInt(second[i]);
            if (fSum == sSum){
                bigSum = i+1;
            }
        }
        System.out.println(bigSum);
    }
}