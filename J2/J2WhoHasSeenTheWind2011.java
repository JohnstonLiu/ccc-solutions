import java.util.Scanner;

public class J2WhoHasSeenTheWind2011 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        for (int t = 1; t < m; t++)
            if (-6 * t * t * t * t + h * t * t * t + 2 * t * t + t <= 0) {
                System.out.println("The balloon first touches ground at hour:");
                System.out.println(t);
                return;
            }
        System.out.println("The balloon does not touch ground in the given time.");
    }
}
