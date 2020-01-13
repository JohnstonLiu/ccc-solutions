import java.util.Scanner;

public class J1TournamentSelection2016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        for (int i = 0; i < 6; i++) {
            String winLoss = sc.next();
            if (winLoss.equals("W")) {
                counter++;
            }
            sc.nextLine();
        }

        if (counter == 5 || counter == 6) {
            System.out.println(1);
        } else if (counter == 1 || counter == 2) {
            System.out.println(3);
        } else if (counter == 3 || counter == 4) {
            System.out.println(2);
        } else {
            System.out.println(-1);
        }
    }
}
