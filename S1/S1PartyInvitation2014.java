import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class S1PartyInvitation2014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> k = new ArrayList<>();
        for (int i = 0; i < K + 1; i++) {
            k.add(i);
        }
        Queue<Integer> q = new LinkedList<>();


        for (int i = 0; i < m; i++) {
            q.add(sc.nextInt());
        }
        int multiple = 0;
        boolean danger = false;
        while (!danger) {
            for (int i = 0; i < K + 1; i++) {
                if (i == q.peek()) {
                    if (q.size() != 1) {
                        q.poll();
                    } else {
                        danger = true;
                    }
                    multiple = i;
                    break;
                }
            }
            for (int j = multiple; j < k.size(); j += multiple) {
                k.set(j, 0);
            }
            for (int i = 1; i < k.size(); i++) {
                if (k.get(i) == 0) {
                    k.remove(i);
                }
            }
        }
        for (int i = 1; i < k.size(); i++) {
            System.out.println(k.get(i));
        }
    }
}
