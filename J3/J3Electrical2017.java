import java.util.Scanner;

public class J3Electrical2017 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int t = sc.nextInt();
        int counter = 0;

        while (b != d) {
            if (b > d) {
                b--;
                counter++;
            } else {
                b++;
                counter++;
            }
        }

        t -= counter;
        boolean normal = false;
        if (a > c) {
            normal = true;
        }

        if (normal) {
            if (t >= (a - c)) {
                if ((a - c) % 2 == 0 && t % 2 == 0) {
                    System.out.println("Y");
                } else if ((a - c) % 2 != 0 && t % 2 != 0) {
                    System.out.println("Y");
                } else {
                    System.out.println("N");
                }
            } else {
                System.out.println("N");
            }
        } else {
            if (t >= (c - a)) {
                if ((c - a) % 2 == 0 && t % 2 == 0) {
                    System.out.println("Y");
                } else if ((c - a) % 2 != 0 && t % 2 != 0) {
                    System.out.println("Y");
                } else {
                    System.out.println("N");
                }
            } else {
                System.out.println("N");
            }
        }
    }
}
