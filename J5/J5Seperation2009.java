import java.util.*;

public class J5Seperation2009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Node> map = makeGraph();

        while (true) {
            Node fx = null;
            Node fy = null;
            int x, y;
            switch (sc.next()) {
                case "i":
                    x = sc.nextInt();
                    y = sc.nextInt();

                    if (!map.containsKey(x)) {
                        map.put(x, new Node(x));
                    }
                    if (!map.containsKey(y)) {
                        map.put(y, new Node(y));
                    }

                    fx = map.get(x);
                    fy = map.get(y);
                    fx.addChild(fy);
                    fy.addChild(fx);
                    break;
                case "d":
                    x = sc.nextInt();
                    y = sc.nextInt();

                    fx = map.get(x);
                    fy = map.get(y);
                    if (map.containsKey(x)) {
                        fx.removeChild(fy);
                    }

                    if (map.containsKey(y)) {
                        fy.removeChild(fx);
                    }
                    break;
                case "n":
                    x = sc.nextInt();
                    fx = map.get(x);
                    System.out.println(fx.size());
                    break;
                case "f":
                    x = sc.nextInt();
                    Set<Node> s = new HashSet<>();
                    fx = map.get(x);
                    for (Node temp : fx.children) {
                        s.add(temp);
                        for (Node moreTemp : temp.children) {
                            s.add(moreTemp);
                        }
                    }
                    System.out.println(s.size() - fx.size() - 1);
                    break;
                case "s":
                    x = sc.nextInt();
                    y = sc.nextInt();
                    if (map.containsKey(x)) {
                        fx = map.get(x);
                    }

                    if (map.containsKey(y)) {
                        fy = map.get(y);
                    }

                    int deg = getSeparation(fx, fy);
                    if (deg != -1) {
                        System.out.println(deg);
                    } else {
                        System.out.println("Not connected");
                    }

                    break;
                case "q":
                    return;
            }
        }
    }

    public static int getSeparation(Node fx, Node find) {
        if (fx == null || find == null)
            return -1;

        Set<Node> traversed = new HashSet<>();
        Queue<List<Node>> q = new LinkedList<>();
        List<Node> l = new ArrayList<>();

        l.add(fx);
        q.add(l);
        traversed.add(fx);

        while (true) {
            l = q.poll();
            int len = l.size() - 1;
            fx = l.get(len);
            if (fx.name == find.name) {
                return len;
            }

            for (Node temp : fx.children) {
                if (!traversed.contains(temp)) {
                    traversed.add(temp);
                    List<Node> l2 = new ArrayList<>(l);
                    l2.add(temp);
                    q.add(l2);
                }

            }
            if (q.isEmpty()) {
                break;
            }
        }
        return -1;
    }

    public static Map<Integer, Node> makeGraph() {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);
        Node i = new Node(9);
        Node j = new Node(10);
        Node k = new Node(11);
        Node l = new Node(12);
        Node m = new Node(13);
        Node n = new Node(14);
        Node o = new Node(15);
        Node p = new Node(16);
        Node q = new Node(17);
        Node r = new Node(18);
        Collections.addAll(a.children, f);
        Collections.addAll(b.children, f);
        Collections.addAll(c.children, o, f, d, e);
        Collections.addAll(d.children, f, c, e);
        Collections.addAll(e.children, f, d, c);
        Collections.addAll(f.children, a, b, g, e, d, c);
        Collections.addAll(g.children, f, h);
        Collections.addAll(h.children, g, i);
        Collections.addAll(i.children, h, j, l);
        Collections.addAll(j.children, k, i);
        Collections.addAll(k.children, j, l);
        Collections.addAll(l.children, k, i, m);
        Collections.addAll(m.children, l, n, o);
        Collections.addAll(n.children, m);
        Collections.addAll(o.children, m, c);
        Collections.addAll(p.children, q, r);
        Collections.addAll(q.children, r, p);
        Collections.addAll(r.children, q, p);

        Map<Integer, Node> map = new HashMap<>();
        map.put(1, a);
        map.put(2, b);
        map.put(3, c);
        map.put(4, d);
        map.put(5, e);
        map.put(6, f);
        map.put(7, g);
        map.put(8, h);
        map.put(9, i);
        map.put(10, j);
        map.put(11, k);
        map.put(12, l);
        map.put(13, m);
        map.put(14, n);
        map.put(15, o);
        map.put(16, p);
        map.put(17, q);
        map.put(18, r);
        return map;
    }
}

class Node {
    public int name;
    public List<Node> children;

    public Node(int v) {
        name = v;
        children = new ArrayList<>();
    }

    public Node get(int i) {
        return children.get(i);
    }

    public int size() {
        return children.size();
    }

    public void removeChild(Node c) {
        children.remove(c);
    }

    public void addChild(Node c) {
        children.add(c);
    }

    public String toString() {
        return "" + name;
    }
}