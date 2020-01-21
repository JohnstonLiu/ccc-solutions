import java.util.*;

public class J4BabblingBrooks2000 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> streams = new ArrayList<>();
        int d = sc.nextInt();
        for (int i = 0; i < d; i++){
            streams.add(sc.nextInt());
        }

        while(true) {
            int n;
            int percent;
            switch(sc.nextInt()){
               case 99:
                    n = sc.nextInt();
                    percent = sc.nextInt();

                    int a = (int)(streams.get(n-1) * (percent/100.0));
                    streams.set(n-1, streams.get(n-1) - a);
                    streams.add(n-1, a);
                    break;
                case 88:
                    n = sc.nextInt();
                    streams.set(n-1, streams.get(n-1) + streams.get(n));
                    streams.remove(n);
                    break;
                default:
                    for (int temp : streams){
                        System.out.print(temp+" ");
                    }
                    return;
            }
        }



    }
}
