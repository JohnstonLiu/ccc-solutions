import java.util.Scanner;

public class J4FavouriteTimes2017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int answer;
        if (d > 720) {
            answer = (d / 720) * 31;
            System.out.println(answer + findPatterns(d % 720));
        } else {
            System.out.println(findPatterns(d));
        }
    }

    public static int findPatterns(int endMin) {
        int time = 1200;
        int counter = 0;
        for (int i = 0; i < endMin + 1; i++) {
            if (isPattern(time)) {
                counter++;
            }
            if (time % 100 == 59) {
                if (time / 100 == 12) {
                    time = 100;
                } else
                    time = (time / 100 + 1) * 100;
            } else
                time++;
        }
        return counter;
    }

    public static boolean isPattern(int p) {
        String str = p + "";
        int d = Integer.parseInt(str.substring(1, 2)) - Integer.parseInt(str.substring(0, 1));
        boolean flag = Integer.parseInt(str.substring(2, 3)) - Integer.parseInt(str.substring(1, 2)) == d;
        if (str.length() > 3) {
            return Integer.parseInt(str.substring(3, 4)) - Integer.parseInt(str.substring(2, 3)) == d && flag;
        } else {
            return flag;
        }
    }
}
