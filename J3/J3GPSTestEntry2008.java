import java.util.Arrays;
import java.util.Scanner;

public class J3GPSTestEntry2008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int xPos = 0;
        int yPos = 0;
        int steps = 0;
        int[][] map = {
                {'A', 'B', 'C', 'D', 'E', 'F'},
                {'G', 'H', 'I', 'J', 'K', 'L'},
                {'M', 'N', 'O', 'P', 'Q', 'R'},
                {'S', 'T', 'U', 'V', 'W', 'X'},
                {'Y', 'Z', ' ', '-', '.', 't'}
        };

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < 5; j++) {
                int bs = Arrays.binarySearch(map[j], str.charAt(i));
                if (bs < 0) continue;
                steps += Math.abs(xPos - bs);
                steps += Math.abs(yPos - j);
                yPos = j;
                xPos = bs;
                break;
            }
        }
        steps += Math.abs(xPos - 5);
        steps += Math.abs(yPos - 4);
        System.out.println(steps);
    }
}
