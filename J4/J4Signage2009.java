import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J4Signage2009 {

    public static ArrayList<String> a = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Collections.addAll(a, "WELCOME", "TO", "CCC", "GOOD", "LUCK", "TODAY");
        int length = sc.nextInt();
        while (!a.isEmpty()) {
            String l = make(length);
            l = addSpace(l, length);
            System.out.println(l);
        }
    }

    public static String addSpace(String str, int length) {
        if (str.length() == length) return str;
        if (!str.contains("."))
            str += '.';

        length -= str.length();
        while (length > 0) {
            for (int i = 0; i < str.length(); i++) {
                if (length > 0 && str.charAt(i) == '.') {
                    str = str.substring(0, i) + '.' + str.substring(i);
                    length--;
                    while (i < str.length() && str.charAt(i) == '.') {
                        i++;
                    }
                }
            }
        }
        return str;
    }

    public static String make(int length) {
        String line = a.remove(0);
        while (!a.isEmpty() && line.length() + 1 + a.get(0).length() <= length) {
            line += "." + a.remove(0);
        }
        return line;
    }
}
