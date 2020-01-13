import java.util.Scanner;

public class J2VoteCount2014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int votes = sc.nextInt();
        sc.nextLine();
        String type = sc.nextLine();
        int counterA = 0;
        int counterB = 0;

        for (int i = 0; i < votes; i++) {
            if (type.charAt(i) == 'A') {
                counterA++;
            } else if (type.charAt(i) == 'B') {
                counterB++;
            }
        }

        if (counterB > counterA) {
            System.out.println("B");
        } else if (counterA > counterB) {
            System.out.println("A");
        } else {
            System.out.println("Tie");
        }

    }
}
