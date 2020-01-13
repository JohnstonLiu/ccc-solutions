import java.util.Scanner;

public class J3Rovarspraket2015 {
    static char[] vowels = {'a', 'e', 'i', 'o', 'u'};

    //static int offset = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (!checkVowel(str.charAt(i))) {
                str = str.substring(0, i) + build(str.charAt(i)) + str.substring(i + 1);
                i += 2;
            }
        }
        System.out.println(str);
    }

    public static String build(char c) {
        String str = c + "";
        char nextC = c;
        char oppositeC = c;
        while (true) {
            c++;
            oppositeC--;
            if (checkVowel(c)) {
                if (checkVowel(oppositeC)) {
                    str += oppositeC;
                } else {
                    str += c;
                }
                break;
            } else if (checkVowel(oppositeC)) {
                str += oppositeC;
                break;
            }
        }
        //Complete adding vowel
        if (str.charAt(0) == 'z') {
            str += 'z';
        } else {
            while (true) {
                nextC++;
                if (!checkVowel(nextC)) {
                    str += nextC;
                    break;
                }
            }
        }
        return str;
    }

    public static boolean checkVowel(char key) {
        for (char temp : vowels) {
            if (temp == key) return true;
        }
        return false;
    }
}
