import java.util.*;

public class J4CrossSpiral2005 {
    static int[][] cross;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();
        int height = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        int steps = sc.nextInt();
        cross = new int[height][width];
        int x = 0, y = 0;

        for (int i = 0; i < h; i++){//Setup Box
            for (int j = 0; j < w; j++){
                cross[i][j] = 1;
                cross[i][width - j - 1] = 1;

                cross[height-i - 1][j] = 1;
                cross[height-i-1][width - j - 1] = 1;

                if (i == h - 1 && j == w - 1){
                    x = j + 1;
                }
            }
        }

        boolean flag = true;
        cross[y][x] = 1;
        for (int i = 0; i < steps; i++){
            //printCross();
            if (flag){
                if (x + 1 != width && cross[y][x+1] != 1){
                    x++;
                    cross[y][x] = 1;
                }else if (y + 1 != height && cross[y+1][x] != 1){
                    y++;
                    cross[y][x] = 1;
                }else if (x - 1 != -1 && cross[y][x-1] != 1){
                    x--;
                    cross[y][x] = 1;
                }else if ((x - 1 == -1 || cross[y][x-1] == 1) && (x + 1 == width || cross[y][x+1] == 1) && (y + 1 == height || cross[y+1][x] == 1) && (y - 1 == -1 || cross[y-1][x] == 1)){
                    System.out.println((x+1)+"\n"+(y+1));
                    return;
                }else{
                    flag = false;
                    i--;
                }
            }else{
                if (x - 1 != -1 && cross[y][x-1] != 1){
                    x--;
                    cross[y][x] = 1;
                } else if (y - 1 != -1 && cross[y-1][x] != 1){
                    y--;
                    cross[y][x] = 1;
                } else if (x + 1 != width && cross[y][x+1] != 1){
                    x++;
                    cross[y][x] = 1;
                }else if ((x - 1 == -1 || cross[y][x-1] == 1) && (x + 1 == width || cross[y][x+1] == 1) && (y + 1 == height || cross[y+1][x] == 1) && (y - 1 == -1 || cross[y-1][x] == 1)){
                    System.out.println((x+1)+"\n"+(y+1));
                    return;
                }else{
                    flag = true;
                    i--;
                }
            }
        }

        System.out.println((x+1)+"\n"+(y+1));

        //printCross();
    }

    public static void printCross(){
        for (int i = 0; i < cross.length; i++){
            System.out.println(Arrays.toString(cross[i]));
        }
        System.out.println();
    }
}
