import java.util.Scanner;

public class J3HiddenPalindrome2016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        int current = 1;
        for (int i = 0; i <= str.length(); i++) {
            for (int j = i + 2; j <= str.length(); j++) {
                if (check(str.substring(i, j)) && str.substring(i, j).length() > current) {
                    current = str.substring(i, j).length();
                }
            }
        }
        System.out.println(current);
    }

    public static boolean check(String str) {
        int j = str.length() - 1;
        int counter = 0;
        int num = str.length() / 2;
        for (int i = 0; i < str.length() / 2; i++, j--) {
            if (str.charAt(i) == str.charAt(j)) {
                counter++;
            }
        }
        return counter == num;
    }
}
