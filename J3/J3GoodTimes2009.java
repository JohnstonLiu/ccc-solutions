import java.util.Scanner;

public class J3GoodTimes2009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ott = sc.nextInt();
        int[] times = {ott - 300, ott - 200, ott - 100, ott + 100, ott + 130};
        for (int i = 0; i < times.length; i++) {
            if (times[i] < 0) {
                times[i] = 2400 + times[i];
            } else if (times[i] > 2359) {
                times[i] = times[i] - 2400;
            }
            if (times[i] % 100 >= 60) {
                String temp = times[i] / 100 + times[i] % 100 / 60 + "" + times[i] % 100 % 60;
                times[i] = Integer.parseInt(temp);
            }
        }
        System.out.println(ott + " in Ottawa");
        System.out.println(times[0] + " in Victoria");
        System.out.println(times[1] + " in Edmonton");
        System.out.println(times[2] + " in Winnipeg");
        System.out.println(ott + " in Toronto");
        System.out.println(times[3] + " in Halifax");
        System.out.println(times[4] + " in St. John's");
    }
}
