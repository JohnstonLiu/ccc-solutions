import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.*;

public class J5RuleOfThree2019 {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("xyz.txt");
        PrintStream printStreamToFile = new PrintStream(file);
        System.setOut(printStreamToFile);

        Scanner sc = new Scanner(System.in);
        Rule[] r = new Rule[3];
        r[0] = new Rule(sc.next(), sc.next());
        r[1] = new Rule(sc.next(), sc.next());
        r[2] = new Rule(sc.next(), sc.next());

        int depth = sc.nextInt();
        String start = sc.next();
        String end = sc.next();

        long startTime = System.nanoTime();

        int i = 0;
        for (Step temp : BFS(new Step(start), new Step(end), depth, r)) {
            if (i != 0) {
                System.out.println(temp);
            }
            i++;
        }

        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println((double) totalTime / 1000000000);
    }

    public static List<Step> BFS(Step start, Step end, int depth, Rule[] r) {
        Queue<List<Step>> q = new LinkedList<>();
        List<Step> path = new ArrayList<>();

        path.add(start);
        q.add(path);

        while (!q.isEmpty()) {
            path = q.poll();
            int len = path.size() - 1;
            start = path.get(len);

            //if (start.value.length()  > end.value.length() + 3){ continue; }

            if (len >= depth) {
                if (start.value.equals(end.value)) {
                    return path;
                } else {
                    continue;
                }
            }

            System.out.println(path + " " + path.size());

            for (Step s : getChildren(start.value, r)) {
                List<Step> tempPath = new ArrayList<>(path);
                tempPath.add(s);
                q.add(tempPath);
                //System.out.println(tempPath);
            }
        }
        return null;
    }

    public static ArrayList<Step> getChildren(String start, Rule[] r) {
        ArrayList<Step> steps = new ArrayList<>();
        int i = 0;

        for (Rule rule : r) {
            //if (!start.contains(rule.prev))continue;

            for (int index : getIndices(start, rule)) {
                String temp = replaceNth(start, rule, index);
                steps.add(new Step(temp, i, index));
            }
            i++;
        }
        return steps;

    }


    public static String replaceNth(String str, Rule r, int index) {
        return str.substring(0, index) + r.next + str.substring(index + r.prev.length());
    }

    public static ArrayList<Integer> getIndices(String start, Rule r) {
        ArrayList<Integer> indices = new ArrayList<>();
        int ruleLen = r.prev.length();

        for (int i = 0; i < start.length() - ruleLen + 1; i++) {
            if (start.substring(i, i + ruleLen).equals(r.prev)) {
                indices.add(i);
            }
        }
        return indices;
    }
}

class Rule {
    public String prev;
    public String next;

    Rule(String prev, String next) {
        this.prev = prev;
        this.next = next;
    }


}

class Step {
    public String value;
    public int rule;
    public int index;

    Step(String value) {
        this.value = value;
    }

    Step(String value, int rule, int index) {
        this.rule = rule;
        this.value = value;
        this.index = index;
    }

    public String toString() {
        return (rule + 1) + " " + (index + 1) + " " + value;
    }


}
