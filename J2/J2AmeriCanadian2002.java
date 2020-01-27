import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class J2AmeriCanadian2002 {
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

        while (true){
            String str = sc.nextLine();
            if (str.equals("quit!")){
                return;
            }

            if (str.length() > 4 && (cons(str.charAt(str.length()-3)) && str.substring(str.length()-2).equals("or"))){
                System.out.println(str.substring(0, str.length()-1) + 'u' + str.substring(str.length()-1));
            }else{
                System.out.println(str);
            }

        }
    }

    public static boolean cons(char c){
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};
        for (char temp : vowels){
            if (temp == c){
                return false;
            }
        }
        return true;
    }
}
