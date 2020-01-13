import java.util.Scanner;

public class J3SmileWithSimiles2004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        String[] adj = new String[n];
        String[] nouns = new String[m];
        for (int i = 0; i < n; i++) {
            adj[i] = sc.nextLine();
        }
        for (int i = 0; i < m; i++) {
            nouns[i] = sc.nextLine();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println(adj[i] + " as " + nouns[j]);
            }
        }
    }
}
