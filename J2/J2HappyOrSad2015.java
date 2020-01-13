import java.util.Scanner;

public class J2HappyOrSad2015 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int counterH = 0, counterS = 0;
        for (int i = 0; i < text.length() - 2; i++) {
            if (text.charAt(i) == ':' && text.charAt(i + 1) == '-' && text.charAt(i + 2) == ')') {
                counterH++;
            } else if (text.charAt(i) == ':' && text.charAt(i + 1) == '-' && text.charAt(i + 2) == '(') {
                counterS++;
            }
        }
        if (counterH + counterS == 0) {
            System.out.println("none");
        } else if (counterH == counterS) {
            System.out.println("unsure");
        } else if (counterH > counterS) {
            System.out.println("happy");
        } else {
            System.out.println("sad");
        }
    }
}
