import java.util.*;

public class S2HighTide2017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int tides[] = new int[d];
        for (int i = 0; i < d; i++){
            tides[i] = sc.nextInt();
        }
        Arrays.sort(tides);
        //System.out.println(Arrays.toString(tides));
        if (d % 2 == 0){
            for (int i = d/2, j = d/2 - 1; j >= 0; i++, j--){
                System.out.print(tides[j]+" "+tides[i] + " ");
            }
        }else{
            for (int i = d/2 + 1, j = d/2; j >= 0; i++, j--){
                try{
                    System.out.print(tides[j]+" "+tides[i] + " ");
                }catch (Exception e){
                    System.out.print(tides[j]);
                }

            }
        }
    }
}
