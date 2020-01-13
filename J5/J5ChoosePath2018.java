import java.util.*;

public class J5ChoosePath2018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Page> book = new HashMap<>();
        int pages = sc.nextInt();

        for (int i = 1; i <= pages; i++) {

            Page currPage = new Page(i);
            int links = sc.nextInt();

            for (int j = 0; j < links; j++) {
                currPage.addLink(sc.nextInt());
            }

            book.put(i, currPage);

        }
        BFS(book, pages);

    }

    public static void BFS(HashMap<Integer, Page> m, int pages) {
        Queue<List<Page>> q = new LinkedList<>();
        Set<Integer> s = new HashSet<>();
        s.add(1);
        List<Page> path = new ArrayList<>();
        Page p = m.get(1);
        path.add(p);
        q.add(path);
        int shortPath = Integer.MAX_VALUE;

        while (!q.isEmpty()) {
            path = q.poll();
            int len = path.size() - 1;
            p = path.get(len);

            //System.out.println(path);

            if (p.isEnd()) {
                shortPath = Math.min(shortPath, len + 1);
            }

            for (int temp : p.children) {
                if (!s.contains(temp)) {
                    List<Page> tempPath = new ArrayList<>(path);
                    s.add(temp);
                    tempPath.add(m.get(temp));
                    q.add(tempPath);
                }
                //System.out.println(tempPath);
            }
        }
        //System.out.println(s);
        if (s.size() == pages) {
            System.out.println("Y");
        } else {
            System.out.println('N');
        }
        System.out.println(shortPath);
    }
}


class Page {
    public List<Integer> children;
    public int pgNum;

    Page(int pgNum) {
        this.pgNum = pgNum;
        children = new ArrayList<>();
    }

    public void addLink(int pgNum) {
        children.add(pgNum);
    }

    public String toString() {
        return pgNum + " " + children;
    }

    public boolean isEnd() {
        return children.size() == 0;
    }

}
