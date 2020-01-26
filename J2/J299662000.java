import java.util.Scanner;

public class J299662000 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int max = sc.nextInt();
        int c = 0;
        for (int i = min; i <= max; i++) {//Master For Loop to cycle between the given parameters
            String s = Integer.toString(i);//Better String conversion
            if (!(s.contains("2") || s.contains("3") || s.contains("4") || s.contains("5") || s.contains("7"))) {
                boolean b = false;
                for (int j = 1; j <= s.length() / 2; j++) {
                    String A = s.substring(j - 1, j);
                    String B = s.substring(s.length() - j, s.length() - j + 1);
                    if (A.equals("6") && B.equals("9")) {
                        b = true;
                    } else if (A.equals("9") && B.equals("6")) {
                        b = true;
                    } else if (A.equals(B) && !((A.equals("6") || (A.equals("9"))))) {//Make up for the exception of my blanket if statement
                        b = true;
                    } else {
                        b = false;
                        break;
                    }
                }
                //break goes here
                if (s.length() % 2 == 1) {//Check if I missed a 6 or 9 with my loop
                    String substring = s.substring(s.length() / 2, s.length() / 2 + 1);
                    if (substring.equals("6") || substring.equals("9"))
                        b = false;
                }
                if (b || s.equals("1") || s.equals("8")) {
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}