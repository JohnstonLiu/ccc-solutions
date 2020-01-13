import java.util.Scanner;

public class J4BigBangSecrets2012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        String ret = "";
        for (int i = 0; i < str.length(); i++) {
            int j = i + 1;
            char c = str.charAt(i);
            c -= k;
            c -= 3 * j;
            if (c < 'A') {
                c += 26;
            }
            ret += c;
        }
        System.out.println(ret);
    }
}
