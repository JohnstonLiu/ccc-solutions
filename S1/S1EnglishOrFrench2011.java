import java.util.Scanner;

public class S1EnglishOrFrench2011 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counterT = 0;
        int counterS = 0;
        for (int i = 0; i <= n; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < line.length(); j++) {
                if (line.charAt(j) == 's' || line.charAt(j) == 'S') {
                    counterS++;
                } else if (line.charAt(j) == 't' || line.charAt(j) == 'T') {
                    counterT++;
                }
            }
        }

        if (counterT > counterS) {
            System.out.println("English");
        } else {
            System.out.println("French");
        }
    }
}
