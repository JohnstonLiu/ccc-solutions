import java.util.*;

public class J4CrossSpiral2005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();
        int height = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        int steps = sc.nextInt();
        int corners = 4*w*h;
        int area = width*height - corners;
        System.out.println(area);

    }
}
