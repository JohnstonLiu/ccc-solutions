import java.util.*;

public class S2PrettyPrimes2019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        for (int i = 0; i < d; i++){
            int n = sc.nextInt()*2;
            for (int j = 2; j < n; j++){
                if (prime(j) && prime(n-j)){
                    System.out.println(j+" "+(n-j));
                    break;
                }
            }
        }

    }

    public static boolean prime(int n){
        for (int i = 2; i <= (int) (Math.ceil(Math.sqrt(n))); i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
