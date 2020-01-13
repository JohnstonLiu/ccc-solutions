import java.util.Scanner;

public class J3ColdCompress2019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 1;
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            for (int j = 0; j < str.length(); j++) {
                if (j != str.length() - 1 && str.charAt(j) == str.charAt(j + 1)) {
                    counter++;
                } else {
                    System.out.print(counter + " " + str.charAt(j) + " ");
                    counter = 1;
                }
            }
            System.out.println();
        }
    }
}
