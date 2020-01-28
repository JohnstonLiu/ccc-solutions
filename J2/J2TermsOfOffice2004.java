import java.util.*;

public class J2TermsOfOffice2004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();

        for (int i = start; i <= end; i += 60){
            System.out.println("All positions change in year "+ i);
        }
    }
}
