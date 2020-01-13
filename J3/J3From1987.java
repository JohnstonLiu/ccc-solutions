import java.util.Scanner;

public class J3From1987 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int temp = Integer.parseInt(n) + 1;
        n = Integer.toString(temp);
        boolean found = false;
        if (temp < 10) {
            System.out.println(temp);
            return;
        }
        while (!found) {
            boolean good = true;
            int nInt = Integer.parseInt(n);
            label:
            for (int j = 0; j < n.length(); j++) {
                for (int i = j + 1; i < n.length(); i++) {
                    if (n.charAt(j) == n.charAt(i)) {
                        good = false;
                        break label;
                    } else if (good && j == n.length() - 2 && i == n.length() - 1) {
                        System.out.println(n);
                        found = true;
                    }
                }
            }

            nInt++;
            n = Integer.toString(nInt);
        }
    }
}
