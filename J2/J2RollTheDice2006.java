import java.util.*;

public class J2RollTheDice2006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int c = 0;
        int[] a = new int[m];
        int[] A = new int[n];
        for (int i = 0; i < Math.max(m,n); i++){
            try{
                a[i] = i + 1;
            }catch (Exception e){

            }

            try{
                A[i] = i + 1;
            }catch (Exception e){

            }
        }
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (a[i] + A[j] == 10){
                    c++;
                }
            }
        }
        if (c == 1){
            System.out.println("There is "+ c+" way to get the sum 10.");
        }else
        System.out.println("There are "+ c+" ways to get the sum 10.");
    }
}
