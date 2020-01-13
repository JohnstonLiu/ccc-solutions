import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J4Boring2011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> danger = new ArrayList<>();
        Collections.addAll(danger, "0 -1", "0 -2", "0 -3", "1 -3", "2 -3", "3 -3", "3 -4", "3 -5", "4 -5", "5 -5", "5 -4", "5 -3", "6 -3", "7 -3", "7 -4", "7 -5", "7 -6", "7 -7", "6 -7", "5 -7", "4 -7", "3 -7", "2 -7", "1 -7", "0 -7", "-1 -7", "-1 -6", "-1 -5");
        int[] point = {-1, -5};
        label:
        while (true) {
            boolean flag = false;
            switch (sc.next()) {
                case "l":
                    int num = sc.nextInt();
                    for (int i = 0; i < num; i++) {
                        point[0] -= 1;
                        if (check(danger, point)) {
                            flag = true;
                        } else
                            danger.add(point[0] + " " + point[1]);
                        if (i == num - 1) {
                            if (flag) {
                                System.out.println(point[0] + " " + point[1] + " DANGER");
                                break label;
                            } else {
                                System.out.println(point[0] + " " + point[1] + " safe");
                            }
                        }
                    }
                    break;
                case "r":
                    int num0 = sc.nextInt();
                    for (int i = 0; i < num0; i++) {
                        point[0] += 1;
                        if (check(danger, point)) {
                            flag = true;
                        } else
                            danger.add(point[0] + " " + point[1]);
                        if (i == num0 - 1) {
                            if (flag) {
                                System.out.println(point[0] + " " + point[1] + " DANGER");
                                break label;
                            } else {
                                System.out.println(point[0] + " " + point[1] + " safe");
                            }
                        }
                    }
                    break;
                case "u":
                    int num1 = sc.nextInt();
                    for (int i = 0; i < num1; i++) {
                        point[1] += 1;
                        if (check(danger, point)) {
                            flag = true;
                        } else
                            danger.add(point[0] + " " + point[1]);
                        if (i == num1 - 1) {
                            if (flag) {
                                System.out.println(point[0] + " " + point[1] + " DANGER");
                                break label;
                            } else {
                                System.out.println(point[0] + " " + point[1] + " safe");
                            }
                        }
                    }
                    break;
                case "d":
                    int num2 = sc.nextInt();
                    for (int i = 0; i < num2; i++) {
                        point[1] -= 1;
                        if (check(danger, point)) {
                            flag = true;
                        } else
                            danger.add(point[0] + " " + point[1]);
                        if (i == num2 - 1) {
                            if (flag) {
                                System.out.println(point[0] + " " + point[1] + " DANGER");
                                break label;
                            } else {
                                System.out.println(point[0] + " " + point[1] + " safe");
                            }
                        }
                    }
                    break;
                default:
                    break label;
            }
        }
    }

    public static boolean check(ArrayList<String> danger, int[] point) {
        String comp = point[0] + " " + point[1];
        for (int i = 0; i < danger.size(); i++) {
            if (danger.get(i).equals(comp)) {
                return true;
            }
        }
        return false;
    }
}
