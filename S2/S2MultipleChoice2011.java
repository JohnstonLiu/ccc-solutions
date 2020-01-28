import java.util.*;

public class S2MultipleChoice2011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int counter = 0;
        sc.nextLine();
        char[] a = new char[d];
        for (int i = 0; i < d; i++){
            a[i] = sc.next().charAt(0);
        }

        for (int i = 0; i < d; i++){
            char c = sc.next().charAt(0);
            if (c == a[i]){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
