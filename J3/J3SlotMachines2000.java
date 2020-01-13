import java.util.Scanner;

public class J3SlotMachines2000 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quarters = sc.nextInt();

        int firstPlayed = sc.nextInt();
        int secondPlayed = sc.nextInt();
        int thirdPlayed = sc.nextInt();

        int counter = 0;

        while (quarters > 0) {
            quarters -= 1;
            counter += 1;
            firstPlayed += 1;

            if (firstPlayed == 35) {
                quarters += 30;
                firstPlayed = 0;
            }
            if (quarters == 0) break;

            quarters -= 1;
            counter += 1;
            secondPlayed += 1;

            if (secondPlayed == 100) {
                quarters += 65;
                secondPlayed = 0;
            }
            if (quarters == 0) break;

            quarters -= 1;
            counter += 1;
            thirdPlayed += 1;

            if (thirdPlayed == 10) {
                quarters += 9;
                thirdPlayed = 0;
            }
            if (quarters == 0) break;
        }
        System.out.println("Martha plays " + counter + " times before going broke.");
    }
}
