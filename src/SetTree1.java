import java.util.Collections;
import java.util.TreeSet;
public class SetTree1 {
    public static void main(String[] args) {
        TreeSet <Integer> t = new TreeSet<>();
        t.add(48);
        t.add(132);
        t.add(24);
        t.add(30);
        System.out.println(t);
        System.out.println("---------------------");
        System.out.println("Use poll method");
        System.out.println("Lowest Value  :- "+t.pollFirst());
        System.out.println("Highest Value :- "+t.pollLast());
        System.out.println("---------------------");
        System.out.println("Use min & max methods");
        System.out.println("Minimum Value :- "+Collections.min(t));
        System.out.println("Maximum Value :- "+Collections.max(t));
    }
}
