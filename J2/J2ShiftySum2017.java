import java.util.Scanner;

public class J2ShiftySum2017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k = sc.nextInt();
        int temp;
        int temp2 = N;

        for (int i = 0; i < k; i++) {
            temp = N * 10;
            N = N * 10;
            temp2 += temp;

        }
        System.out.println(temp2);
    }
}
