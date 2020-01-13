import java.util.Arrays;
import java.util.Scanner;

public class J4TimeOnTask2013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        int d = sc.nextInt();
        int[] a = new int[d];
        for (int i = 0; i < d; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);

        int counter = 0;
        for (int temp : a) {
            if (time - temp < 0) {
                break;
            }
            counter++;
            time -= temp;
        }
        System.out.println(counter);
    }
}
