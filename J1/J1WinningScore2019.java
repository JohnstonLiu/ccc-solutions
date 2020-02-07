import java.util.*;

public class J1WinningScore2019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        a += sc.nextInt()*3;
        a += sc.nextInt()*2;
        a += sc.nextInt();

        b += sc.nextInt()*3;
        b += sc.nextInt()*2;
        b += sc.nextInt();


        if (a > b){
            System.out.println("A");
        }else if (a < b){
            System.out.println("B");
        }else{
            System.out.println("T");
        }

    }
}
