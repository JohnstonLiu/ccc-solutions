import java.util.Scanner;
import java.util.Stack;

public class J4FromPrefix2008 {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            String str = sc.nextLine();
            if (str.equals("0")) {
                return;
            }

            String[] c = str.split(" ");
            for (int i = c.length - 1; i >= 0; i--) {
                if (operator(c[i])) {
                    String temp = st.pop() + " " + st.pop() + " " + c[i];
                    st.push(temp);
                } else {
                    st.push(c[i]);
                }
            }
            System.out.println(st.pop());
        }

    }

    public static boolean operator(String temp) {
        char c = temp.charAt(0);
        return c == '+' || c == '-' || c == '/' || c == '*';
    }

}