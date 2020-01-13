import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class S3RoboThieves2018 {
    private static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static char[][] map;
    public static int[][] output;
    public static int rows;
    public static int cols;
    public static Queue<Integer> cameras;
    public static Node start;

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        rows = sc.nextInt();
        cols = sc.nextInt();
        map = new char[rows][cols];
        output = new int[rows][cols];
        cameras = new LinkedList<>();


        for (int i = 0; i < rows; i++) {
            String str = sc.nextLine();
            for (int j = 0; j < cols; j++) {
                char c = str.charAt(j);
                if (c == 'C') {
                    cameras.add(i);
                    cameras.add(j);
                } else if (c == '.') {
                    output[i][j] = -1;
                }
                map[i][j] = c;
            }
        }

        fixMap();
        //printMap();


        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == 'X') {
                    map[i][j] = 'W';
                } else if (map[i][j] == 'S') {
                    start = new Node(i, j, 0);
                }
            }
        }

        if (start != null) {
            BFS();
        }
        printOutput();
    }

    public static void BFS() {
        Queue<Node> q = new LinkedList<>();
        q.add(start);

        while (!q.isEmpty()) {
            start = q.poll();
            //if (start.getType() == '.'){

            //output[start.r][start.c] = start.len;
            //System.out.println("start: "+start);
            //}

            //printMap();

            for (Node temp : start.getChildren()) {
                //System.out.println(start.getChildren());
                S3RoboThieves2018.map[temp.r][temp.c] = 'W';
                output[temp.r][temp.c] = temp.len;
                q.add(temp);
                //System.out.println("added "+temp);
            }
        }
    }

    public static void fixMap() {
        while (!cameras.isEmpty()) {
            int r = cameras.poll();
            int c = cameras.poll();
            checkCam(r, c);
            //map[r][c] = 'W';
        }
    }

    public static void checkCam(int r, int c) {
        for (int i = r; map[i][c] != 'W'; i++) {
            if (map[i][c] == '.' || map[i][c] == 'S') {
                map[i][c] = 'X';
            }
        }

        for (int i = r; map[i][c] != 'W'; i--) {
            if (map[i][c] == '.' || map[i][c] == 'S') {
                map[i][c] = 'X';
            }
        }

        for (int i = c; map[r][i] != 'W'; i++) {
            if (map[r][i] == '.' || map[r][i] == 'S') {
                map[r][i] = 'X';
            }
        }

        for (int i = c; map[r][i] != 'W'; i--) {
            if (map[r][i] == '.' || map[r][i] == 'S') {
                map[r][i] = 'X';
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }

    public static void printOutput() {
        for (int[] temp : output) {
            for (int n : temp) {
                if (n != 0) {
                    System.out.println(n);
                }
            }
        }
    }
}

class Node {
    public int r;
    public int c;
    public int len;
    //public char type;
    //public List<.Node> children;

    public Node(int r, int c, int len) {
        this.len = len;
        this.r = r;
        this.c = c;
        //type = .S3RoboThieves2018.map[r][c];
    }

    public char getType() {
        return S3RoboThieves2018.map[r][c];
    }

    public List<Node> getChildren() {
        List<Node> children = new ArrayList<>();
        Node temp;

        temp = verifyChild(r + 1, c);
        if (temp != null) {
            children.add(temp);
        }

        temp = verifyChild(r - 1, c);
        if (temp != null) {
            children.add(temp);
        }

        temp = verifyChild(r, c + 1);
        if (temp != null) {
            children.add(temp);
        }

        temp = verifyChild(r, c - 1);
        if (temp != null) {
            children.add(temp);
        }

        //this.children = children; //for debugging
        return children;
    }

    public Node verifyChild(int r, int c) {
        while (S3RoboThieves2018.map[r][c] != 'W') {
            char ch = S3RoboThieves2018.map[r][c];
            if (ch == 'U') {
                S3RoboThieves2018.map[r][c] = 'W';
                r--;
            } else if (ch == 'D') {
                S3RoboThieves2018.map[r][c] = 'W';
                r++;
            } else if (ch == 'R') {
                S3RoboThieves2018.map[r][c] = 'W';
                c++;
            } else if (ch == 'L') {
                S3RoboThieves2018.map[r][c] = 'W';
                c--;
            } else if (S3RoboThieves2018.map[r][c] == '.') {
                //.S3RoboThieves2018.map[r][c] = 'W';
                return new Node(r, c, len + 1);
            } else if (S3RoboThieves2018.map[r][c] == 'S') {
                return null;
            } else if (S3RoboThieves2018.map[r][c] == 'C') {
                return null;
            }
        }
        return null;
    }

    public String toString() {
        return "(" + r + "," + c + ") " + len;
    }
}





