import java.util.*;

public class J5Unfriend2011 {
    public static Set<Set<Integer>> combos = new HashSet<>();
    public static Node[] web = new Node[7];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        //Declares Nodes
        for (int i = 1; i <= N; i++){
            web[i] = new Node(i);
        }

        //Adds friends
        for (int i = 1; i < N; i++){
            int j = sc.nextInt();
            web[j].addFriend(i);
        }
        foo(1, new HashSet<>(), N);

        //System.out.println(combos);
        System.out.println(combos.size());
    }

    public static void foo(int layer, Set<Integer> set, int ceiling){
        if (layer == ceiling){
            combos.add(set);
            return;
        }
        //add
        Set<Integer> a = new HashSet<>(set);
        //System.out.println(web[layer].getAll());
        a.addAll(web[layer].getAll());
        foo(layer+1, a, ceiling);

        //no add
        Set<Integer> b = new HashSet<>(set);
        foo(layer+1, b, ceiling);
    }

    private static class Node{
        int id;
        Set<Integer> invited;

        public Node(int id){
            this.id = id;
            invited = new HashSet<>();
        }

        Set<Integer> getAll(){
            Queue<Integer> q = new LinkedList<>();
            Set<Integer> ret = new HashSet<>();
            q.add(id);
            ret.add(id);
            while(!q.isEmpty()){
                int cur = q.poll();
                for (int temp : web[cur].invited){
                    q.add(temp);
                    ret.add(temp);
                }
            }
            return ret;
        }

        void addFriend(int n){
            invited.add(n);
        }

        public String toString(){
            return id + ": " + invited;
        }

    }
}
