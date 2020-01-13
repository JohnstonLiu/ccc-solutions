import java.util.Arrays;
import java.util.Scanner;

public class J4Anagram2007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] c = sc.nextLine().replaceAll(" ", "").toCharArray();
        char[] c0 = sc.nextLine().replaceAll(" ", "").toCharArray();
        Arrays.sort(c);
        Arrays.sort(c0);
        if (Arrays.equals(c, c0)) System.out.println("Is an anagram.");
        else System.out.println("Is not an anagram.");
    }
}
