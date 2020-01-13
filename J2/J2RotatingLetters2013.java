import java.util.Scanner;

public class J2RotatingLetters2013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (!(str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'S' || str.charAt(i) == 'H' || str.charAt(i) == 'Z' || str.charAt(i) == 'X' || str.charAt(i) == 'N')) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
