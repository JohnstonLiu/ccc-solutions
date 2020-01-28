import java.util.*;

public class J2ModInverse2001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int start = b/a;
        for (int i = start; i < b; i++){
            if ((a*i)%b == 1){
                System.out.println(i);
                return;
            }
        }
        System.out.println("No such integer exists.");
    }
}
