import java.util.*;

public class S2Spirals2001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int dif = b - a + 1;

        if (dif == 2){
            System.out.println(a);
            System.out.println(b);
        }else if (dif == 3){
            System.out.println(a++);
            System.out.println(a++ +" "+ a);
        }else if (dif == 4){
            System.out.println(a++ +" "+ (a+2));
            System.out.println(a++ + " "+ a);
        }else if (dif == 1){
            System.out.println(a);
        }else {

            int width = (int) Math.sqrt(dif);
            int height = width;
            if (dif != width * height) {
                height++;

                if (dif > width * width + width) {
                    width++;
                }
            }

            int[][] spiral = new int[height][width];

            int r = height / 2;
            int c = width / 2;
            if (height % 2 == 0) {
                r--;
            }
            if (width % 2 == 0) {
                c--;
            }


            spiral[r][c] = a++;
            spiral[r + 1][c] = a++;
            spiral[r + 1][c + 1] = a++;
            spiral[r][c + 1] = a++;

            r--;
            c++;

            int dir = 0;
            for (int i = a; i <= b; i++) {

                spiral[r][c] = i;
                switch (dir) {
                    case 0:
                        if (spiral[r + 1][c] == 0) {
                            dir = turn(dir);
                            i--;
                        } else {
                            c--;
                        }

                        break;
                    case 1:
                        if (spiral[r][c + 1] == 0) {
                            dir = turn(dir);
                            i--;
                        } else {
                            r++;
                        }
                        break;
                    case 2:
                        if (spiral[r - 1][c] == 0) {
                            dir = turn(dir);
                            i--;
                        } else {
                            c++;
                        }
                        break;
                    case 3:
                        if (spiral[r][c - 1] == 0) {
                            dir = turn(dir);
                            i--;
                        } else {
                            r--;
                        }
                        break;
                }

            }
            print(spiral);
        }
    }

    public static int turn(int dir){
        dir++;
        return dir % 4;
    }

    public static void print(int[][] a){
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++){
                int temp = a[i][j];
                if (temp == 0){
                    System.out.print("   ");
                }else if (temp < 10){
                    System.out.print(" " + temp + " ");
                }else{
                    System.out.print(temp+" ");
                }
            }
            System.out.println();
        }
    }
}
