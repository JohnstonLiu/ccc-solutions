import java.util.Scanner;

public class J5PiDay2015 {
    static int c = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        if (k == 1 || k == n) {
            System.out.println(1);
        } else {
            int[] a = new int[k];
            foo(0, a, n);
            System.out.println(c);
        }

    }

    //memoization
    public static void foo(int index, int[] orig, int rem) {

        if (index == orig.length - 1) {
            if (rem >= orig[index - 1]) {
                c++;
                return;
            } else {
                return;
            }
        }

        int[] temp = orig.clone();
        int k = orig.length - index;//remaining length

        if (index != 0) {
            if (rem / k < temp[index - 1]) {
                return;
            }
            for (int i = 0; temp[index - 1] + i <= rem / k; i++) {
                temp[index] = temp[index - 1] + i;
                foo(index + 1, temp, rem - temp[index]);
            }
        } else {
            for (int i = 1; i <= rem / k; i++) {
                temp[index] = i;
                foo(index + 1, temp, rem - temp[index]);
            }
        }
    }


}
