import java.util.*;

public class J5KeepOnTruckin2007{
    static List<Integer> motels = new ArrayList<>();
    public static void main(String[]args) {
        Collections.addAll(motels,0, 990, 1010, 1970, 2030, 2940, 3060, 3930, 4060, 4970, 5030, 5990, 6010, 7000);
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = sc.nextInt();
        for(int i = 0; i < m; i++){
            motels.add(sc.nextInt());
        }
        long dp[] = new long[motels.size()]; dp[0] = 1;
        Collections.sort(motels);
        for(int i = 1; i < motels.size(); i++) {
            for(int j = 0; j < i; j++) {
                int valid = motels.get(i) - motels.get(j);
                if(valid >= a && valid <= b) dp[i] += dp[j];//dp tracks the number of paths that have crossed over the certain motel; we add to the valid next motel our previous branches because they can all go there
            }
        }
        System.out.println(dp[motels.size() - 1]);//we print the number of paths that reached 7000, our destination
    }
}