import java.util.Scanner;
import java.util.Stack;

public class S3GenevaConfection2014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < testCases; i++) {
            int total = sc.nextInt();
            for (int j = 0; j < total; j++) {
                st.push(sc.nextInt());
            }
            if (solution(st, new Stack<>(), total, 1)) {
                System.out.println('Y');
            } else {
                System.out.println('N');
            }
        }
    }

    public static boolean solution(Stack<Integer> st, Stack<Integer> branch, int total, int target) {
        if (st.size() != 0) {//Check branch every time i run through stack regardless of size
            if (st.peek() == target) {
                st.pop();
                return solution(st, branch, total, target + 1);
            } else {
                if (branch.size() > 0 && branch.peek() == target) {
                    branch.pop();
                    return solution(st, branch, total, target + 1);
                }
                branch.push(st.pop());
                return solution(st, branch, total, target);
            }
        } else {
            if (branch.size() == 0 && target == total + 1) {
                return true;
            }
            if (branch.peek() == target) {
                branch.pop();
                return solution(st, branch, total, target + 1);
            } else
                return false;
        }
    }
}