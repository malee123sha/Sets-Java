import java.util.Iterator;
import java.util.TreeSet;
public class SetTree {
    public static void main(String[] args) {
        TreeSet <String> ts = new TreeSet<>();
        ts.add("One");
        ts.add("Two");
        ts.add("Three");
        ts.add("Four");
        ts.add("Five");
        Iterator<String> i = ts.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
