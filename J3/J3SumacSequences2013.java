import java.util.Scanner;

public class J3SumacSequences2013 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t1 = sc.nextInt();//120
        int t2 = sc.nextInt();//71
        int counter = 2;//Counter starts at 2 to count for t1 and t2
        sumac(t1, t2, counter);
    }

    public static void sumac(int t1, int t2, int counter) {
        int num = t1 - t2;
        if (t1 - t2 < 0) {
            System.out.println(counter);
        } else {
            t1 = t2;
            t2 = num;
            counter++;
            sumac(t1, t2, counter);
        }
    }
}
