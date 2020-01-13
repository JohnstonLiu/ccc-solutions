import java.util.Scanner;

public class J4ArrivalTime2016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.nextLine();

        for (int i = 0; i < 120; i++) {
            if (isTraffic(time)) {
                time = addMin(time, 2);
            } else {
                time = addMin(time, 1);
            }
        }
        System.out.println(time);
    }

    public static boolean isTraffic(String line) {
        return (convertMin(line) >= 420 && convertMin(line) < 600) || (convertMin(line) >= 900 && convertMin(line) < 19 * 60);
    }

    public static String addMin(String time, int inc) {
        int current = convertMin(time);
        current += inc;
        return convertTime(current);

    }

    public static int convertMin(String time) {
        int hours = Integer.parseInt(time.substring(0, 2));
        int minutes = Integer.parseInt(time.substring(3));
        return hours * 60 + minutes;
    }


    public static String convertTime(int minutes) {
        int hours = minutes / 60;
        minutes = minutes % 60;
        if (hours >= 24) {
            hours -= 24;
        }

        if (hours < 10) {
            if (minutes < 10) {
                return "0" + hours + ":" + "0" + minutes;
            } else {
                return "0" + hours + ":" + minutes;
            }
        } else {
            if (minutes < 10) {
                return hours + ":" + "0" + minutes;
            } else {
                return hours + ":" + minutes;
            }
        }
    }
}
