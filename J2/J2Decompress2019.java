import java.util.Scanner;

public class J2Decompress2019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < d; i++) {
            int num = sc.nextInt();
            String c = sc.next();
            sc.nextLine();
            System.out.println();
            for (int j = 0; j < num; j++) {
                System.out.print(c);
            }
        }
    }
}
