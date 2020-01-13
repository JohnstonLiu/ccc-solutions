import java.util.Scanner;

public class J5Bananas2005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String word = sc.nextLine();
            if (word.equals("X")) {
                break;
            }
            if (monk(word)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean monk(String str) {
        int len = str.length();
        if (len < 3) {
            return str.equals("A");
        }

        if (str.charAt(0) == 'B') {
            int sPos = findS(str);
            if (sPos > 1) {
                boolean implicit = monk(str.substring(1, sPos));
                if (implicit) {
                    return monk(str.substring(1, sPos) + str.substring(sPos + 1));
                }
                return false;
            } else {
                return false;
            }
        } else if (str.charAt(0) == 'A') {
            if (str.charAt(1) == 'N') {
                return monk(str.substring(2));
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static int findS(String str) {
        int miniStack = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'B') miniStack += 1;

            if (str.charAt(i) == 'S') {
                miniStack--;
                if (miniStack == 0) {
                    return i;
                }
            }
        }
        return -1;
    }
}
