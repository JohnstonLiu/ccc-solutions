import java.util.Scanner;

J3;

public class J3AreWeThere2018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ab = sc.nextInt();
        int bc = sc.nextInt();
        int cd = sc.nextInt();
        int de = sc.nextInt();
        System.out.println(0 + " " + (ab) + " " + (ab + bc) + " " + (ab + bc + cd) + " " + (ab + bc + cd + de));
        System.out.println((ab) + " " + 0 + " " + (bc) + " " + (bc + cd) + " " + (bc + cd + de));
        System.out.println((ab + bc) + " " + (bc) + " " + 0 + " " + (cd) + " " + (cd + de));
        System.out.println((ab + bc + cd) + " " + (bc + cd) + " " + (cd) + " " + 0 + " " + (de));
        System.out.println((ab + bc + cd + de) + " " + (bc + cd + de) + " " + (cd + de) + " " + (de) + " " + 0);
    }
}
