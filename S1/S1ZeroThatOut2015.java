import java.util.Scanner;
import java.util.Stack;

public class S1ZeroThatOut2015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int d = sc.nextInt();
        for (int i = 0; i < d; i++) {
            int x = sc.nextInt();
            if (x == 0) {
                st.pop();
            } else
                st.push(x);
        }
        int sum = 0;
        while (st.size() != 0) {
            sum += st.pop();
        }
        System.out.println(sum);
    }
}
