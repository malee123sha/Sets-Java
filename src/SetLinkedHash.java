import java.util.Iterator;
import java.util.LinkedHashSet;
public class SetLinkedHash {
    public static void main(String[] args) {
        LinkedHashSet <String> lhs = new LinkedHashSet<>();
        lhs.add("One");
        lhs.add("Two");
        lhs.add("Three");
        lhs.add("Four");
        lhs.add("Five");
        Iterator<String> i = lhs.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
