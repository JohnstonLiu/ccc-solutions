import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class J4WaitTime2015 {
    public static void main(String[] args) {
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> h = new HashMap<>();
        HashMap<Integer, Integer> frozen = new HashMap<>();
        ArrayList<Integer> st = new ArrayList<>();
        int d = sc.nextInt();
        for (int i = 0; i < d; i++) {
            switch (sc.next()) {
                case "R":
                    if (!flag) {
                        h.forEach((k, v) -> {
                            v += 1;
                            h.replace(k, v);
                        });
                    } else
                        flag = false;
                    int key = sc.nextInt();
                    st.add(key);
                    h.remove(key);
                    h.put(key, 0);
                    break;
                case "W":
                    flag = true;
                    int inc = sc.nextInt();
                    h.forEach((k, v) -> {
                        v += inc;
                        h.replace(k, v);
                    });
                    break;
                case "S":
                    if (!flag) {
                        h.forEach((k, v) -> {
                            v += 1;
                            h.replace(k, v);
                        });
                    } else
                        flag = false;
                    int freeze = sc.nextInt();
                    st.remove(new Integer(freeze));
                    if (frozen.containsKey(freeze))
                        frozen.replace(freeze, frozen.get(freeze) + h.get(freeze));
                    else
                        frozen.put(freeze, h.get(freeze));
                    break;
            }
        }
        for (int i = 0; i < st.size(); i++) {
            if (frozen.containsKey(st.get(i)))
                frozen.replace(st.get(i), -1);
            else
                frozen.put(st.get(i), -1);
        }
        ArrayList<Integer> a = new ArrayList<>(frozen.keySet());
        Collections.sort(a);
        for (int temp : a) {
            System.out.println(temp + " " + frozen.get(temp));
        }
    }
}
