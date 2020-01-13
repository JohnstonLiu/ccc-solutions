import java.util.Scanner;

public class J3IronScaling2012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] options = {"*x*", " xx", "* *"};
        String str;
        int d = sc.nextInt();
        for (int n = 0; n < 3; n++) {
            str = options[n];
            for (int k = 0; k < d; k++) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < d; j++) {
                        System.out.print(str.charAt(i));
                    }
                }
                System.out.println();
            }
        }
    }
}
