import java.io.*;
import java.util.*;

public class S4Golf2000 {
    static int[] clubs;
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int distance = sc.nextInt();
        int d = sc.nextInt();
        clubs = new int[d];
        for (int i = 0; i < d; i++){
            clubs[i] = sc.nextInt();
        }

        Arrays.sort(clubs);

        for(int i = 0; i < clubs.length / 2; i++)
        {
            int temp = clubs[i];
            clubs[i] = clubs[clubs.length - i - 1];
            clubs[clubs.length - i - 1] = temp;
        }
        if (!d(distance, 0, 0)){
            System.out.println("Roberta acknowledges defeat.");
        }
    }

    public static boolean d(int distance, int i, int counter){
        if (distance == 0){
            System.out.println("Roberta wins in " + counter + " strokes.");
            return true;
        }
        if (i == clubs.length){
            return false;
        }

        int q = distance / clubs[i];
        for (int j = 0; j < q; j++){
            if (d(distance - clubs[i]*(q-j), i + 1, counter + (q-j))){
                return true;
            }
        }
        return d(distance, i + 1, counter);
    }



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
}
