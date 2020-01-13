import java.util.Scanner;
import java.util.Stack;

public class J3ReturningHome2005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack st = new Stack();
        for (int i = 0; i < 5; i++) {
            char c = sc.nextLine().charAt(0);
            st.push(c);
            String str = sc.nextLine();
            if (str.equals("SCHOOL")) {
                break;
            } else {
                st.push(str);
            }
        }

        while (true) {
            if (st.size() == 1) {
                if (st.peek().equals('R')) {
                    System.out.println("Turn LEFT into your HOME.");
                    break;
                } else {
                    System.out.println("Turn RIGHT into your HOME.");
                    break;
                }
            }
            if (st.pop().equals('R')) {
                System.out.println("Turn LEFT onto " + st.pop() + " street.");
            } else {
                System.out.println("Turn RIGHT onto " + st.pop() + " street.");
            }
        }
    }
}
