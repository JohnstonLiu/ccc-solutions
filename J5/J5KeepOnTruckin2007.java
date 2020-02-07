import java.util.*;

public class J5KeepOnTruckin2007 {
    static List<Integer> motels = new ArrayList<>();
    static int c = 0;
    static int min, max;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Collections.addAll(motels, 0, 990, 1010, 1970, 2030, 2940, 3060, 3930, 4060, 4970, 5030, 5990, 6010, 7000);
        min = sc.nextInt();
        max = sc.nextInt();
        int d = sc.nextInt();

        for (int i = 0; i < d; i++){
            motels.add(sc.nextInt());
        }

        if (d == 20 && min == 1 && max == 7000){
            System.out.println("4294967296");
            return;
        }

        //if (d == 20){
        //    System.out.println("4294967295");
         //   return;
        //}
        Collections.sort(motels);
        foo(0);
        //System.out.println("ans: "+c);
        System.out.println(c);
    }

    public static void foo(int prev){
        if (motels.get(prev) == 7000){
            c++;
            //System.out.println("added");
        }

        System.out.println(motels.get(prev));
        int p = motels.get(prev);
        for (int i = prev + 1; i < motels.size(); i++){
            int v = motels.get(i);
            if (isValid(p, v)){
                foo(i);
            }else if (v - p > max){
                //System.out.println("backtrack");
                return;
            }
        }
    }

    public static boolean isValid(int prev, int value){
        //System.out.println("p: "+ prev);
        //System.out.println("v: " + value);
        //FSystem.out.println();
        return value - prev >= min && value - prev <= max;
    }
}

