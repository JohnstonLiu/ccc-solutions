import java.util.*;

public class J2UpDown2010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int s = sc.nextInt();

        int byron= 0;
        int nikky= 0;
        int bS = s;
        int nS = s;


        int profit = a - b;
        int x = a + b;
        if (x > nS){
            nikky += a;
            nikky -= nS - a;
        }else{
            int rem = nS % x;
            nS/=x;
            nikky = nS*profit + rem;
        }


        int profit0 = c - d;
        int y = c + d;
        if (x > bS){
            byron += c;
            byron -= bS - c;
        }else{
            int rem0 = bS % y;
            bS/=y;
            byron = bS*profit0 + rem0;
        }


        if (nikky == byron){
            System.out.println("Tied");
        }else if (nikky > byron){
            System.out.println("Nikky");
        }else{
            System.out.println("Byron");
        }
    }
}
