import java.util.Scanner;

public class J1Fine2012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int speed = sc.nextInt();
        if (speed > limit && speed < limit + 21) {
            System.out.println("You are speeding and your fine is $100.");
        } else if (speed > limit + 20 && speed < limit + 31) {
            System.out.println("You are speeding and your fine is $270.");
        } else if (speed > limit + 31) {
            System.out.println("You are speeding and your fine is $500.");
        } else {
            System.out.println("Congratulations, you are within the speed limit!");
        }
    }
}
