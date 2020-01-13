import java.util.Scanner;

public class J3DealOrNoDeal2013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] cases = {100, 500, 1000, 5000, 10000, 25000, 50000, 100000, 500000, 1000000};
        int d = sc.nextInt();
        for (int i = 0; i < d; i++) {
            cases[sc.nextInt() - 1] = 0;
        }
        if (sc.nextInt() > average(cases)) {
            System.out.println("deal");
            return;
        }
        System.out.println("no deal");
    }

    public static int average(int[] a) {
        int sum = 0;
        int len = a.length;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                sum += a[i];
            } else {
                len--;
            }
        }
        return sum / len;
    }
}
