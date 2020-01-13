import java.util.Scanner;

public class J3DoubleDice2014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = 100, B = 100;
        int rounds = sc.nextInt();
        for (int i = 0; i < rounds; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a < b) A -= b;
            if (a > b) B -= a;
        }
        System.out.println(A + "\n" + B);
    }
}
