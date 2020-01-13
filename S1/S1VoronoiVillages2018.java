import java.util.Arrays;
import java.util.Scanner;

public class S1VoronoiVillages2018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int[] a = new int[d];
        for (int i = 0; i < d; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        double currentHood = 0;
        double newHood = 0;
        for (int i = 0, j = 2; j < d; i++, j++) {
            double fDif = a[j] - a[j - 1];
            double bDif = a[i + 1] - a[i];
            newHood = (fDif + bDif) / 2;
            if (newHood < currentHood || currentHood == 0) {
                currentHood = newHood;
            }
        }
        System.out.printf("%.1f\n", currentHood);
    }
}
