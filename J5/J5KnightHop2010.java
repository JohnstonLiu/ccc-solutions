import java.util.*;

public class J5KnightHop2010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Point knight = new Point(sc.nextInt(), sc.nextInt());
        Point p = new Point(sc.nextInt(), sc.nextInt());

        System.out.println(BFS(knight, p));
    }

    public static int BFS(Point knight, Point p) {
        Queue<List<Point>> q = new LinkedList<>();
        List<Point> path = new ArrayList<>();

        path.add(p);
        q.add(path);

        while (!q.isEmpty()) {
            path = q.poll();
            int len = path.size() - 1;
            p = path.get(len);

            //System.out.println(path);
            if (p.equals(knight)) {
                return len;
            }

            for (Point temp : p.getMoves()) {
                List<Point> tempPath = new ArrayList<>(path);
                tempPath.add(temp);
                q.add(tempPath);

                //System.out.println(tempPath);
            }
        }
        return -1;
    }


}

class Point {
    public int x;
    public int y;


    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public ArrayList<Point> getMoves() {
        ArrayList<Point> possiblePoints = new ArrayList<>();

        Point p = new Point(x - 2, y + 1);
        if (p.isValid()) {
            possiblePoints.add(p);
        }

        p = new Point(x - 1, y + 2);
        if (p.isValid()) {
            possiblePoints.add(p);
        }

        p = new Point(x + 2, y + 1);
        if (p.isValid()) {
            possiblePoints.add(p);
        }

        p = new Point(x + 1, y + 2);
        if (p.isValid()) {
            possiblePoints.add(p);
        }

        p = new Point(x - 2, y - 1);
        if (p.isValid()) {
            possiblePoints.add(p);
        }

        p = new Point(x - 1, y - 2);
        if (p.isValid()) {
            possiblePoints.add(p);
        }

        p = new Point(x + 2, y - 1);
        if (p.isValid()) {
            possiblePoints.add(p);
        }

        p = new Point(x + 1, y - 2);
        if (p.isValid()) {
            possiblePoints.add(p);
        }
        return possiblePoints;
    }

    public boolean isValid() {
        return x > 0 && x < 9 && y < 9 && y > 0;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public boolean equals(Point p) {
        return this.x == p.x && this.y == p.y;
    }
}
