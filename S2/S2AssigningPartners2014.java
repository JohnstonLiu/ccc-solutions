import java.util.Scanner;

public class S2AssigningPartners2014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        sc.nextLine();
        String[] A = sc.nextLine().split(" ");
        String[] B = sc.nextLine().split(" ");
        boolean flag = false;
        label:
        for (int i = 0; i < d; i++) {
            String ref = B[i];
            if (A[i].equals(ref)) {
                System.out.println("bad");
                flag = true;
                break label;
            }
            for (int j = 0; j < d; j++) {

                if (A[i].equals(B[j])) {
                    if (!(A[j].equals(ref))) {
                        System.out.println("bad");
                        flag = true;
                        break label;
                    }
                }

            }
        }

        if (!flag) System.out.println("good");

    }
}
