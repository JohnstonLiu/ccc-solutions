import java.util.Scanner;

public class J3Punchy2010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, A = 0, B = 0;

        while (true) {
            switch (sc.next()) {
                case "1":
                    if (sc.next().equals("A"))
                        A = sc.nextInt();
                    else
                        B = sc.nextInt();

                    break;
                case "2":
                    if (sc.next().equals("A"))
                        System.out.println(A);
                    else
                        System.out.println(B);

                    break;
                case "3":
                    if (sc.next().equals("A")) {
                        if (sc.next().equals("A"))
                            A += A;
                        else
                            A += B;
                    } else {
                        if (sc.next().equals("A"))
                            A += A;
                        else
                            A += B;
                    }

                    break;
                case "4":
                    if (sc.next().equals("A")) {
                        if (sc.next().equals("A"))
                            A *= A;
                        else
                            A *= B;
                    } else {
                        if (sc.next().equals("A"))
                            B *= A;
                        else
                            B *= B;
                    }

                    break;
                case "5":
                    if (sc.next().equals("A")) {
                        if (sc.next().equals("A"))
                            A -= A;
                        else
                            A -= B;
                    } else {
                        if (sc.next().equals("A"))
                            B -= A;
                        else
                            B -= B;
                    }

                    break;
                case "6":
                    if (sc.next().equals("A")) {
                        if (sc.next().equals("A"))
                            A /= A;
                        else
                            A /= B;
                    } else {
                        if (sc.next().equals("A"))
                            B /= A;
                        else
                            B /= B;
                    }

                    break;
                case "7":
                    return;
            }
        }
    }
}
